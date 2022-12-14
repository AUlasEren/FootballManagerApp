package com.example;

import java.util.Random;

public class Defans<KurtarisSkoru> extends AktifFutbolcu {

	private int pozisyonAlma;
	private int kafa;
	private int sicrama;

	public Defans(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.pozisyonAlma = rastgeleYetenekPuaniAta();
		this.kafa = rastgeleYetenekPuaniAta();
		this.sicrama = rastgeleYetenekPuaniAta();
	}

	@Override
	public int rastgeleYetenekPuaniAta() {
		Random random = new Random();
		return random.nextInt(60, 91);
	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

	@Override
	public String toString() {
		return "Defans [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama + ", getAdSoyad()="
				+ getAdSoyad() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik()
				+ ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()="
				+ getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm()
				+ ", getSans()=" + getSans() + "]";
	}

	@Override
	public int pasSkor() {
		Random random = new Random();
		/*
		 * Bonus= 0 ile 4 aras�nda rastgele bir say�d�r
		 * pas*0.2+yetenek*0.2+dayaniklilik*0.1+dogalForm*0.1+pozisyonAlma*0.1+sans*0.2+
		 * bonus
		 */
		int bonus = random.nextInt(4);

		return (int) (getPas() * 0.2 + getYetenek() * 0.2 + getDayaniklilik() * 0.1 + getDogalForm() * 0.1
				+ pozisyonAlma * 0.1 + getSans() * 0.2 + bonus);
	}

	@Override
	public int golSkoru(int kurtaris) {
		Random random = new Random();
		int bonus = (int) (random.nextInt(2, 5) * getDogalForm() * 0.075);
		return (int) (getYetenek() * 0.3 + getSut() * 0.2 + getKararlilik() * 0.1 + getSans() * 0.1 + kafa * 0.1
				+ sicrama * 0.1 + getDogalForm() * 0.1 + bonus - kurtaris);
	}

}