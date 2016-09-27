package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class WatchingOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WatchingOracleApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(MovieRepository movieRepository) {
		return (args) -> {

			movieRepository.deleteAll();

			// save a couple of movies
			movieRepository.save(new Movie("Frozen", "2013", "PG", "27 Nov 2013", "102 min", "Animation, Adventure, Comedy"));
			movieRepository.save(new Movie("Toy Story", "1995", "G", "22 Nov 1995", "81 min", "Animation, Adventure, Comedy"));
			movieRepository.save(new Movie("Muppets Most Wanted", "2014", "PG", "21 Mar 2014", "107 min", "Adventure, Comedy, Crime"));
			movieRepository.save(new Movie("The Incredibles", "2004", "PG", "05 Nov 204", "115 min", "Animation, Action, Adventure"));

			// fetch all movies
			System.out.println("Movies found with findAll()");
			System.out.println("---------------------------");
			for (Movie movie : movieRepository.findAll()) {
				System.out.println(movie.toString());
			}


			// fetch one movie
			System.out.println("Movies found with findOne()");
			System.out.println("---------------------------");
			Movie movie = movieRepository.findOne(1L);


			// fetch movies by title
			System.out.println("Movies found with findByTitle('Frozen')");
			System.out.println("---------------------------");
			for (Movie frozen : movieRepository.findByTitle("Frozen", new PageRequest(1, 10))) {
				System.out.println(frozen.toString());
			}

		};
	}
}
