package suosong.beandefinition;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Bean;

/**
 * created by suosong on 2020/2/26 10:14 上午
 */
public class BeanDefinitionTest01 {

    @Test
    public void test_() {
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;

        BeanDefinition beanDefinition = new RootBeanDefinition();
    }
}
