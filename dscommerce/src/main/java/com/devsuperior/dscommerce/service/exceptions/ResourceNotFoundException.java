/**
 * 
 */
package com.devsuperior.dscommerce.service.exceptions;

/**
 * @author matheus
 *
 */
public class ResourceNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
