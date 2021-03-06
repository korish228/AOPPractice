package aop.practice.demo;

import aop.practice.demo.aspect.LoggingAspect;
import aop.practice.demo.model.Circle;
import aop.practice.demo.model.Triangle;
import aop.practice.demo.service.ShapeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Context {
    @Bean
    public Triangle triangle(){
        return new Triangle("triangle");
    }

    @Bean
    public Circle circle(){
        return new Circle();
    }

    @Bean
    public ShapeService service(){
        return new ShapeService( circle(),triangle());
    }
    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
}
