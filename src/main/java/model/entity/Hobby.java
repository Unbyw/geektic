package model.entity;

public class Hobby {
	private Long id;
	private String label;
	private HobbyLevel level;
	
	//Constructors
	public Hobby(){
		
	}
	
	
	//Get-set	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public HobbyLevel getLevel() {
		return level;
	}
	public void setLevel(HobbyLevel level) {
		this.level = level;
	} 
	
	
	//Methods
	
}
