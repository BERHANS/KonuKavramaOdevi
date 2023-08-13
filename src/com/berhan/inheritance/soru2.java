package com.berhan.inheritance;

public class soru2 {

	String isim;
	String cinsiyet;
	
	
	public soru2(String isim, String cinsiyet) {
		super();
		this.isim = isim;
		this.cinsiyet = cinsiyet;
		System.out.println("soru2 sınıfı(miras alınan sınıfın)constructoru çalıştı");
	}


	public void konus(String isim,String cinsiyet) {
		System.out.println(cinsiyet +" "+ isim +" "+ "konuştu");
	}
	
	
}
