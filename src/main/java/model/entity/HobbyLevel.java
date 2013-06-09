package model.entity;

public enum HobbyLevel {
	noobie("Noobie"),
	random("Random"),
	casual("Casual"),
	half("Half-lifed"),
	hardcore("Hardcore"),
	noLife("No life"),
	pgm("pgm"),
	cheater("cheater");
	
	private final String label;

	private HobbyLevel(String label) {
		this.label = label;
	}

}
