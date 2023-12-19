package com.pluralsight.dao.interfaces;

import com.pluralsight.models.Product;

import java.util.List;

public interface IProductDao {
    void addProduct(Product product);

    List<Product> getAll();

}
