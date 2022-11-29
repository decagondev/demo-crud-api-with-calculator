package com.deca.repositories;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.deca.entities.Contact;
import com.deca.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private DynamoDBMapper mapper;

    // Create
    public Product save(Product product) {
        mapper.save(product);
        return product;
    }


    // Read
    public Product findById(String id) { return mapper.load(Product.class, id); }

    public List<Product> findAll() { return mapper.scan(Product.class, new DynamoDBScanExpression()); }


    // Update
    public String update(String id, Product product) {
        mapper.save(product, new DynamoDBSaveExpression()
                .withExpectedEntry("id", new ExpectedAttributeValue(
                        new AttributeValue().withS(id)
                )));

        return "Successfully Updated Product: " + id;
    }

    // Delete
    public String delete(String id) {
        Product product = mapper.load(Product.class, id);
        mapper.delete(product);

        return "Successfully Deleted Product: " + id;
    }
}
