package xyz.sunpxit.config;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig {
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public SecurityConfig(){
        bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    /**
     * 加密数据
     * @param password 要进行加密的数据
     * @return
     */
    public  String encrypt(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    /**
     * 登陆验证
     * @param password:要验证的数据
     * @param sqlPassword 加密的数据
     * @return true:验证成功 false 验证失败
     */
    public boolean decode(String password,String sqlPassword){
        boolean s1=bCryptPasswordEncoder.matches(password,sqlPassword);
        return s1;
    }
}
