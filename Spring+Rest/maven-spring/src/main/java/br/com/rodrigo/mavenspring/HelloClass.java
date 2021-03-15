package br.com.rodrigo.mavenspring;


public class HelloClass {
	
	private final long id;
	private final String word;
	
	public HelloClass(long id, String word) {
		this.id = id;
		this.word = word;
	}
	public long getId() {
		return this.id;
	}
	public String getWord() {
		return this.word;
	}
	
}
