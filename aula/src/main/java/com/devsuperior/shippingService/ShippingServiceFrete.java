package com.devsuperior.shippingService;

import org.springframework.stereotype.Service;

import com.devsuperior.Order.Pedido;


@Service
public class ShippingServiceFrete {
	
	private Double frete;
	
	Pedido pedido;
	
		public Double Frete(double valorTotal) 
		{
			
			if(valorTotal <= 100) 
			{
				frete = 20.0+ valorTotal;
				
			}else if (valorTotal > 100 & valorTotal <= 200) 
			{
				frete = 15.0+ valorTotal;
			}
		
			
			return  frete;
		}
		
		public Double getFrete() 
		{
			return frete;
		}
		public void setFrete(Double frete) 
		{
			this.frete = frete;
		}
	
		
		

}
