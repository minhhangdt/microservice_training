package com.brownfield.pss.luggage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.brownfield.pss.luggage.component.LuggageComponent;
import com.brownfield.pss.luggage.entity.Luggage;


@RestController
@CrossOrigin
@RequestMapping("/luggage")
public class LuggageController {

	LuggageComponent component;

	@Autowired
	LuggageController(LuggageComponent component) {
		this.component = component;
	}

	@RequestMapping(value = "/getLuggage", method = RequestMethod.GET)
	Luggage getLuggage(@RequestParam(value = "checkInId") Long checkInId) {
		return component.getLuggage(checkInId);
	}

	@RequestMapping(value = "/createLuggage", method = RequestMethod.POST)
	public long createLuggage(@RequestBody Luggage luggage) {
		return component.createLuggage(luggage);
	}
}
