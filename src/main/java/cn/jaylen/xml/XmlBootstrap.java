package cn.jaylen.xml;

import cn.jaylen.beans.Student;
import cn.jaylen.beans.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于xml配置的方式，创建IOC容器
 */
public class XmlBootstrap {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");
        Teacher teacher = applicationContext.getBean(Teacher.class);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(teacher);
        System.out.println(student);
        printBeansName(applicationContext);
    }

    public static void printBeansName(ApplicationContext applicationContext){
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
