package webdoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IAN on 2016/10/9.
 */
@SpringBootApplication
public class WebDoctor {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(WebDoctor.class, args);
    }
    
}
