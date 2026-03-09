package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    private final List<Category> categories = new ArrayList<>();

    public CategoryService() {
        categories.add(new Category(1, "Điện thoại"));
        categories.add(new Category(2, "Laptop"));
    }

    public List<Category> findAll() {
        return categories;
    }

    public Category findById(int id) {
        return categories.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
