package com.springIndocker.springbtv3Docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // Make the class a controller

public class SpringbootV3DockerApplication {
	
	// Create a simple REST API
	@GetMapping("/welcome")

	public String welcome() {
	 	
		String var = " \n <h2> <center> Spring Boot for Docker 🐋  ...  </center> </h2> \n"
				   + " \n <center> <p> <h3> Keep learning buddy , you're are on the path of success 😍 ..  </h3> </p> </center> "
				   + " \n <center> <div> <p> The Spring Framework is an application framework and inversion of control container for the Java platform."
				   + "  The framework's core features can be used by any Java application, but there are extensions for building web applications on top of the Java EE (Enterprise Edition) platform. "
				   + " \n Although the framework does not impose any specific programming model, it has become popular in the Java community as an addition to the Enterprise JavaBeans (EJB) model. The Spring Framework is open source. </p> </div></center>"
				   + " \n \n  <center> Always <i> Share LOVE and PEACE </i> <center> </div></center>"
				   + " \n\n<footer> <div> <center><i>Made with 💕 By <a href='https://github.com/Tcarters/' target='_blank'>Tcarters Edmund</a> /a.k.a tcdocker2021</i> |"   
				   + " <span style='padding: 20px; padding-bottom: 50px;'>Spring Boot in Docker <sup>&copy;</sup>2023. </span>  </center> </div> </footer>"
		;

		return var;
}	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootV3DockerApplication.class, args);
	}

}
