package com.nhom2.sell_BE.repositories;

import com.nhom2.sell_BE.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    @Query(value = "SELECT p.* FROM tbl_product p JOIN tbl_product_type pt ON p.product_type_id = pt.product_type_id WHERE p.product_type_id = :productTypeId LIMIT 10", nativeQuery = true)
    List<Product> findAllByProductTypeIdWithLimit(@Param("productTypeId") String productTypeId);

}
