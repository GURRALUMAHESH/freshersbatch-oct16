package com.example.My;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DetailService {

	public List<Details> details=Arrays.asList(new Details(111l,"Kerala","Kochi","India"),new Details(112l,"Kerala","Piravom","India"),new Details(114l,"Kerala","Muvt","India"));

	public List<Details> getAllDetails() {
		
		return details;
	}

	public Details getDetails(Long id) {
		
		return details.stream().filter(t -> t.getZip().equals(id)).findFirst().get();
	}

}
