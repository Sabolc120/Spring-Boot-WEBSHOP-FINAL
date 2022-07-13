package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;

@Entity
public class cpuCommentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Lob
    private String comment;

    @ManyToOne
    @JoinColumn(name="preview_cpu_id")
    private PreviewCpu previewCpu;


    public cpuCommentsModel() {
    }

    public cpuCommentsModel(Long id, String username, String comment) {
        this.id = id;
        this.username = username;
        this.comment = comment;
    }

    public cpuCommentsModel(String username, String comment) {
        this.username = username;
        this.comment = comment;
    }

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

    public PreviewCpu getPreviewCpu() {
        return previewCpu;
    }

    public void setPreviewCpu(PreviewCpu previewCpu) {
        this.previewCpu = previewCpu;
    }

    @Override
    public String toString() {
        return "cpuCommentsModel{" +
                "id=" + id +
                ", username=" + username +
                ", comment=" + comment +
                ", previewCpu=" + previewCpu +
                '}';
    }
}
