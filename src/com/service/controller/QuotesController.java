package com.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.Service.QuoteService;
import com.service.model.Quotes;

@RestController
@RequestMapping(value = "/quotes")
public class QuotesController {
	
	@Autowired
	QuoteService quoteService;
	
    @RequestMapping(value = "/getquotes", method = RequestMethod.GET)
    public List<Quotes> getAllQuotes() {
    	return quoteService.getAllQuotesServiceMethod();
    }

}
