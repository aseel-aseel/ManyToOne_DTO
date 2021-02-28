package io.javabrains;

//import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.filter.ShallowEtagHeaderFilter;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("converter,io.javabrains.springbootstarter.Car,io.javabrains.springbootstarter.Customers")
public class ManyToOneDtoApplication {

/*	@Bean 
	public Filter shallowEtagFilter() {
		return new ShallowEtagHeaderFilter();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(ManyToOneDtoApplication.class, args);
	}

}
