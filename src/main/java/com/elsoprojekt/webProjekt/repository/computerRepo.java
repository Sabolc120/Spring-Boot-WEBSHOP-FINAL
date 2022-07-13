package com.elsoprojekt.webProjekt.repository;

import com.elsoprojekt.webProjekt.Model.PreviewTopOffers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface computerRepo extends JpaRepository<PreviewTopOffers, Long> {
}
