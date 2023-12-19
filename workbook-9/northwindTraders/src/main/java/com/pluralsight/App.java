package com.pluralsight;

import com.pluralsight.services.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/beans.xml");

        ProductService productService = ctx.getBean(ProductService.class);

        System.out.println(productService.getAll());

    }
}
