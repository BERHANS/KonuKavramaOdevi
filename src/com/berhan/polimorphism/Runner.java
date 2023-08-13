package com.berhan.polimorphism;

public class Runner {
public static void main(String[] args) {
	
	doktor doktor = new doktor();
	
	doktor.gorevTamam();//dinamik polimorphism ve interface kullanımı
	
	temizlik_personeli temizlik = new temizlik_personeli();
	
	temizlik.gorevTamam();//statik polimorphism
	
	
	
}
}
