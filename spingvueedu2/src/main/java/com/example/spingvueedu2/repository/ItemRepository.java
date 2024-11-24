package com.example.spingvueedu2.repository;


import com.example.spingvueedu2.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByIdIn(List<Integer> ids);
}