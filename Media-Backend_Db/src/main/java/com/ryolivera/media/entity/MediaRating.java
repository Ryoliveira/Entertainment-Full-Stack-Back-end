package com.ryolivera.media.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="media_rating")
public class MediaRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "source")
    private String source;

    @Column(name="value")
    private String value;

    @ManyToOne
    @JoinColumn(name = "media_id", nullable = false)
    private Media media;

}
