package main;

import controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import service.HelloService;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "controller")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean(name = "hello")
    public HelloService helloService(){
        return new HelloService();
    }
}
