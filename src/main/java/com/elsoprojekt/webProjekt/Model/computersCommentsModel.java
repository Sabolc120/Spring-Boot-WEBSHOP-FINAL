package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;

@Entity
public class computersCommentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Lob
    private String comment;

    @ManyToOne
    @JoinColumn(name="preview_top_offers_id")
    private PreviewTopOffers previewTopOffers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public PreviewTopOffers getPreviewTopOffers() {
        return previewTopOffers;
    }

    public void setPreviewTopOffers(PreviewTopOffers previewTopOffers) {
        this.previewTopOffers = previewTopOffers;
    }

    @Override
    public String toString() {
        return "computersCommentsModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", comment='" + comment + '\'' +
                ", previewTopOffers=" + previewTopOffers +
                '}';
    }
}
