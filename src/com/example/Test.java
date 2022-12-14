package com.example;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		// Takim takim = new Takim("Ev Sahibi");
//		System.out.println(takim.getKaleci());
//		for (AktifFutbolcu futbolcu : takim.getFutbolcular()) {
//			System.out.println(futbolcu.pasVer());
//		}
		Takim takim1 = new Takim("Ev sahibi");
		Takim takim2 = new Takim("Deplasman");
		List<Takim> takimlar = new ArrayList<>();
		takimlar.add(takim1);
		takimlar.add(takim2);
		Mac mac = new Mac(60000, takimlar);
		mac.mac();

		// mac.oyna(mac.takimlar.get(0));
//		Takim takim = mac.takimDegistir2(mac.takimlar.get(0));
//		System.out.println(takim);
//		System.out.println(mac.takimDegistir2(takim).getAd());
	}

}
