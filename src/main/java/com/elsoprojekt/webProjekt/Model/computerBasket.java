package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;

@Entity
public class computerBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private String productUrl;

    private int productPrice;

    @ManyToOne
    @JoinColumn(name="preview_pc_basket_id")
    private PreviewTopOffers previewTopOffers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public PreviewTopOffers getPreviewTopOffers() {
        return previewTopOffers;
    }

    public void setPreviewTopOffers(PreviewTopOffers previewTopOffers) {
        this.previewTopOffers = previewTopOffers;
    }

    @Override
    public String toString() {
        return "computerBasket{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productUrl='" + productUrl + '\'' +
                ", productPrice=" + productPrice +
                ", previewTopOffers=" + previewTopOffers +
                '}';
    }
}
