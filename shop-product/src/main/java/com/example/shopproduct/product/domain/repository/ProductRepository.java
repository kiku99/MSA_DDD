package com.example.shopproduct.product.domain.repository;

import com.example.shopproduct.product.domain.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    Product findByName(@Param("name") String name);
}
