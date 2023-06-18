/**
 * 
 */
package com.devsuperior.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerce.entities.Product;

/**
 * @author matheus
 *
 */
public interface ProductRepository extends JpaRepository <Product, Long> {

}
