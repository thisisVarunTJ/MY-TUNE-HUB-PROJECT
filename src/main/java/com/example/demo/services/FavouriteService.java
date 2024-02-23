package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.FavouriteList;


public interface FavouriteService {

	public void addFavourite(FavouriteList favouritelist);

	//public FavouriteList getFavouriteList(String email);

	public List<FavouriteList> favouritelist();

	//public void upadateEmail(String email);

	
}
