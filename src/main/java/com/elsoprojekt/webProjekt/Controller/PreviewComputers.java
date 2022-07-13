package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Controller.Service.CommentsService;
import com.elsoprojekt.webProjekt.Model.PreviewCpu;
import com.elsoprojekt.webProjekt.Model.PreviewTopOffers;
import com.elsoprojekt.webProjekt.Model.computersCommentsModel;
import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import com.elsoprojekt.webProjekt.repository.PreviewTopOffersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.stream.events.Comment;
import java.util.List;

@Controller
public class PreviewComputers {

    @Autowired
    public CommentsService commentsService;
    @Autowired
    public PreviewTopOffersRepo repo;

    @GetMapping("/computersPreview")
    public ModelAndView getComputers(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("computersPreview.html");
        PreviewTopOffers computers = repo.findById(id).orElse(new PreviewTopOffers());
        List<computersCommentsModel> computersCommentsModels = commentsService.getComputersComment(id);
        mv.addObject("computersPreview",computers);
        mv.addObject("computerComments", computersCommentsModels);
        return mv;
    }
    @PostMapping("/computersPreview")
    public ModelAndView addCommentPc(@RequestParam("username")String username,
                                     @RequestParam("comment") String content,
                                     @RequestParam("preview_top_offers_id")Long preview_top_offers_id){
        computersCommentsModel comment = commentsService.addCommentPC(preview_top_offers_id, username, content);
        return new ModelAndView("redirect:/computers");
    }
}
