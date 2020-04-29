package com.ryolivera.media.dao;

import com.ryolivera.media.entity.MediaGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200")
public interface MediaGenreRepository extends JpaRepository<MediaGenre, Integer> {
}
