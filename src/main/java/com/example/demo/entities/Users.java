package com.example.demo.entities;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.UsersService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Users {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 int id;
	 String username;
	 String email;
	 String password;
	 String gender;
	 String role;
	 String address;
	 
	 boolean isPremium;
	 
	 @ManyToMany
	 List<Songs> song;

	 @ManyToMany
	 List<Songs> favSongs;
	
	 public Users() {
		super();
		
	}

	public Users(int id, String username, String email, String password, String gender, String role, String address,
			boolean isPremium) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
		this.address = address;
		this.isPremium = isPremium;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", role=" + role + ", address=" + address + ", isPremium=" + isPremium + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	 	 
}
