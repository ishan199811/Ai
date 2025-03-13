package com.Ai.AiBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Ai.AiBackend.service.AiService;
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React
@RestController
@RequestMapping("/api")
public class AiController {

	

	
	@Autowired
	AiService aiService;
	
	
	@GetMapping("/aiResponse")
	public ResponseEntity<String> getResponse(@RequestParam(value="inputText")String inputText){
		
		String response=aiService.getAiResponse(inputText);
		
		return ResponseEntity.ok(response);
	}
}
