package com.brainfuel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@jakarta.persistence.Table(name="quotes", schema="brainfood")
//@NoArgsConstructor
//@Data
public class Quotes {
	
	@Id
	@Column(name="quote_id")
	Long quoteId;
	
	@Column(name="quote")
	String quote;
	
	@Column(name="source")
	String source;

	public Quotes() {
		super();
	}

	public Quotes(Long quoteId, String quote, String source) {
		super();
		this.quoteId = quoteId;
		this.quote = quote;
		this.source = source;
	}

	public Long getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(Long quoteId) {
		this.quoteId = quoteId;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Quotes [quoteId=" + quoteId + ", quote=" + quote + ", source=" + source + "]";
	}
	
	
}
