package com.full_creative.gradle_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.full_creative.gradle_demo.configuration.ObjectifyRegistry;
import com.full_creative.gradle_demo.model.Book;
import com.full_creative.gradle_demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

//	public void save(Book book) {
//
//		bookRepository.save(book);
//
//	}

	public void saveObjectify(Book book) {

		ObjectifyRegistry.ofy().save().entity(book).now();
//    	Objectify ofy=new ObjectifyFactory().begin();
//    	ObjectifyService.register(Book.class);
//    	ofy()
//    	ofy.save().entity(book).now();

	}

	public void deleteBook(Book book) {
		ObjectifyRegistry.ofy().delete().entity(book).now();
	}
	
	
	public void updateBook(Book book) {
		ObjectifyRegistry.ofy().save().entity(book).now();
	}
	
	public List<Object> fetchAll() {
		return ObjectifyRegistry.ofy().load().list();
	}
	
	public Optional<Object> findById(Long id) {
		return ObjectifyRegistry.ofy().load().list().stream().filter(e->((Book)e).getId()==id).findFirst();
	}
}
