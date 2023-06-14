/**
 * 
 */
package com.devsuperior.dscommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author matheus
 *
 */

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	
	@GetMapping
	public String teste() {
		
		return "OIa Bem!";
		
	}

}
