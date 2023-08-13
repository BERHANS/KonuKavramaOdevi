package com.berhan.encapsulation;

public class soru1 {

	// java da encapsulation dışardan erişilmesini istemediğimiz verilerin korunumu adına büyük önem taşır.
	 
	private String tcNo;
	private Double maas;
	private int yas;
	public String getTcNo() {
	
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public Double getMaas() {
		return maas;
	}
	public void setMaas(Double maas) {
		this.maas = maas;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
	
	
}
