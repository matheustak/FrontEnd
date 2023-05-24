package com.devsuperior.services;


import org.springframework.stereotype.Service;

import com.devsuperior.Order.Pedido;
import com.devsuperior.shippingService.ShippingServiceFrete;




@Service
public class OrderServices {
	private double total;
	

	 ShippingServiceFrete frete = new ShippingServiceFrete();
	 
	
	public void total(Pedido  pedido) 
	{
		frete.Frete(pedido);
		
		if (pedido.getValorBasic() < 100) 
		{
			 total = pedido.getValorBasic();
			
		}
		else if(pedido.getValorBasic() >= 100 & pedido.getValorBasic() <= 200)
		{
			
			 double porcento =  (pedido.getValorBasic()*pedido.getDiscount())/100;
			 total = (pedido.getValorBasic() - porcento);
		
			
		}else if (pedido.getValorBasic() > 200) 
		{
			 double porcento =  (pedido.getValorBasic()*pedido.getDiscount())/100;
			 total = pedido.getValorBasic() - porcento;
			
		}

		total=total+frete.getFrete();
		
		
	}
	@Override
	public String toString() {
		return "OrderServices [total=" +total + "]";
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	

	
	

}
