package com.florian.geektic.entity;

import java.util.*;
import javax.persistence.*;

@Entity
public class Geek {

	@Id
	private Long id;
	
	private String nickname;
	private String sexe;
	private Long score;
	
	@ManyToMany
    @JoinTable(name="GEEKS_INTERESTS",
        joinColumns=
            @JoinColumn(name="idGeek", referencedColumnName="ID"),
        inverseJoinColumns=
            @JoinColumn(name="idInterest", referencedColumnName="ID")
    )
	private List<Interest> interests = new ArrayList<Interest>(0);
	
	//Constructors
	public Geek(){
	}

	public Geek(Long id, String nickname, List<Interest> interests, String sexe) {
		this.id = id;
		this.nickname = nickname;
		this.interests = interests;
		this.sexe = sexe;
	}
	
	public Geek(String nickname, List<Interest> interests, String sexe){
		this.nickname = nickname;
		this.interests = interests;
		this.sexe = sexe;
	}

	//get-set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public List<Interest> getInterests() {
		return interests;
	}

	public void setInterests(List<Interest> interests) {
		this.interests = interests;
	}

	public Long getNbview() {
		return score;
	}

	public void setNbview(Long nbview) {
		this.score = nbview;
	}
	
	
}
