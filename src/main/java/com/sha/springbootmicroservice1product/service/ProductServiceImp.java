package com.sha.springbootmicroservice1product.service;

import com.sha.springbootmicroservice1product.model.Product;
import com.sha.springbootmicroservice1product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService{


    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }
    @Override
    public void deleteProduct(Long productId){
        productRepository.deleteById(productId);
    }


    @Override
    @Transactional
    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

}
