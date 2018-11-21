package com.luv2code.springdemo;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource({
        "classpath:fortune.properties",
        "classpath:sport.properties"
})
public class SportConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our swm coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
