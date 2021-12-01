package microservices.moviecatalogservice.resource;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import microservices.moviecatalogservice.models.CatalogItem;
import microservices.moviecatalogservice.models.Movie;
import microservices.moviecatalogservice.models.UserRating;


@RestController
@RequestMapping("/catalog")
public class MovieCatlogService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		
		
		
		UserRating ratings= restTemplate.getForObject("http://localhost:8083/ratingdata/users/"+userId, UserRating.class);
		
		return ratings.getUserRating().stream().map(rating ->{
			//for each movieId, call infoservice and get details
			Movie movie=restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			//put them all together
			return new CatalogItem(movie.getName(),"test",rating.getRating());
		})
				.collect(Collectors.toList());
//		
//			Movie movie=webClientBuilder.build() 
//			.get()
//			.uri("http://localhost:8082/movies/"+rating.getMovieId())
//			.retrieve()
//			.bodyToMono(Movie.class)
//			.block();
				
//				.collect(Collectors.toList());
//		
	}
}
