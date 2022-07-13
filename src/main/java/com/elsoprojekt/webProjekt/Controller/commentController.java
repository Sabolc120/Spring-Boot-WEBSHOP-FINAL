package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Controller.Service.CommentsService;
import com.elsoprojekt.webProjekt.Model.cpuCommentsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class commentController {

    private final CommentsService commentsService;

    public commentController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }
}
