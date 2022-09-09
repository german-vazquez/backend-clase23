package com.example.backendclase23;

import com.example.backendclase23.bd.BD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendClase23Application {

	public static void main(String[] args) throws Exception {
		BD.crearTablas();
		SpringApplication.run(BackendClase23Application.class, args);
	}

}
