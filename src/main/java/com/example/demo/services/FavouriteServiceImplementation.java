package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.FavouriteList;
import com.example.demo.repositories.FavouriteRepository;

@Service
public class FavouriteServiceImplementation implements FavouriteService{

	@Autowired
	FavouriteRepository frepo;
	
	
	
	@Override
	public void addFavourite(FavouriteList favouritelist)
	{
		frepo.save(favouritelist);
	}

	@Override
	public List<FavouriteList> favouritelist() {
		
		return frepo.findAll();
	}

//	@Override
//	public FavouriteList getFavouriteList(String email) {
//		
//		return frepo.save(email);
//	}

//	@Override
//	public void upadateEmail(String email) {
//		
//		frepo.save(email);
//	}
//
//	
	

	
}
