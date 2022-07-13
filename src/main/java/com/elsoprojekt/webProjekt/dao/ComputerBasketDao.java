package com.elsoprojekt.webProjekt.dao;

import com.elsoprojekt.webProjekt.Model.computerBasket;
import com.elsoprojekt.webProjekt.Model.cpuBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComputerBasketDao extends JpaRepository<computerBasket, Long> {
    @Query(value = "SELECT * FROM computer_basket WHERE 1", nativeQuery = true)
    List<computerBasket> findComputersInBasket();

    @Query(value= "insert into computerBasket product_name = :product_name, product_price = :product_price, product_url = :product_url, preview_pc_id = :preview_pc_id", nativeQuery = true)
    computerBasket addComputerIntoBasket(@Param(value="product_name") String product_name, @Param(value = "product_price") int product_price,
                               @Param(value="product_url") String product_url,
                               @Param(value="preview_pc_id")Long id);
}
