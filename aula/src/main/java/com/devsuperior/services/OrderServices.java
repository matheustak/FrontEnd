package com.devsuperior.services;

import org.springframework.stereotype.Service;
import com.devsuperior.Order.*;
import com.devsuperior.shippingService.ShippingServiceFrete;


@Service
public class OrderServices {
	private double total;
	
	ShippingServiceFrete frete;
	
	public double total(Pedido  pedido) 
	{
		
		if (pedido.getValorBasic() < 100) 
		{
			 total = pedido.getValorBasic();
			
		}
		else if(pedido.getValorBasic() >= 100 & pedido.getValorBasic() <= 200)
		{
			
			 double porcento =  (pedido.getValorBasic()*20.0)/100;
			 total = (pedido.getValorBasic() - porcento);
		
			 
			
		}else if (pedido.getValorBasic() > 200) 
		{
			 double porcento =  (pedido.getValorBasic()*10.0)/100;
			 total = pedido.getValorBasic() - porcento;
		}


		
		return total;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	

}
