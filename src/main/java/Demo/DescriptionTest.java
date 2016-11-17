package Demo;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.util.derby.sys.Sys;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import webdoctor.jooq.tables.pojos.Disease;
import webdoctor.jooq.tables.pojos.Symptom;
import webdoctor.service.Search;
import webdoctor.helperClass.*;
import webdoctor.service.DescriptionService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yibih on 2016/11/14.
 */
public class DescriptionTest{
        private static String userName = "root";
        private static String password = "webdoctor";
        private static String url = "jdbc:mysql://localhost:3306/webdoctor";

    public static void DSListTest(){
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            DescriptionService D = new DescriptionService(create);

            D.getDSList();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void CreationTest(Disease disease, String symptoms){
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            DescriptionService D = new DescriptionService(create);

            D.descriptionCreate(disease,symptoms);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args) {
        DescriptionTest test = new DescriptionTest();

        Disease d = new Disease();
        d.setName("fakedisease");
        d.setDescription("fake");
        d.setDepartment("fake");


        Symptom a = new Symptom();
        a.setId(33);
        Symptom [] symptoms = new Symptom[1];
        symptoms[0] = a;





//        test.DSListTest();
    }

}
