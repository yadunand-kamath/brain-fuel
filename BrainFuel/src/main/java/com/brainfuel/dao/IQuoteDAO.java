package com.brainfuel.dao;

import org.springframework.data.repository.CrudRepository;

import com.brainfuel.entity.Quotes;

public interface IQuoteDAO extends CrudRepository<Quotes, Long> {

	
}
