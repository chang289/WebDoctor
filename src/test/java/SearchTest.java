import webdoctor.service.Search.*;
import static test.generated.Tables.*;
import static org.jooq.impl.DSL.*;
import org.jooq.*;
import org.jooq.impl.*;
import java.sql.*;
import org.springframework.stereotype.Service;

/**
 * Created by Yibin on 2016/10/10.
 */
public static void main (String[] args) {
        Search test = new Search();
        test.searchByName("Aaaa");
}