package com.berhan.constructor;

public class Runner {

	public static void main(String[] args) {
		soru3 kisi = new soru3("hasan", 18, "nalbur");
		
		soru3 copyc = new soru3(kisi);
		
		System.out.println(kisi.name + " " + kisi.yas +" "+kisi.meslek  );

	}

}
