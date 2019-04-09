package demo.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {
    public static String md5(String str) {
        MessageDigest md;
        String result = "";
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            BigInteger bi = new BigInteger(1, md.digest());

            result = bi.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
}
