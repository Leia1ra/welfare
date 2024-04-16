package api.integrate.welfare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelfareApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelfareApplication.class, args);
        System.out.println("http://localhost:8080/");
    }

}
