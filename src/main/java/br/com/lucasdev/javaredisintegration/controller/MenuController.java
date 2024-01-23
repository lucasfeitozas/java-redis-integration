package br.com.lucasdev.javaredisintegration.controller;

import br.com.lucasdev.javaredisintegration.entity.Menu;
import br.com.lucasdev.javaredisintegration.repositories.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
@RequiredArgsConstructor
public class MenuController {

    private final MenuRepository menuRepo;

    @PostMapping
    public Menu save(@RequestBody Menu menuDetails) {
        return menuRepo.save(menuDetails);
    }

    @GetMapping
    public List<Menu> getMenus() {
        return menuRepo.findAll();
    }

    @GetMapping("/{id}")
    public Menu findMenuItemById(@PathVariable Long id) {
        return menuRepo.findItemById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteMenuById(@PathVariable Long id) {
        return menuRepo.deleteMenu(id);
    }

}
