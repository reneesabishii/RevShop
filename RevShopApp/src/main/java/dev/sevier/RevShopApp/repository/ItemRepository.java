package dev.sevier.RevShopApp.repository;
import dev.sevier.RevShopApp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dev.sevier.RevShopApp.entity.Item;


public interface ItemRepository extends JpaRepository<Item, Integer> {
    @Query("SELECT a FROM Item a WHERE a.item_id = :item_id")
    Item findItem(@Param("item_id") Integer item_id);
}
