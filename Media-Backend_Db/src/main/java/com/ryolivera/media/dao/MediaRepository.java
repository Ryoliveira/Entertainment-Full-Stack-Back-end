package com.ryolivera.media.dao;

import com.ryolivera.media.entity.Media;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "media", path = "media-data")
public interface MediaRepository extends JpaRepository<Media, Integer> {

    Page<Media> findAllByOrderByYearDesc(Pageable pageable);

    Page<Media> findByImdbId(@RequestParam("imdbId") String imdbId, Pageable pageable);

    Page<Media> findByYear(@RequestParam("year") String year, Pageable pageable);

    Page<Media> findByType(@RequestParam("type") String type, Pageable pageable);

    Page<Media> findByCountry(@RequestParam("country") String country, Pageable pageable);

    Page<Media> findByGenreContainingOrderByYearDesc(@RequestParam("genre") String genre, Pageable pageable);

    Page<Media> findByTitleLikeIgnoreCase(@RequestParam("title") String title, Pageable pageable); // try adding ignore case

    //todo figure out a way to search and get better results with Containing keyword
}
