package suosong;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by suosong on 2020/2/22 10:00 下午
 */
public class ApplicationContext01 {

    @Test
    public void test_applicationContext01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog);
    }
}
