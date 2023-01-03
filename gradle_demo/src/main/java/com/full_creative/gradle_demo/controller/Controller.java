package com.full_creative.gradle_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.full_creative.gradle_demo.model.Book;
import com.full_creative.gradle_demo.service.BookService;

@RestController
@Transactional(rollbackFor = Exception.class)
public class Controller {

	@Autowired
	BookService bookService;

	@GetMapping("/hello")
	public String sayHello() {
		return "hello from gradle";
	}

//	@PostMapping("/save")
//	public String saveData(@RequestBody Book book) throws Exception {
//
//		bookService.save(book);
//		return "Inserton Successful";
//
//	}

	@PostMapping("/saveDataObjectify")
	public String savDataObjectify(@RequestBody Book book) {
		bookService.saveObjectify(book);
		return "Insertion Successfull";
	}
	
	@DeleteMapping("/delete")
	public String deleteObject(@RequestBody Book book) {
		bookService.deleteBook(book);
		return "Deletion Successfull"; 
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Book book) {
		bookService.updateBook(book);
		return "Update Successfull";
	}
	
	@GetMapping("/findbyId")
	public Book findById(@RequestParam Long id) {
		return (Book)bookService.findById(id).get();
	}
	
	@GetMapping("/findAll")
	public List<Object> findAll(){
		return bookService.fetchAll();
	}
	

}
