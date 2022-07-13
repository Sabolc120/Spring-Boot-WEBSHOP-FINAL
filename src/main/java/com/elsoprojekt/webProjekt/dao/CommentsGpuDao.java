package com.elsoprojekt.webProjekt.dao;

import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import com.elsoprojekt.webProjekt.Model.gpuCommentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentsGpuDao extends JpaRepository<gpuCommentsModel, Long> {


    @Query(value = "insert into gpuCommentsModel comment = :comment, username = :username, preview_gpu_id = :preview_gpu_id", nativeQuery = true)
    gpuCommentsModel addCommentGpu(@Param(value = "username") String username, @Param(value = "comment") String comment,
                                   @Param(value = "preview_gpu_id")Long id);
}
