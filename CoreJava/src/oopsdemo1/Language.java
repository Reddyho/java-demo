package oopsdemo1;

/**
* Author :Koppula.Reddy
* Date   :Oct 26, 2024
* Time   :4:12:16 PM
* email  :Koppula.Reddy@coforge.com
* 
* program for constructor over loading
*/

public class Language {
	
	private String name;
	private float version;
	
	public Language() {
		this.name="java";
		this.version=8.0f;
		System.out.println("the language is :"+this.name+"-V"+this.version);
	}

	public Language(String name) {
		this.name = name;
		this.version=5.0f;
		System.out.println("the language is :"+this.name+"-V"+this.version);
	}

	public Language(float version) {
		this.version = version;
		this.name="python";
		System.out.println("the language is :"+this.name+"-V"+this.version);
	}

	public Language(String name, float version) {
		this.name = name;
		this.version = version;
		System.out.println("the language is :"+this.name+"-V"+this.version);
	}
	

}
