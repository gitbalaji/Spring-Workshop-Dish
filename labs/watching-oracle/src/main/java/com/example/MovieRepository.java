package com.example;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "movies", path = "movies")
public interface MovieRepository extends PagingAndSortingRepository<Movie, Long> {
    Page<Movie> findByTitle(@Param("title") String title, Pageable pageable);

    Page<Movie> findByRated(@Param("rated") String rated, Pageable pageable);

    Page<Movie> findByGenreStartsWith(@Param("genre") String genre, Pageable pageable);

    @Query(value = "SELECT *  FROM MOVIE WHERE TITLE = ?1",
        nativeQuery = true)
    Page<Movie> findByYear(@Param("year") String year, Pageable pageable);
}
