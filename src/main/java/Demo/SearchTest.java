package Demo;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.util.derby.sys.Sys;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import webdoctor.jooq.tables.pojos.Symptom;
import webdoctor.service.Search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yibih on 2016/10/13.
 */


public class SearchTest {
    private static String userName = "root";
    private static String password = "webdoctor";
    private static String url = "jdbc:mysql://localhost:3306/webdoctor";

    public static void diseaseSearchTest(String disease){
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

            Search a = new Search(create);
            a.searchByName(disease);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void tagsSearchTest(Symptom[] symptoms){
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

            Search a = new Search(create);
            a.searchByTags(symptoms);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void departmentSearchTest(String department){
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

            Search a = new Search(create);
            a.searchByDepartment(department);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main ( String[] args){
        SearchTest test = new SearchTest();

//        test.diseaseSearchTest("ra");
//        System.out.println();
//        test.departmentSearchTest("Dermatology");
//        System.out.println();

        Symptom acitretin = new Symptom();
        Symptom cadasil = new Symptom();
        acitretin.setId(1);
        cadasil.setId(4);
        acitretin.setName("Acitretin");
        cadasil.setName("Cadasil");
        Symptom [] symptom_list = new Symptom[2];
        symptom_list[0] = acitretin;
        symptom_list[1] = cadasil;
        test.tagsSearchTest(symptom_list);


    }
}
