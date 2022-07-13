package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Controller.Service.CommentsService;
import com.elsoprojekt.webProjekt.Model.PreviewCpu;
import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import com.elsoprojekt.webProjekt.repository.PreviewCpuRepo;
import com.elsoprojekt.webProjekt.repository.cpuCommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PreviewCpuController {
    @Autowired
    public PreviewCpuRepo repo;

    public cpuCommentsModel cpuCommentsModel;

    @Autowired
    public cpuCommentsRepo cpuRepo;

    @Autowired
    public CommentsService commentsService;

    public PreviewCpuController(PreviewCpuRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/previewCpu")
    public ModelAndView getPreviewCpu(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("cpuPreview.html");
        PreviewCpu cpuPreview = repo.findById(id).orElse(null);
         List<cpuCommentsModel> cpuComments = commentsService.getCommentCpu(id);
         mv.addObject("cpuComments", cpuComments);
        mv.addObject("cpuPreview",cpuPreview);
        mv.addObject("cpuCommentsPost", new cpuCommentsModel());
        return mv;
    }
    @PostMapping("/cpuPreview")
    public ModelAndView postCpuComment(@RequestParam("username") String username,
                                       @RequestParam("comment") String content,
                                       @RequestParam("preview_cpu_id")Long preview_cpu_id){
        cpuCommentsModel comment = commentsService.addCommentCpu(preview_cpu_id, username, content);
        System.out.println(preview_cpu_id);
        System.out.println(comment);
        System.out.println(username);
        return new ModelAndView("redirect:/processors");
    }
}
