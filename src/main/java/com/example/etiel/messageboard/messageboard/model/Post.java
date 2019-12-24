package com.example.etiel.messageboard.messageboard.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "post need to has title")
    private String title;
    @NotBlank(message = "post need to has body")
    private String message;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public Post() {
    }

    @PrePersist
    protected void onCreate() {
        createDate = new Date();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
