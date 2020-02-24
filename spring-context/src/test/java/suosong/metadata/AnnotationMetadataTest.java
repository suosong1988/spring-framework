package suosong.metadata;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.type.*;

import java.util.Set;

/**
 * 充分了解什么是metadata
 * 在上面的基础上，了解什么是AnnotationMetadata
 * created by suosong on 2020/2/23 10:23 上午
 */
public class AnnotationMetadataTest {
    @Test
    public void test_ClassMetadata() {
        ClassMetadata metadata = new StandardClassMetadata(AnnotationClassModel.class);
        //不是接口
        Assert.assertFalse(metadata.isInterface());
        //不是抽象的
        Assert.assertFalse(metadata.isAbstract());
        //是个普通类
        Assert.assertTrue(metadata.isConcrete());
        //className是什么
        Assert.assertTrue("suosong.metadata.AnnotationClassModel".equals(metadata.getClassName()));
        //接口有哪些
        Assert.assertTrue(metadata.getInterfaceNames().length == 0);
    }

    /**
     * class metadata上关于注解的一些方法
     */
    @Test
    public void test_AnnotationClassMetadata() {
        AnnotationMetadata metadata = new StandardAnnotationMetadata(AnnotationClassModel.class);
        //获取类上的所有注解名称
        Set<String> annotationTypes = metadata.getAnnotationTypes();
        System.out.println("annotationTypes=" + annotationTypes);
        //是否有此注解
        Assert.assertTrue(metadata.hasAnnotation("org.springframework.stereotype.Component"));
        //这个是咋回事，没看懂 todo
        //Assert.assertTrue(metadata.hasMetaAnnotation("org.springframework.stereotype.Service"));
        //metadata.
        //判断方法上是否有注解，只要有一个方法有，就可以
        Assert.assertTrue(metadata.hasAnnotatedMethods("javax.annotation.PostConstruct"));
        //获取所有有这个注解的方法metadata
        System.out.println("==========================");
        Set<MethodMetadata> annotatedMethods = metadata.getAnnotatedMethods("javax.annotation.PostConstruct");
        for (MethodMetadata methodMetadata : annotatedMethods) {
            System.out.println("methodName=" + methodMetadata.getMethodName());
        }
    }
}
