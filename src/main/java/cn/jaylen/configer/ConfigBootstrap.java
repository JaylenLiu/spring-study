package cn.jaylen.configer;

import cn.jaylen.beans.Student;
import cn.jaylen.beans.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IocConfiger.class);
        Teacher teacher = applicationContext.getBean(Teacher.class);
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(teacher);
        System.out.println(student);
    }
}
