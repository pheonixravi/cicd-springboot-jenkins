package in.ravi.elxsi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdSpringbootDokcerJenkinsApplication {
	@GetMapping
	public String message(){
		return "I am in Jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdSpringbootDokcerJenkinsApplication.class, args);
	}

}
