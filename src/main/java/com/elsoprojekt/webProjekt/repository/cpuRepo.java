package com.elsoprojekt.webProjekt.repository;

import com.elsoprojekt.webProjekt.Model.PreviewCpu;
import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cpuRepo extends JpaRepository<PreviewCpu, Long> {
}
