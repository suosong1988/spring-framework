package suosong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * created by suosong on 2020/2/22 10:01 下午
 */
//@Configuration
@ComponentScan(value = {"suosong"})
public class Config {

    @Bean
    private Cat cat(){
        return new Cat("tom");
    }

}
