package com.rohit.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.main.model.MenuItem;
import com.rohit.main.repository.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	@Autowired
	private MenuItemRepository menuItemRepository;

	public MenuItem addMenu(MenuItem menu) {
		return menuItemRepository.save(menu);
	}

	public List<MenuItem> getMenus(String dishType) {
		List<MenuItem> menus = new ArrayList<MenuItem>();

		for (MenuItem item : menuItemRepository.findAll()) {
			if (item.getDishType().equals(dishType)) {
				menus.add(item);
			}
		}
		return menus;
	}


	public Optional<MenuItem> getMenuById(int id) {
		return menuItemRepository.findById(id);
	}

}
