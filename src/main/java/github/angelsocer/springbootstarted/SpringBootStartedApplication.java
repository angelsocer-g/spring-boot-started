package github.angelsocer.springbootstarted;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStartedApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootStartedApplication.class);
        application.run(args);
    }

}
