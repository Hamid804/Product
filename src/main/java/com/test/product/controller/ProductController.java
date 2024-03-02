package com.test.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.product.dto.PersonDto;

@RestController
public class ProductController {

	@GetMapping("/person")
	public ResponseEntity<PersonDto> getPerson() {
		final PersonDto personDto = new PersonDto("Anushka Chhinal", "Narkatiaganj", 25);

		return ResponseEntity.ok(personDto);
	}
}
