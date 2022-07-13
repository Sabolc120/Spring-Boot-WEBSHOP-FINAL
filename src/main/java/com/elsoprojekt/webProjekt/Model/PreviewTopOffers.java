package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name="previewComputers")
public class PreviewTopOffers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Title;

    @Column(name ="url")
    private String url;

    @Column (name="price")
    private int price;

    @Column (name ="processor")
    private String processzor;

    @Column(name ="memory")
    private int memory;

    @Column(name = "gpu")
    private String gpu;

    @OneToMany
    @JoinColumn(name="preview_top_offers_id")
    private List<computersCommentsModel> computersCommentsModel;

    @OneToMany
    @JoinColumn(name="preview_pc_basket_id")
    private List<computerBasket> pcBaskets;

    public List<computerBasket> getPcBaskets() {
        return pcBaskets;
    }

    public void setPcBaskets(List<computerBasket> pcBaskets) {
        this.pcBaskets = pcBaskets;
    }

    public List<com.elsoprojekt.webProjekt.Model.computersCommentsModel> getComputersCommentsModel() {
        return computersCommentsModel;
    }

    public void setComputersCommentsModel(List<com.elsoprojekt.webProjekt.Model.computersCommentsModel> computersCommentsModel) {
        this.computersCommentsModel = computersCommentsModel;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public PreviewTopOffers() {
    }

    public String getProcesszor() {
        return processzor;
    }

    public void setProcesszor(String processzor) {
        this.processzor = processzor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public String toString() {
        return "Preview [id=" + id + "+Title=" + Title + "+url="+ url +"price="+ price + "processor =" +processzor+ "memory="+memory+"+gpu="+gpu+"]";
    }

}
