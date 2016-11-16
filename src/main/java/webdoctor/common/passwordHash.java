package webdoctor.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by IAN on 2016/11/16.
 */
public class passwordHash {
    public String hash256(String password) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException e){
            System.out.println("No such algorithm");
            return null;
        }
        md.update(password.getBytes());
        return bytesToHex(md.digest());
    }

    private String bytesToHex(byte[] bytes) {
        StringBuffer result = new StringBuffer();
        for (byte byt : bytes) {
            result.append(Integer.toString((byt & 0xff) + 0x00, 16).substring(1));
        }
        return result.toString();
    }
}
