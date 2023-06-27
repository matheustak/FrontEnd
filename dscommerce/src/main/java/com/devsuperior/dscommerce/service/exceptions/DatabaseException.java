/**
 * 
 */
package com.devsuperior.dscommerce.service.exceptions;

/**
 * @author matheus
 *
 */
public class DatabaseException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg) {
		super(msg);
	}

}
