package xyz.sunpxit;


import org.springframework.util.DigestUtils;

public class Test {


    public static void main(String[] args) {
       String password="1813022453" ;

        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());




    }
}
