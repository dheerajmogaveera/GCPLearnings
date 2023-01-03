package com.full_creative.gradle_demo.configuration;


import com.full_creative.gradle_demo.model.Book;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class ObjectifyRegistry {

	static {
		ObjectifyService.register(Book.class);
	}

	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}
}