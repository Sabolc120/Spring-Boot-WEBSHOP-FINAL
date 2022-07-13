package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;

@Entity
public class gpuCommentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    @Lob
    private String comment;

    @ManyToOne
    @JoinColumn(name ="preview_gpu_id")
    private Preview previewGpu;

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

    public Preview getPreviewGpu() {
        return previewGpu;
    }

    public void setPreviewGpu(Preview previewGpu) {
        this.previewGpu = previewGpu;
    }
    @Override
    public String toString() {
        return "gpuCommentsModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", comment='" + comment + '\'' +
                ", previewGpu=" + previewGpu +
                '}';
    }
}
