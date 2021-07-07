package com.saroj.demo.newModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product){

        return  productService.add(product);
    }
    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.update(product);
    }

    @GetMapping
    public List<Product> getAll(){
        return  productService.getAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable long id){
        return productService.getById(id);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable long id){
        productService.deleteById(id);
    }

}
