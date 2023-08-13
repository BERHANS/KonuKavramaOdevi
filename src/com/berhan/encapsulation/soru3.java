package com.berhan.encapsulation;

public class soru3 {

	private double maas;
	private String isim;
	private int yas;

	
	//getter setter methodlar private bilgilerin istenildiği ölçekte ulaşılabilirliğini sağlar. 
			//set methodu bilgiyi alırken get methodu biligiyi veriri.

	
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
	
}
