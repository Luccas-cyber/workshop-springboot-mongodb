package com.luccascyber.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luccascyber.workshopmongo.domain.Post;
import com.luccascyber.workshopmongo.exception.ObjectNotFoundException;
import com.luccascyber.workshopmongo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}
