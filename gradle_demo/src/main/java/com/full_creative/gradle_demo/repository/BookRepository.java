package com.full_creative.gradle_demo.repository;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.stereotype.Repository;

import com.full_creative.gradle_demo.model.Book;

@Repository
public interface BookRepository extends DatastoreRepository<Book,Long>{
    
}
