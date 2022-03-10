package com.bino.academy.repository;

import java.util.List;

import com.bino.academy.controller.Library;

public interface LibraryRepositoryCustom {
	
	List<Library> findAllByAuthor(String authorName);

}
