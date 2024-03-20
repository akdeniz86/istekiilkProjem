package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.model.Part;

import com.example.demo.service.PartService;


@RestController
@RequestMapping("/part")
public class PartController {
		
	
	private final PartService partService;

	
	public PartController(PartService partService) {
		this.partService = partService;
	}	
	
	@GetMapping("/all")
	public List<Part> getAllParts(){
		return  partService.findAllParts();		
	}
	
	@GetMapping("/all/{id}")
	public ResponseEntity<Part> getPartById(@PathVariable("id")Long id){		
		Part Part = partService.findPartById(id);
		return new ResponseEntity<>(Part, HttpStatus.OK);		
	}	
	
	@PostMapping("/add")
	public ResponseEntity<Part> addPart(@RequestBody Part part){		
		Part newPart = partService.addPart(part);
		return new ResponseEntity<>(newPart, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Part> updatePart(@RequestBody Part part){		
		Part updatePart = partService.updatePart(part);
		return new ResponseEntity<>(updatePart, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletePart(@PathVariable("id")Long id){		
	partService.deletePart(id);
		return new ResponseEntity<>( HttpStatus.OK);	
	}
	

}
