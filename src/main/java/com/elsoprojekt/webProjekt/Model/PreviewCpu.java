package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="previewCpu")
public class PreviewCpu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Title;

    @Column(name ="url")
    private String url;

    @Column (name="price")
    private int price;

    @Column (name ="cores")
    private int cores;

    @Column(name ="clock")
    private String clock;

    @Column(name = "socket")
    private String socket;

    @OneToMany
    @JoinColumn(name = "preview_cpu_id")
    private List<cpuCommentsModel> cpuCommentsModels;

    @OneToMany
    @JoinColumn(name="preview_cpu_basket_id")
    private List<cpuBasket> cpuBaskets;

    public List<cpuBasket> getCpuBaskets() {
        return cpuBaskets;
    }

    public void setCpuBaskets(List<cpuBasket> cpuBaskets) {
        this.cpuBaskets = cpuBaskets;
    }

    public PreviewCpu(Long preview_cpu_id) {

    }

    public List<cpuCommentsModel> getCpuCommentsModels() {
        return cpuCommentsModels;
    }

    public void setCpuCommentsModels(List<cpuCommentsModel> cpuCommentsModels) {
        this.cpuCommentsModels = cpuCommentsModels;
    }

    public PreviewCpu() {

    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public Long getId() {
        return id;
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
        return "Preview [id=" + id + "+Title=" + Title + "+url="+ url +"price="+ price + "cores =" +cores+ "clock="+clock+"socket="+socket+"]";
    }
}
