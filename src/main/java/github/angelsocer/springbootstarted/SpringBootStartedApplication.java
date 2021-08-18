package github.angelsocer.springbootstarted;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootStartedApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringBootStartedApplication.class)
                .run(args);
    }

}
