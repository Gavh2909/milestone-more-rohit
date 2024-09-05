package com.rohit.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.main.model.MenuItem;
import com.rohit.main.service.MenuItemService;

@RestController
public class MenuItemController {

	@Autowired
	private MenuItemService menuItemService;

	@GetMapping("/dish/{dishid}")
	public Optional<MenuItem> getMenuItem(@PathVariable("dishid") Integer dishid) {
		return menuItemService.getMenuById(dishid);
	}

	@PostMapping("/dish")
	public MenuItem saveMenu(@RequestBody MenuItem menuItem) {
		return menuItemService.addMenu(menuItem);
	}

	@GetMapping("search/{dishType}")
	public List<MenuItem> getAllMenusByDishType(@PathVariable("dishType") String dishType) {
		return menuItemService.getMenus(dishType);
	}
}
