package com.elsoprojekt.webProjekt.dao;

import com.elsoprojekt.webProjekt.Model.computersCommentsModel;
import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import com.elsoprojekt.webProjekt.Model.gpuCommentsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentsDao extends CrudRepository<cpuCommentsModel, Long> {
    @Query("FROM cpuCommentsModel WHERE preview_cpu_id = :id")
    List<cpuCommentsModel> findCpuComments(@Param(value = "id") Long id);

    @Query("FROM gpuCommentsModel WHERE preview_gpu_id = :id")
    List<gpuCommentsModel> findGpuComments(@Param(value = "id") Long id);

    @Query("FROM computersCommentsModel WHERE preview_top_offers_id = :id")
    List<computersCommentsModel> findComputersComments(@Param(value = "id") Long id);

    @Query(value = "insert into cpuCommentsModel comment = :comment, username = :username, preview_cpu_id = :preview_cpu_id", nativeQuery = true)
    cpuCommentsModel addcommentCpu(@Param(value = "username") String username, @Param(value = "comment") String comment,
                                   @Param(value="preview_cpu_id") Long id);
}
