package com.devsuperior;
import com.devsuperior.Order.*;
import com.devsuperior.services.OrderServices;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class AulaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido  pedido = new Pedido(123,250.0,20.0);
		OrderServices os = new OrderServices();
		os.total(pedido);
		
	
		
		System.out.println(pedido.toString());
		
		System.out.println(os.toString());
		
		
	
	
	}

}
