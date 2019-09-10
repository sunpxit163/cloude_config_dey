package xyz.sunpxit.utlis;

import org.springframework.util.DigestUtils;

public class Encrypt {
    public String code(String password){
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }
}
