package com.rohit.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.main.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer>{
    
}
