package br.com.rodrigo.mavenspring;

public class HelloUser {

	private final long id;
	private String setence;
	
	public HelloUser(long id,String setence) {
		this.setence = setence;
		this.id = id;
	}

	public String getName() {
		return setence;
	}

	public void setName(String setence) {
		this.setence = setence;
	}

	public long getId() {
		return id;
	}
	
	
}
