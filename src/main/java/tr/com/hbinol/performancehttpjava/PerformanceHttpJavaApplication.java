package tr.com.hbinol.performancehttpjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PerformanceHttpJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PerformanceHttpJavaApplication.class, args);
    }

    @RestController
    static class PerformanceController {
        @GetMapping("/")
        public Response index() {
            return new Response("I'm build with Java!");
        }

        record Response(String message) {
        }
    }

}
