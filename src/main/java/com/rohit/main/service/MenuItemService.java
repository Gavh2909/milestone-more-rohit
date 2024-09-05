package com.rohit.main.service;

import java.util.List;
import java.util.Optional;

import com.rohit.main.model.MenuItem;

public interface MenuItemService {
    MenuItem addMenu(MenuItem manu);
    
    List<MenuItem> getMenus(String dishType);
    
    Optional<MenuItem> getMenuById(int id);
}
