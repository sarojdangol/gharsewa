package com.saroj.demo.newModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
   private ProductRepository productRepository;

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(long id) {
        return productRepository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
    }

    @Override
    public void deleteById(long id) {
            productRepository.deleteById(id);
    }
}
