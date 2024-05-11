package com.brainfuel.controller;

import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brainfuel.entity.Quotes;
import com.brainfuel.service.IQuoteService;

@Controller
@RequestMapping("/api/quotes")
public class QuoteController {
	
	private IQuoteService quoteService;

	public QuoteController(IQuoteService quoteService) {
		this.quoteService = quoteService;
	}
	
	
//	@GetMapping("/quote")
//	public List<Quotes> getQuotes(){
//		return this.quoteService.findAllQuotes();
//	}
	
	@GetMapping("/quote")
	public String FindQuoteById(Model model){
		Optional<Quotes> optionalQuote = this.quoteService.getQuoteByRandomId();
		if(optionalQuote.isPresent()) {
			Quotes getQuote = optionalQuote.get();
			if(getQuote.getSource() == null)
				getQuote.setSource("Unknown");
			model.addAttribute("quote", optionalQuote.get());
		}
		return "quote-bank";
	}	

}
