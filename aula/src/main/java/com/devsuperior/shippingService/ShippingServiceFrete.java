package com.devsuperior.shippingService;

import org.springframework.stereotype.Service;

import com.devsuperior.Order.Pedido;




@Service
public class ShippingServiceFrete {
	
	private Double frete = 0.0;
	

	
		public Double Frete(Pedido valorTotal) 
		{
			
			if(valorTotal.getValorBasic() <= 100) 
			{
				this.frete = 20.0;
				
			}else if (valorTotal.getValorBasic() > 100 & valorTotal.getValorBasic() <= 200) 
			{
				this.frete = 12.0;
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
