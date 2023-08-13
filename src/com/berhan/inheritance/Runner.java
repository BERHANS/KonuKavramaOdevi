package com.berhan.inheritance;

public class Runner {
public static void main(String[] args) {
	
	//soru1**
	soru1_1 soru = new soru1_1();
	soru.isim = "mahmut";

	//soru2**//soru3:super anahtar kelimesi miras alınan sınıfın consturctor unu ifade eder. miras alınan sınıfın constructorunu çağırır**
	soru2_2 soruI = new soru2_2("ahmet","erkek");
	soruI.konus("ahmet", "erkek");
	

	
}
}
