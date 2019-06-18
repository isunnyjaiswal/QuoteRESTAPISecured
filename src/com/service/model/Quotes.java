package com.service.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Quotes {
	private Long id;
	private String quote;
	private String author;
	
	public Quotes(){		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Quotes(Long id, String quote, String author) {
		super();
		this.id = id;
		this.quote = quote;
		this.author = author;
	}
}
