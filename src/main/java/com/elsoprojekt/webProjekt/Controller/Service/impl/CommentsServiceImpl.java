package com.elsoprojekt.webProjekt.Controller.Service.impl;

import com.elsoprojekt.webProjekt.Controller.Service.CommentsService;
import com.elsoprojekt.webProjekt.Model.*;
import com.elsoprojekt.webProjekt.dao.CommentsComputersDao;
import com.elsoprojekt.webProjekt.dao.CommentsDao;
import com.elsoprojekt.webProjekt.dao.CommentsGpuDao;
import com.elsoprojekt.webProjekt.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CommentsServiceImpl implements CommentsService {
    private CommentsDao commentsDao;

    private CommentsGpuDao commentsGpuDao;

    private CommentsComputersDao commentsComputersDao;

    @Autowired
    private cpuRepo cpuRepo;

    @Autowired
    private gpuRepo gpuRepo;

    @Autowired
    private PreviewTopOffersRepo previewTopOffersRepo;

    @Override
    public List<cpuCommentsModel> getCommentCpu(Long productId) {
        return commentsDao.findCpuComments(productId);
    }

    @Override
    public List<gpuCommentsModel> getCommentGpu(Long productId) {
        return commentsDao.findGpuComments(productId);
    }

    @Override
    public List<computersCommentsModel> getComputersComment(Long productId) {
        return commentsDao.findComputersComments(productId);
    }
    public cpuCommentsModel addCommentCpu(String username, String comment, Long id) {
        return commentsDao.addcommentCpu(username, comment, id);
    }
    @Override
    public cpuCommentsModel addCommentCpu(Long id, String username, String content) {
        cpuCommentsModel comment = new cpuCommentsModel();
        PreviewCpu cpu = cpuRepo.findById(id).orElse(null);
        comment.setPreviewCpu(cpu);
        comment.setComment(content);
        comment.setUsername(username);
        return commentsDao.save(comment);
    }

    public gpuCommentsModel addCommentGpu(String username, String comment, Long id){
        return commentsGpuDao.addCommentGpu(username, comment, id);
    }
    @Override
    public gpuCommentsModel addCommentGpu(Long id, String username, String content) {
        gpuCommentsModel comment = new gpuCommentsModel();
        Preview gpu = gpuRepo.findById(id).orElse(null);
        comment.setPreviewGpu(gpu);
        comment.setComment(content);
        comment.setUsername(username);
        return commentsGpuDao.save(comment);
    }

    public computersCommentsModel addCommentPC(String username, String comment, Long id){
        return commentsComputersDao.addCommentPC(username, comment, id);
    }
    @Override
    public computersCommentsModel addCommentPC(Long id, String username, String content) {
        computersCommentsModel comment = new computersCommentsModel();
        PreviewTopOffers previewTopOffers = previewTopOffersRepo.findById(id).orElse(null);
        comment.setPreviewTopOffers(previewTopOffers);
        comment.setComment(content);
        comment.setUsername(username);
        return commentsComputersDao.save(comment);
    }
}
