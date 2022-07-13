package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;

@Entity
@Table(name="basket")
public class BasketModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Title;

    @Column (name="price")
    private int price;

    

    public BasketModel() {

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
    @Override
    public String toString() {
        return "Preview [id=" + id + "+Title=" + Title + "price="+ price +"]";
    }
}
