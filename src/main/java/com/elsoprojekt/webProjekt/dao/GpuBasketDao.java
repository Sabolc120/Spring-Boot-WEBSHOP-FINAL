package com.elsoprojekt.webProjekt.dao;

import com.elsoprojekt.webProjekt.Model.computersCommentsModel;
import com.elsoprojekt.webProjekt.Model.gpuBasket;
import com.elsoprojekt.webProjekt.Model.gpuCommentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GpuBasketDao extends JpaRepository<gpuBasket, Long> {

    @Query(value = "SELECT * FROM gpu_basket WHERE 1", nativeQuery = true)
    List<gpuBasket> findGpusInBasket();

    @Query(value = "insert into gpuBasket product_name = :product_name, product_price = :product_price, product_url = :product_url, preview_gpu_id = :preview_gpu_id",nativeQuery = true)
    gpuBasket addGpuIntoBasket(@Param(value="product_name") String product_name, @Param(value="product_price") int product_price,
                               @Param(value="product_url") String product_url,
                               @Param(value="preview_gpu_id") Long id);
}
