package com.wolf.back_manage.repository;


import com.wolf.back_manage.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuDao extends JpaRepository<Menu, Integer> {
}
