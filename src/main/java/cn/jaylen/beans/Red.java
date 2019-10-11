package cn.jaylen.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Red {
    public Red() {
        System.out.println("red 构建……");
    }

    @PostConstruct
    public void init () {
        System.out.println("postConstruct……");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy……");
    }
}
