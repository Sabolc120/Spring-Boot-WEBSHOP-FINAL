package com.elsoprojekt.webProjekt.Controller.Service;

import com.elsoprojekt.webProjekt.Model.computersCommentsModel;
import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import com.elsoprojekt.webProjekt.Model.gpuCommentsModel;

import java.util.List;

public interface CommentsService {
    //cpuCommentsModel addComment(cpuCommentsModel cpuCommentsModel);

    List<cpuCommentsModel> getCommentCpu(Long commentId);

    List<gpuCommentsModel> getCommentGpu(Long commentId);

    List<computersCommentsModel> getComputersComment(Long commentId);

    //1
    cpuCommentsModel addCommentCpu(Long id, String username, String content);

    gpuCommentsModel addCommentGpu(Long id, String username, String content);

    computersCommentsModel addCommentPC(Long id, String username, String content);
}
