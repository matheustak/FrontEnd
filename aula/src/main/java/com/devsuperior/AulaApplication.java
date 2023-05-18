package com.devsuperior;
import com.devsuperior.Order.*;
import com.devsuperior.services.OrderServices;
import com.devsuperior.shippingService.ShippingServiceFrete;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido  pedido = new Pedido(123,150.0,20.0);
		OrderServices os = new OrderServices();
		ShippingServiceFrete valorfrete = new ShippingServiceFrete();
		valorfrete.Frete(os.getTotal());
		
	
		os.total(pedido);
		System.out.println("Codigo Produto!"+pedido.getCode());
		System.out.println("Valor!"+pedido.toString());
		System.out.println("Valor Com desconto!"+os.getTotal());
		System.out.println("Valor Com Frete Incluso!"+valorfrete.Frete(os.getTotal()));
	}

}
