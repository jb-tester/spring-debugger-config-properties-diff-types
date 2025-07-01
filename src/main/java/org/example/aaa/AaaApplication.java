package org.example.aaa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class AaaApplication {
    @Value("${value.only.prop1}")
    String prop1;

    public static void main(String[] args) {
        SpringApplication.run(AaaApplication.class, args);
    }

        @Bean
            public CommandLineRunner commandLineRunner(MyProps1 myProps1, EnumMapConfigProperties enumMapConfigProperties) {
                return args -> {
                    System.out.println("--------------------------------------");
                    for (String p2 : myProps1.getProp2()) {
                        System.out.println(p2);
                    }
                    System.out.println("--------------------------------------");
                    for (String p3 : myProps1.getProp3()) {
                        System.out.println(p3);
                    }
                    System.out.println("--------------------------------------");
                    myProps1.getProp4().forEach((k, v) -> System.out.println((k + ":" + v)));
                    System.out.println("--------------------------------------");
                    System.out.println("custom.config.prop5.prop2[1]: " + myProps1.getProp5().getProp2().get(1));
                    for (String s : myProps1.getProp5().getProp2()) {
                        System.out.println(s);
                    }
                    System.out.println("--------------------------------------");
                    for (String s : myProps1.getProp5().getProp3()) {
                        System.out.println(s);
                    }
                    System.out.println("--------------------------------------");
                    enumMapConfigProperties.getEnumMap().forEach((k, v) -> System.out.println((k + ":" + v)));
                    enumMapConfigProperties.getNormalMap().forEach((k, v) -> System.out.println((k + ":" + v)));
                };
            }
}
