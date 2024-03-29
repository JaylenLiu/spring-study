package cn.jaylen.conditional;

import cn.jaylen.beans.Color;
import cn.jaylen.beans.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


/**
 * 如果把@Condition放置在类上，则所有bean的装配可以进行集体控制。
 */
//@Conditional({ColorConditional.class})

@Configuration
@ComponentScan("cn.jaylen.beans")
public class ConditionalConfiger {

    /**
     * 按条件注入bean
     * 参数为实现了Condition 接口的对象数组
     * 返回true，则注入成功，否则注入失败
     * @return
     */
//    @Conditional({ColorConditional.class})
//    @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
//    public Color color(){
//        return new Color();
//    }

//    @Bean
//    public Red red(){
//        return new Red();
//    }
}
