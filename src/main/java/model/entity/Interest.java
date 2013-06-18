package model.entity;

public enum Interest {
	java("Java"),
	dotnet(".Net"),
	php("PHP"),
	oracle("Oracle"),
	sqlserver("SqlServer"),
	mysql("MySQL");
	
	private final String label;

	private Interest(String label) {
		this.label = label;
	}
}
