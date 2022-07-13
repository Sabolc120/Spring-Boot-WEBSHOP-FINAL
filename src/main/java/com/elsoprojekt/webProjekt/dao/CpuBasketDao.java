package com.elsoprojekt.webProjekt.dao;

import com.elsoprojekt.webProjekt.Model.cpuBasket;
import com.elsoprojekt.webProjekt.Model.gpuBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CpuBasketDao extends JpaRepository<cpuBasket, Long> {


    @Query(value = "SELECT * FROM cpu_basket WHERE 1", nativeQuery = true)
    List<cpuBasket> findCpusInBasket();

    @Query(value= "insert into cpuBasket product_name = :product_name, product_price = :product_price, product_url = :product_url, preview_cpu_id = :preview_cpu_id", nativeQuery = true)
    cpuBasket addCpuIntoBasket(@Param(value="product_name") String product_name, @Param(value = "product_price") int product_price,
                               @Param(value="product_url") String product_url,
                               @Param(value="preview_cpu_id")Long id);
}
