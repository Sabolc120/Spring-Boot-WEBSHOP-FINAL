package com.elsoprojekt.webProjekt.Controller;

import com.elsoprojekt.webProjekt.Controller.Service.BasketService;
import com.elsoprojekt.webProjekt.Model.*;
import com.elsoprojekt.webProjekt.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BasketController {
    @Autowired
    private BasketService basketService;
    @Autowired
    private PreviewRepo previewRepo;

    @Autowired
    private PreviewCpuRepo previewCpuRepo;

    @Autowired
    private cpuBasketRepo cpuRepo;

    @Autowired
    private gpuBasketRepo gpuBasketRepo;

    @Autowired
    private pcBasketRepo pcBasketRepo;

    @GetMapping("/basket")
    public ModelAndView getGpusInBasket() {
        ModelAndView mv = new ModelAndView("basket.html");
        List<gpuBasket> gpuBaskets = basketService.getGpusInBasket();
        List<cpuBasket> cpuBaskets = basketService.getCpuInBasket();
        List<computerBasket> computerBaskets = basketService.getComputersInBasket();
        mv.addObject("gpusInBasket", gpuBaskets);
        mv.addObject("cpusInBasket", cpuBaskets);
        mv.addObject("computersInBasket", computerBaskets);
        return mv;
    }
    @PostMapping("/basket")
    public ModelAndView postGpuIntoBasket(@RequestParam("product_name") String product_name,
                                          @RequestParam("product_price") Integer price,
                                          @RequestParam("product_url") String product_url,
                                          @RequestParam(value = "preview_gpu_basket_id", required = false) Long preview_gpu_basket_id,
                                          @RequestParam(value = "preview_cpu_basket_id", required = false) Long preview_cpu_basket_id,
                                          @RequestParam(value = "preview_pc_basket_id", required = false)Long preview_pc_basket_id) {
        if(preview_gpu_basket_id != null){
            gpuBasket basket = basketService.addGpuIntoBasket(product_name, price, product_url, preview_gpu_basket_id);
        }
        if(preview_cpu_basket_id != null){
            cpuBasket basketCpu = basketService.addCpuIntoBasket(product_name, price, product_url, preview_cpu_basket_id);
        }
        if(preview_pc_basket_id != null){
            computerBasket basketPc = basketService.addComputerIntoBasket(product_name, price, product_url, preview_pc_basket_id);
        }
        return new ModelAndView("redirect:/index");
    }
    @RequestMapping("/basketCpu/{id}")
    public ModelAndView deleteCpu(@PathVariable Long id){
        try{
            cpuRepo.deleteById(id);
            return new ModelAndView("redirect:/basket");
        }
        catch(Exception e){
            ModelAndView mv = new ModelAndView("basket");
            return new ModelAndView("redirect:/basket");
        }
    }
    @RequestMapping("/basketGpu/{id}")
    public ModelAndView deleteGpu(@PathVariable Long id){
        try{
            gpuBasketRepo.deleteById(id);
            return new ModelAndView("redirect:/basket");
        }
        catch(Exception e){
            ModelAndView mv = new ModelAndView("basket");
            return mv;
        }
    }
    @RequestMapping("/basketPc/{id}")
    public ModelAndView deletePc(@PathVariable Long id){
        try{
            pcBasketRepo.deleteById(id);
            return new ModelAndView("redirect:/basket");
        }
        catch(Exception e){
            ModelAndView mv = new ModelAndView("basket");
            return mv;
        }
    }
}
