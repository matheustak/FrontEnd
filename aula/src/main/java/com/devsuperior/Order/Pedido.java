package com.devsuperior.Order;

import org.springframework.stereotype.Service;

@Service
public class Pedido {
	
	private int code;
	private Double valorBasic;
	private Double discount;
	
	public Pedido() {}
	
	public Pedido(int code, Double valorBasic, Double discount) {
		//super();
		this.code = code;
		this.valorBasic = valorBasic;
		this.discount = discount;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public Double getValorBasic() {
		return valorBasic;
	}


	public void setValorBasic(Double valorBasic) {
		this.valorBasic = valorBasic;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "Pedido [valorBasic=" + valorBasic + "]";
	}
	
	
	
	
	
}
