package com.pluralsight.services;

import com.pluralsight.dao.impl.SimpleProductDao;
import com.pluralsight.dao.interfaces.IProductDao;
import com.pluralsight.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

private final IProductDao productDao;

@Autowired
public ProductService(IProductDao productDao) {
        this.productDao = productDao;
    }

    public void addProduct(Product product){
        productDao.addProduct(product);
    }

    public List<Product> getAll(){
    return productDao.getAll();
    }

}
