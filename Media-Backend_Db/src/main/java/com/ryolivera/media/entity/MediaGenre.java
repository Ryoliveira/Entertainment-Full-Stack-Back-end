package com.ryolivera.media.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "media_genre")
public class MediaGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "genre")
    private String genre;
}
