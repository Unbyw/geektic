package model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Geek {
	@Id
	private Long id;
	private String nickname;
	private Interest interest;
	private Sexe sexe;
	
	//Constructors
	public Geek(){
		this.id = getId();
		this.nickname = getNickname();
		this.interest = getInterest();
		this.sexe = getSexe();
		
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

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
}
