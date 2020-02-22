package suosong;

import org.springframework.stereotype.Component;

/**
 * created by suosong on 2020/2/22 10:01 下午
 */
@Component
public class Dog {
    private Integer age;
    private String category;

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", category='" + category + '\'' +
                '}';
    }
}
