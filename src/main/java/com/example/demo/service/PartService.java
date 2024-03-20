package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Part;
import com.example.demo.repository.PartRepository;
import java.util.List;
import java.util.UUID;

@Service
public class PartService {

	PartRepository partRepository;

	public PartService(PartRepository partRepository) {
		this.partRepository = partRepository;
	}
	
	
	public Part addPart (Part part) {
		part.setName(UUID.randomUUID().toString());
				return partRepository.save(part);
	}

	
	public List<Part> findAllParts() {
		return partRepository.findAll();
	}

	public Part updatePart (Part part) {
		return partRepository.save(part);
	}

	public Part findPartById(Long id) {
	    return partRepository.findPartById(id)
	    		.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}

	public void deletePart(Long id){
		partRepository.deleteById(id);
	}	
	
	
	
}
