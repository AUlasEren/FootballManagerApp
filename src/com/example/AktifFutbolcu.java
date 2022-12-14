package com.example;

public abstract class AktifFutbolcu extends Futbolcu {

	public AktifFutbolcu(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);

	}

	public boolean pasVer() {
		int pasSkor = pasSkor();

		if (pasSkor > 68) {

			return true;
		} else {

			return false;
		}
	}

	public boolean golVurusu(int kurtaris) {
		int golSkor = golSkoru(kurtaris);

		if (golSkor > 68) {

			return true;
		} else {

			return false;
		}
	}

	public abstract int golSkoru(int kurtaris);

	public abstract int pasSkor();

	public int golSkoru() {
		// TODO Auto-generated method stub
		return 0;
	}

}
