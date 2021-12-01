package microservices.ratingsdataservice.resources;

import java.util.Arrays;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.ratingsdataservice.models.Rating;
import microservices.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingsResource {

	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable String userId) {
		List<Rating> ratings=Arrays.asList(
				new Rating("1234",4),
				new Rating("5678",3)
				);
		
		UserRating userRating=new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
				
	}
	
}
