package com.deca.controllers;

import com.deca.entities.Contact;
import com.deca.entities.Product;
import com.deca.repositories.ContactRepository;
import com.deca.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins="*")
public class ProductController {
    @Autowired
    ProductRepository productRepo;

    // Create
    @PostMapping
    public Product save(@RequestBody Product product) { return productRepo.save(product); }

    // Read
    @GetMapping("{id}")
    public Product findById(@PathVariable("id") String id) { return productRepo.findById(id); }

    @GetMapping
    public List<Product> findAll() {return productRepo.findAll(); }


    // Update
    @PutMapping("{id}")
    public String update(@PathVariable(value = "id") String id, @RequestBody Product product) {
        return productRepo.update(id, product);
    }

    // Delete
    @DeleteMapping("{id}")
    public String delete(@PathVariable(value = "id") String id) {
        return productRepo.delete(id);
    }

}
