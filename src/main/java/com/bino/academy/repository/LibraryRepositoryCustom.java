package com.aubin.academy.repository;

import java.util.List;

import com.aubin.academy.controller.Library;

public interface LibraryRepositoryCustom {
	
	List<Library> findAllByAuthor(String authorName);

}
