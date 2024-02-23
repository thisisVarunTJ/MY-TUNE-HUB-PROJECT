package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.FavouriteList;
import com.example.demo.entities.PlayList;
import com.example.demo.entities.Songs;
import com.example.demo.entities.Users;
import com.example.demo.services.FavouriteService;
import com.example.demo.services.PlayListService;
import com.example.demo.services.SongsService;
import com.example.demo.services.UsersService;

import jakarta.servlet.http.HttpSession;

@Controller
public class FavouritesController {
	
//	@Autowired
//	UsersService service;
//	
	@Autowired
	FavouriteService fserv;
	
	@Autowired
	SongsService sserv;

	
	
	@GetMapping("/addFavourites")
	public String createFavouriteList(Model model)
	{
		//fetching the songs using songs service
		List<Songs> songslist = sserv.fetchAllSongs();
		
		//adding the songs in the model
		model.addAttribute("songslist", songslist);
		
		//sending create playlist
		return "favourites";
	}
	
	@PostMapping("/favouritelist")
	public String addFavourite(@ModelAttribute FavouriteList favouritelist)
	{
		
//		String email=(String) model.getAttribute("email");
//		//get all songs selected on front end = favList2
//		
//		//get user with email
//		
//		//get favList of user
//		
//		//add favList2 to favList
//		
//		//update users object
//		
//		Users user = service.getUser(email);
//		
//		String gemail=user.getEmail();
//		
		
		//adding songs to favouritelist
		fserv.addFavourite(favouritelist);
		
		
		//update song table
		
		List<Songs> songList= favouritelist.getSong();
		
		for(Songs song : songList)
		{
			song.getFavouritelist().add(favouritelist);
			sserv.updateSong(song);
		}
		return "favouritelistsuccess";
	}
	
	@GetMapping("/showFavourites")
	public String viewFavouriteList(Model model)
	{
		List<FavouriteList> flist = fserv.favouritelist();
		model.addAttribute("plist",flist);
		return "viewFav";
		
	}
	
}
