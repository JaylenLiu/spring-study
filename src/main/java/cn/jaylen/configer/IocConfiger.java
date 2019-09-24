package cn.jaylen.configer;

import cn.jaylen.beans.Student;
import cn.jaylen.beans.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 使用java配置类的方式创建IOC容器
 */
@Configuration
/**
 * 使用包扫描的方式进行bean的创建，可以识别配置路径下的@Controller、@Service、@Component、@Repository......
 */
@ComponentScan(value = "cn.jaylen.beans",
        excludeFilters = {
            @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
        },
        useDefaultFilters = false,
        includeFilters = {

        }
)
public class IocConfiger {

    /**
     * 类似于<xml/>标签
     *      1、id默认为方法名
     *      2、也可以给@Bean传入value，作为bean名称
     * @return
     */
    @Bean("student-1")
    public Student student(){
        return new Student("张三", 30, "男");
    }

    @Bean
    public Teacher teacher(){
        return new Teacher("李四", 25);
    }
}
