package xyz.sunpxit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xyz.sunpxit.Dao")
public class Application_test {

    public static void main(String[] args) {
        SpringApplication.run(Application_test.class, args);
    }

}
