package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Controller.Service.CommentsService;
import com.elsoprojekt.webProjekt.Model.Preview;
import com.elsoprojekt.webProjekt.Model.PreviewCpu;
import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import com.elsoprojekt.webProjekt.Model.gpuCommentsModel;
import com.elsoprojekt.webProjekt.repository.PreviewRepo;
import jdk.internal.icu.text.NormalizerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PreviewController {

    @Autowired
    public CommentsService commentsService;
    @Autowired
    public PreviewRepo repo;

    @GetMapping("/gpuPreview")
    public ModelAndView getPreview(@RequestParam Long id) {
        ModelAndView mv = new ModelAndView("gpuPreview.html");
        Preview previewGpu = repo.findById(id).orElse(new Preview());
        List<gpuCommentsModel> gpuCommentsModels = commentsService.getCommentGpu(id);
        mv.addObject("gpuComments", gpuCommentsModels);
        mv.addObject("previewGpu", previewGpu);
        return mv;
    }

    @PostMapping("/gpuPreview")
    public ModelAndView postGpuComments(@RequestParam("username") String username,
                                        @RequestParam("comment") String content,
                                        @RequestParam("preview_gpu_id") Long preview_gpu_id) {
        gpuCommentsModel comment = commentsService.addCommentGpu(preview_gpu_id, username, content);
        return new ModelAndView("redirect:/gpus");
    }
}
