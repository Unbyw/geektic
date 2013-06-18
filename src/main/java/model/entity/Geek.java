package model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Geek {


	@Id
	private Long id;
	private String nickname;
	private List<Interest> interests;
	private Sexe sexe;
	
	//Constructors
	public Geek(){
	}

	public Geek(Long id, String nickname, List<Interest> interests, Sexe sexe) {
		this.id = id;
		this.nickname = nickname;
		this.interests = interests;
		this.sexe = sexe;
	}
	
	public Geek(String nickname, List<Interest> interests, Sexe sexe){
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

	public List<Interest> getinterests() {
		return interests;
	}

	public void setinterests(List<Interest> interests) {
		this.interests = interests;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	
	
}
