package com.wolf.back_manage.service;


import com.wolf.back_manage.domain.Menu;

import java.util.List;

public interface MenuService {

    /**
     * 查询所有菜单项
     * @return
     */
    List<Menu> findAll();
}
