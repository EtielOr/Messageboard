package com.example.etiel.messageboard.messageboard.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@NoArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue
    @Getter
    private Long id;


    @Getter
    @Setter
    @NotBlank(message = "replay can't be empty")
    private String message;

    @Getter
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Post post;


    @PrePersist
    protected void onCreate() {
        createdDate = new Date();
    }

}
