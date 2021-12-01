package com.example.My;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Details {
	@JsonIgnore
    private Long zip;
		
		String state;
		String city;
		String country;
		
		public Details(Long zip, String state, String city, String country) {
			super();
			this.zip = zip;
			this.state = state;
			this.city = city;
			this.country = country;
		}
		
		public Long getZip() {
			return zip;
		}
		public String getState() {
			return state;
		}
		public String getCity() {
			return city;
		}
		public String getCountry() {
			return country;
		}
		@Override
		public String toString() {
			return "Details  state=" + state + ", city=" + city + ", country=" + country + "]";
		}
		

}
