package com.wxs.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 * User: FujiRen
 * Date: 2017/9/14
 * Time: 10:55
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.wxs.amqp")
public class AmqpApplication {
    public static void main(String[] args) {
        SpringApplication.run(AmqpApplication.class,args);
    }
}
