package lnd.sample.jasypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lnd.sample.jasypt.config.JasyptAppConfig;

@SpringBootApplication
public class JasyptDemoApplication {
    public static void main(String[] args) {
        
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JasyptAppConfig.class)) {
            for (String beanName : applicationContext.getBeanDefinitionNames()) {
                System.out.println("Bean name: " + beanName);
            }
        }

//        SpringApplication.run(JasyptDemoApplication.class, args);
    }
}
