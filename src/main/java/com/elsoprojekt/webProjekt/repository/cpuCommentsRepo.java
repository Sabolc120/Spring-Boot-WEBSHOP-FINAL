package com.elsoprojekt.webProjekt.repository;

import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cpuCommentsRepo extends JpaRepository<cpuCommentsModel, Long> {
}
