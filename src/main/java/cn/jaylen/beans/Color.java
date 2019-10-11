package cn.jaylen.beans;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Color implements InitializingBean, DisposableBean {

    public Color() {
        System.out.println("构造方法……");
    }

    public void destroy() throws Exception {
        System.out.println("销毁方法……");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("属性赋值后……");
    }
}
