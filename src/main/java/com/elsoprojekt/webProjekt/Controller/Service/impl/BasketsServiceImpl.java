package com.elsoprojekt.webProjekt.Controller.Service.impl;

import com.elsoprojekt.webProjekt.Controller.Service.BasketService;
import com.elsoprojekt.webProjekt.Model.*;
import com.elsoprojekt.webProjekt.dao.ComputerBasketDao;
import com.elsoprojekt.webProjekt.dao.CpuBasketDao;
import com.elsoprojekt.webProjekt.dao.GpuBasketDao;
import com.elsoprojekt.webProjekt.repository.computerRepo;
import com.elsoprojekt.webProjekt.repository.cpuRepo;
import com.elsoprojekt.webProjekt.repository.gpuRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BasketsServiceImpl implements BasketService {
    private GpuBasketDao gpuBasketDao;

    private CpuBasketDao cpuBasketDao;

    private ComputerBasketDao computerBasketDao;

    @Autowired
    private com.elsoprojekt.webProjekt.repository.gpuRepo gpuRepo;

    @Autowired
    private cpuRepo cpuRepo;

    @Autowired
    private computerRepo computerRepo;

    @Override
    public List<gpuBasket> getGpusInBasket() {
        return gpuBasketDao.findGpusInBasket();
    }
    public gpuBasket addGpuIntoBaske(String name, int product_price, String url, Long id){
        return gpuBasketDao.addGpuIntoBasket(name,product_price,url,id);
    }
    @Override
    public gpuBasket addGpuIntoBasket(String product_name, int price, String product_url, Long id) {
        gpuBasket basket = new gpuBasket();
        Preview previewGpu = gpuRepo.findById(id).orElse(null);
        basket.setPreview(previewGpu);
        basket.setProductName(product_name);
        basket.setProductPrice(price);
        basket.setProductUrl(product_url);
        return gpuBasketDao.save(basket);
    }
    @Override
    public List<cpuBasket> getCpuInBasket() {
        return cpuBasketDao.findCpusInBasket();
    }
    public cpuBasket addCpuIntoBaske(String name, int product_price, String url, Long id){
        return cpuBasketDao.addCpuIntoBasket(name, product_price, url, id);
    }

    @Override
    public cpuBasket addCpuIntoBasket(String product_name, int price, String product_url, Long id) {
        cpuBasket basket = new cpuBasket();
        PreviewCpu cpu = cpuRepo.findById(id).orElse(null);
        basket.setPreviewCpu(cpu);
        basket.setProductname(product_name);
        basket.setProductprice(price);
        basket.setProducturl(product_url);
        return cpuBasketDao.save(basket);
    }

    @Override
    public List<computerBasket> getComputersInBasket() {
        return computerBasketDao.findComputersInBasket();
    }

    public computerBasket addComputerIntoBaske(String name, int product_price, String url, Long id){
        return computerBasketDao.addComputerIntoBasket(name, product_price, url, id);
    }
    @Override
    public computerBasket addComputerIntoBasket(String product_name, int price, String product_url, Long id) {
        computerBasket basket = new computerBasket();
        PreviewTopOffers pc = computerRepo.findById(id).orElse(null);
        basket.setPreviewTopOffers(pc);
        basket.setProductName(product_name);
        basket.setProductPrice(price);
        basket.setProductUrl(product_url);
        return computerBasketDao.save(basket);
    }
}
