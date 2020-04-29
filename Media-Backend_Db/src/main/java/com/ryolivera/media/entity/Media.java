package com.ryolivera.media.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private String year;

    @Column(name = "rated")
    private String rated;

    @Column(name = "released")
    private String released;

    @Column(name = "season")
    private  String season;

    @Column(name = "episode")
    private String episode;

    @Column(name = "runtime")
    private String runtime;

    @Column(name = "genre")
    private String genre;

    @Column(name = "director")
    private String director;

    @Column(name = "writer")
    private String writer;

    @Column(name = "actors")
    private String actors;

    @Column(name = "plot")
    private  String plot;

    @Column(name = "language")
    private  String language;

    @Column(name = "country")
    private String country;

    @Column(name = "awards")
    private  String awards;

    @Column(name = "poster")
    private  String poster;

    @Column(name = "metascore")
    private  String metascore;

    @Column(name = "imdb_rating")
    private  String imdbRating;

    @Column(name = "imdb_votes")
    private  String imbdVotes;

    @Column(name = "imdb_id")
    private String imdbId;

    @Column(name = "series_id")
    private  String seriesId;

    @Column(name = "type")
    private  String type;

    @Column(name = "dvd")
    private String dvd;

    @Column(name = "total_seasons")
    private  String totalSeasons;

    @Column(name = "box_office")
    private  String boxOffice;

    @Column(name = "production")
    private  String production;

    @Column(name = "website")
    private   String website;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "media")
    private Set<MediaRating> mediaRatings;








}
