package com.elsoprojekt.webProjekt.repository;

import com.elsoprojekt.webProjekt.Model.Preview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface gpuRepo extends JpaRepository<Preview, Long> {
}
