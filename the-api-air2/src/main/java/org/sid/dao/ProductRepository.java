package org.sid.dao;

import org.sid.entities.Product;
import org.sid.entities.ProductPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, ProductPK> {

}
