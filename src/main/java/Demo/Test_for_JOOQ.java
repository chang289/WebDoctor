package Demo;

/**
 * Created by Yibih on 2016/10/11.
 */

// For convenience, always static import your generated tables and jOOQ functions to decrease verbosity:
import static test.generated.Tables.*;
import static org.jooq.impl.DSL.*;
import org.jooq.*;
import org.jooq.impl.*;
import java.sql.*;

public class Test_for_JOOQ {
    public static void main(String[] args) {
        String userName = "root";
        String password = "webdoctor";
        String url = "jdbc:mysql://localhost:3306/library";

        // Connection is the only JDBC resource that we need
        // PreparedStatement and ResultSet are handled by jOOQ, internally
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            // ...
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            create.insertInto(AUTHOR,AUTHOR.ID,AUTHOR.FIRST_NAME,AUTHOR.LAST_NAME)
                    //.values(100,"Yiyan","Zhou")
                    .values(101,"Yibin","Wu")
                    .values(102,"Ketao","Chang")
                    .execute();



            Result<Record>result = create.select().from(AUTHOR).fetch();
            System.out.println();
            for (Record r : result) {
                Integer id = r.getValue(AUTHOR.ID);
                String firstName = r.getValue(AUTHOR.FIRST_NAME);
                String lastName = r.getValue(AUTHOR.LAST_NAME);

                System.out.println("ID: " + id + " first name: " + firstName + " last name: " + lastName);
            }

        }

        // For the sake of this tutorial, let's keep exception handling simple
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}