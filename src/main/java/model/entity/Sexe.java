package model.entity;

public enum Sexe {
	male("male"),
	female("female"),
	shemale("shemale");
	
	private final String label;

	private Sexe(String label) {
		this.label = label;
	}
}
