package com.berhan.inheritance;

public class soru2_2 extends soru2{

	
	

	// çoklu kalıtımın javada desteklenmemesinin sebebi kod karışıklığına yol açmasıdır çünkü aynı isimde başka işlevi yapan 
	//methodlar olabilir.
	//bunun önüne geçmek için override yapabiliriz.
	
	@Override
	public void konus(String isim, String cinsiyet) {
		System.out.println(isim + " " + cinsiyet +" "+ "bağırdı");
	
	
	}

	public soru2_2(String isim, String cinsiyet) {
		super(isim, cinsiyet);
		
	}
}
