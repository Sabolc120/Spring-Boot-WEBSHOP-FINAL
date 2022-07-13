package com.elsoprojekt.webProjekt.dao;

import com.elsoprojekt.webProjekt.Model.computersCommentsModel;
import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import com.elsoprojekt.webProjekt.Model.gpuCommentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentsComputersDao extends JpaRepository<computersCommentsModel, Long> {

    @Query(value = "insert into computersCommentsModel comment = :comment, username = :username, preview_top_offers_id = :preview_top_offers_id", nativeQuery = true)
    computersCommentsModel addCommentPC(@Param(value="username") String username, @Param(value = "comment") String comment,
                                        @Param(value="preview_top_offers_id")Long id);
}
