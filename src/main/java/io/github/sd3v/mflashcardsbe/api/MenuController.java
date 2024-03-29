package io.github.sd3v.mflashcardsbe.api;

import io.github.sd3v.mflashcardsbe.api.dto.MenuItemDto;
import io.github.sd3v.mflashcardsbe.api.helpers.MenuItemMapper;
import io.github.sd3v.mflashcardsbe.service.MenuService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/menus")
public class MenuController {

  private final MenuService menuService;

  @GetMapping
  public List<MenuItemDto> getAll() {
    return menuService.getAll().stream().map(MenuItemMapper::toDto).toList();
  }
}
