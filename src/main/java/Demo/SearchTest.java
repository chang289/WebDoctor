package Demo;

/**
 * Created by Yibih on 2016/10/12.
 */
import webdoctor.service.Search;
import webdoctor.service.Search.*;
import static test.generated.Tables.*;
import static org.jooq.impl.DSL.*;
import org.jooq.*;
import org.jooq.impl.*;
import java.sql.*;
import org.springframework.stereotype.Service;

public class SearchTest {
    public static void main(String[] args) {
        Search test = new Search();
        test.searchByName("d");
    }
}