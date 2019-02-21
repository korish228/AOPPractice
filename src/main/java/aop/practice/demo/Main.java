package aop.practice.demo;

import aop.practice.demo.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Context.class);

        ShapeService shapeService = ctx.getBean("service", ShapeService.class);

        shapeService.getCircle().setName("Circle good and big");
        System.out.println(shapeService.getCircle().getName() );

    }

}
