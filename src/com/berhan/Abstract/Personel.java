package com.berhan.Abstract;

public abstract class Personel {

int ilkGun,sonGun ;
    
   void hesapla(int ilkGun, int sonGun) {
        this.ilkGun = ilkGun;
        this.sonGun = sonGun;
    }
	
	
	abstract void gunHesapla();
	
	
	
}
