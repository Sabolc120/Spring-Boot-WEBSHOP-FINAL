package com.elsoprojekt.webProjekt.repository;

import com.elsoprojekt.webProjekt.Model.computerBasket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pcBasketRepo extends JpaRepository<computerBasket, Long> {
}
