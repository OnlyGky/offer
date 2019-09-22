package offer;

import sun.security.provider.MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class aa {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        System.out.println("123asd".hashCode());
        System.out.println(md.digest(("123asd".hashCode()+"123asd").getBytes()));
    }
}
