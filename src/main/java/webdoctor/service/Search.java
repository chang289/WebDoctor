package webdoctor.service;
import static webdoctor.jooq.Tables.*;
import static org.jooq.impl.DSL.*;
import org.jooq.*;
import org.jooq.impl.*;
import java.sql.*;
import java.util.List;

import org.jooq.util.derby.sys.Sys;
import org.springframework.stereotype.Service;
import webdoctor.jooq.tables.pojos.Disease;

/**
 * Created by IAN on 2016/10/10.
 */
@Service
public class Search {


    public void searchByName(String name) {
        String userName = "root";
        String password = "webdoctor";
        String url = "jdbc:mysql://localhost:3306/library";

        try(Connection conn = DriverManager.getConnection(url,userName,password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            List<Disease> disease_list = create.select().from(DISEASE).where(DISEASE.NAME.startsWith(name)).fetchInto(Disease.class);
            System.out.println(disease_list.get(0));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void searchByTags(String Json) {
        String userName = "root";
        String password = "webdoctor";
        String url = "jdbc:mysql://localhost:3306/library";

        try(Connection conn = DriverManager.getConnection(url,userName,password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            List<Disease> disease_list = create.select().from(DISEASE).where(DISEASE.NAME.startsWith(Json)).fetchInto(Disease.class);
            System.out.println(disease_list.get(0));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
