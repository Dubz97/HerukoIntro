package a1.herukointro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HerukoIntroApplication {

  public static void main(String[] args) {
    SpringApplication.run(HerukoIntroApplication.class, args);
  }


}
@RestController
class helloController{

  @GetMapping("/")
  String hello()  {
    return "This is it";
  }
}
