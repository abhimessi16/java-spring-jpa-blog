package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public interface PostRepository extends JpaRepository<Post, Long>{
	
	// maybe if there is a column name then all you have to do is 
	// create a new method in the interface and spring 
	// would just implement it
	List<Post> findByCategory(Category category);
}
