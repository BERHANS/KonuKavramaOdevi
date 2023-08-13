package com.berhan.encapsulation;

public class soru2 {

	
	/**
	 * 
	 * private: accesmodifieri değişkenin sadece kullanıldığı sınıfta görüntülenmesini sağlar.
	 * public: accesmodifieri değişkenin başka paketlerden de ulaşılabilirliğini sağlar. 
	 * protected: sadece değişkenin kullanıldığı paket içerisinde erişimini sağlar.
	 * 
	 */

	private String tcNo;//bu bilginin müşteri bilgilerini yer alan bir sınıfta tutulması daha doğru olur.
	//başka bir sınıftan erişilmemesi gerekir özel bilgidir.
	
	public int gözlükNo;//bu bilgi kimsenin dikkat etmediği bir bilgidir başka paketlere ait sınıflardan da ulaşılabilir.
	protected double maas;//bu bilgi çalışan personelin maaş bilgisidir personelle iligili bilgilerin tutulduğu pakette yer alabilir.

}
