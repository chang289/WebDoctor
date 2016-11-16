package webdoctor.common;

import java.security.NoSuchAlgorithmException;

/**
 * Created by IAN on 2016/11/16.
 */
public class TestHash {
    public static void main(String[] args) {
        String password = "webdoctor";
        passwordHash ph = new passwordHash();
        System.out.println(ph.hash256(password));

    }
}
