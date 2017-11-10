package eventX.domain;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SQIM-User on 2017/08/11.
 */

@RestController
@EnableAutoConfiguration
public class Home {

    @RequestMapping("/")
    String home() {
        return "It Works";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Home.class, args);
    }

}