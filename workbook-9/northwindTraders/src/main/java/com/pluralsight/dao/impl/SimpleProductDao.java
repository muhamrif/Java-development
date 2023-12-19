package com.pluralsight.dao.impl;

import com.pluralsight.dao.interfaces.IProductDao;
import com.pluralsight.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements IProductDao {
    private List<Product> products;


    public SimpleProductDao(){
        this.products = new ArrayList<>();
        this.products.add(new Product(1,"box","brown",42));
        this.products.add(new Product(2,"pencil","blue",42));
        this.products.add(new Product(3,"eraser","blue",42));
        this.products.add(new Product(4,"pen","blue",42));
    }


    public void addProduct(Product product){
        this.products.add(new Product(products.size()+1,product.getName(),product.getCategory(), product.getPrice()));
    }

    public List<Product> getAll(){
//        List<Product> all = new ArrayList<>(products);
//        return all;
        return new ArrayList<>(products);
    }
}
