package com.elsoprojekt.webProjekt.Controller.Service;

import com.elsoprojekt.webProjekt.Model.computerBasket;
import com.elsoprojekt.webProjekt.Model.cpuBasket;
import com.elsoprojekt.webProjekt.Model.gpuBasket;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BasketService {

    List<gpuBasket> getGpusInBasket();

    gpuBasket addGpuIntoBasket(String product_name, int price, String product_url, Long id);

    List<cpuBasket> getCpuInBasket();

    cpuBasket addCpuIntoBasket(String product_name, int price, String product_url, Long id);

    List<computerBasket> getComputersInBasket();

    computerBasket addComputerIntoBasket(String product_name, int price, String product_url, Long id);
}
