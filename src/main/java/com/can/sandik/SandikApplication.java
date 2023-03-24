package com.can.sandik;

import com.can.sandik.service.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SandikApplication {

	public static void main(String[] args) {
		Service serv = new Service();
		serv.read();

		SpringApplication.run(SandikApplication.class, args);


	}

}
