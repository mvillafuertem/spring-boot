package com.mvillafuertem;

import com.mvillafuertem.configuration.AppConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

//@SpringBootApplication
//public class App implements CommandLineRunner {
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

//    @Override
//    public void run(String... args) throws Exception {
//        LOGGER.info("Hola Mundo!");
//    }

    public static void main (String[] args) {
        //SpringApplication.run(App.class, args);

        AnnotationConfigEmbeddedWebApplicationContext context = new AnnotationConfigEmbeddedWebApplicationContext(AppConfiguration.class);
        //final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

    }
}