package com.brainfuel.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brainfuel.dao.IQuoteDAO;
import com.brainfuel.entity.Quotes;

@Service
public class QuoteService implements IQuoteService {

	private IQuoteDAO quoteDAO;
	
	@Autowired	
	public QuoteService(IQuoteDAO quoteDAO) {
		super();
		this.quoteDAO = quoteDAO;
	}

//	@Override
//	public List<Quotes> findAllQuotes() {
//		return (List<Quotes>) quoteDAO.findAll();
//	}
	
	private long quoteIdGenerator() {
		
		Random randomQuoteIdGenerator = new Random();
		long randomQuoteId = randomQuoteIdGenerator.nextLong(this.quoteDAO.count() + 1) + 1;
		
		return randomQuoteId;
	}
	
	@Override
	public Optional<Quotes> getQuoteByRandomId() {
		return quoteDAO.findById(quoteIdGenerator());
	}


}
