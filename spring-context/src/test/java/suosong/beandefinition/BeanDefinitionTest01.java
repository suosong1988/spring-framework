package suosong.beandefinition;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import suosong.Dog;

/**
 * created by suosong on 2020/2/26 10:14 上午
 */
public class BeanDefinitionTest01 {

    @Test
    public void test_来个最简单的例子() {
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
        //编写bean定义
        BeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClassName(Dog.class.getName());
        //beanDefinition.setScope(ConfigurableBeanFactory.SCOPE_SINGLETON);
        //注册到beanFactory
        registry.registerBeanDefinition("myDog", beanDefinition);
        //初始化bean
        Dog myDog = (Dog) beanFactory.getBean("myDog");
        System.out.println(myDog);
    }

    /**
     * role，
     * 给bean做个角色分类
     * 为0或者1表示用户自己的
     * 2表示spring内部使用的。没有啥大的作用。目前没有发现在哪里用过
     */
    @Test
    public void test_role() {
    }

    @Test
    public void test_构造方法注入() {
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;
        //构造函数参数对象
        ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
        constructorArgumentValues.addIndexedArgumentValue(0, "张三");

        //编写bean定义
        BeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClassName(Chinese.class.getName());
        //把构造参数对象塞进去
        ((AbstractBeanDefinition) beanDefinition).setConstructorArgumentValues(constructorArgumentValues);
        //注册
        registry.registerBeanDefinition("ch", beanDefinition);
        Chinese chinese = (Chinese) beanFactory.getBean("ch");
        System.out.println(chinese);
    }

    @Test
    public void test_属性注入() {

    }


}
