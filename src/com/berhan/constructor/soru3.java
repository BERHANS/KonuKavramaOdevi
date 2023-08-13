package com.berhan.constructor;

public class soru3 {

	//copy constructor kod kirliliğini azaltır.
	
	String name;
	int yas;
	String meslek;
	
	public soru3(String name, int yas, String meslek) {
		this.name = name;
		this.yas = yas;
		this.meslek=meslek;
		
	}
	
	public soru3(soru3 kisi) {
		this.meslek = kisi.meslek;
		this.name = kisi.name;
		this.yas = kisi.yas;
	}
}
