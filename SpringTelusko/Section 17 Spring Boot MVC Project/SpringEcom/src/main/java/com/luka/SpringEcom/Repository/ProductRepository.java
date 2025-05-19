package com.luka.SpringEcom.Repository;

import com.luka.SpringEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>, ProductCustomRepository {

}
