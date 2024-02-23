package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.FavouriteList;

public interface FavouriteRepository extends JpaRepository<FavouriteList, Integer>{

	public FavouriteList save(String name);

}
