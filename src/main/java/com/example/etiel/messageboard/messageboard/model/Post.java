package com.example.etiel.messageboard.messageboard.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;


@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue
    @Getter
    private Long id;

    @Getter
    @Setter
    @NotBlank(message = "post need to has title")
    private String title;

    @Getter
    @Setter
    @NotBlank(message = "post need to has body")
    private String message;

    @Getter
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @PrePersist
    protected void onCreate() {
        createdDate = new Date();
    }
}
