package com.brainfuel.service;

import java.util.List;
import java.util.Optional;

import com.brainfuel.entity.Quotes;

public interface IQuoteService {

//	List<Quotes> findAllQuotes();
	Optional<Quotes> getQuoteByRandomId();
	
}
