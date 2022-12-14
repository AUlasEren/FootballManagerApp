package com.example;

import java.util.Random;

public class OrtaSaha extends AktifFutbolcu {

	private int uzunTop;
	private int ilkDokunus;
	private int topSurme;
	private int uretkenlik;
	private int ozelYetenek;

	public OrtaSaha(String adSoyad, int formaNo) {

		super(adSoyad, formaNo);
		this.uzunTop = rastgeleYetenekPuaniAta();
		this.ilkDokunus = rastgeleYetenekPuaniAta();
		this.topSurme = rastgeleYetenekPuaniAta();
		this.uretkenlik = rastgeleYetenekPuaniAta();
		this.ozelYetenek = rastgeleYetenekPuaniAta();
	}

	@Override
	public int rastgeleYetenekPuaniAta() {
		Random random = new Random();
		return random.nextInt(60, 101);
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	@Override
	public String toString() {
		return "OrtaSaha [uzunTop=" + uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSurme=" + topSurme
				+ ", uretkenlik=" + uretkenlik + ", ozelYetenek=" + ozelYetenek + ", getAdSoyad()=" + getAdSoyad()
				+ ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()="
				+ getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + "]";
	}

	@Override
	public int pasSkor() {
		Random random = new Random();
		/*
		 * Bonus= 1 ile 8 aras�nda rastgele bir say�d�r.
		 * pas*0.2+yetenek*0.2+ozelYetenek*0.2+dayaniklilik*0.1+dogalForm*0.1+sans*0.1+
		 * bonus
		 * 
		 */
		int bonus = random.nextInt(1, 8);
		return (int) (getPas() * 0.2 + getYetenek() * 0.2 + ozelYetenek * 0.2 + getDayaniklilik() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1 + bonus);
	}

	@Override
	public int golSkoru(int kurtaris) {
		Random random = new Random();
		int bonus = (int) (random.nextInt(1, 6) * getDogalForm() * 0.075);
		return (int) (getYetenek() * 0.3 + getSut() * 0.2 + getKararlilik() * 0.1 + getSans() * 0.1 + ozelYetenek * 0.2
				+ ilkDokunus * 0.1 + getDogalForm() * 0.075 + bonus - kurtaris);
	}

}
