package com.qa.doggo;

import java.util.ArrayList;
import java.util.List;

public class DoggoCompetition {

	public List<String> competition(int place) {
		List<String> places = new ArrayList<String>();

		for (int i = 1; i <= 100; i++) {
			if (i == place) {
				continue;
			} else if (i % 10 > 3 || i % 10 == 0 || (i > 10 && i < 14)) {
				places.add(i + "th");
			} else if (i % 10 == 1) {
				places.add(i + "st");
			} else if (i % 10 == 2) {
				places.add(i + "nd");
			} else if (i % 10 == 3) {
				places.add(i + "rd");
			}
		}
		System.out.println(places);
		return places;
	}

}
