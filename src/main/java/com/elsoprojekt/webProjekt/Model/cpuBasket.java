package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;

@Entity
public class cpuBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productname;

    private String producturl;

    private int productprice;

    @ManyToOne
    @JoinColumn(name="preview_cpu_basket_id")
    private PreviewCpu previewCpu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducturl() {
        return producturl;
    }

    public void setProducturl(String producturl) {
        this.producturl = producturl;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public PreviewCpu getPreviewCpu() {
        return previewCpu;
    }

    public void setPreviewCpu(PreviewCpu previewCpu) {
        this.previewCpu = previewCpu;
    }

    @Override
    public String toString() {
        return "cpuBasket{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                ", producturl='" + producturl + '\'' +
                ", productprice=" + productprice +
                ", previewCpu=" + previewCpu +
                '}';
    }
}
