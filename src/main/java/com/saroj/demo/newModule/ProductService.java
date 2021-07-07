package com.saroj.demo.newModule;

import java.util.List;

public interface ProductService {
    Product add(Product product);
    Product update(Product product);
    List<Product> getAll();
    Product getById(long id);
    void deleteById(long id);
}
