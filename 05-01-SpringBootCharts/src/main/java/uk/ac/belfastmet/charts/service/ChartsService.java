package uk.ac.belfastmet.charts.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.charts.domain.Music;
@Service
public class ChartsService {
	
	private ArrayList<Music> music;
	
	public ChartsService() {
		super();
	}

	public ArrayList<Music> getMusic() {
		ArrayList<Music> music = new ArrayList<Music>();
		
		Music CS = new Music("Red Hot Chili Peppers","Can't Stop","By The Way","r1.jpg","rock");
		Music BIB = new Music("AC/DC","Back In Black","Back In Black","r2.jpg","rock");
		Music I = new Music("Goo Goo Dolls","Iris","City of Angels","r3.jpg","rock");
		Music SCOM = new Music("Guns N' Roses","Sweet Child O' Mine","Appetite for Destruction","r4.jpg","rock");
		Music N = new Music("Linkin Park","Numb","Meteora","r5.jpg","rock");
		Music T = new Music("AC/DC","Thunderstruck","The Razors Edge","r6.jpg","rock");
		Music IS = new Music("Led Zeppelin","Immigrant Song","Led Zeppelin III","r7.jpg","rock");
		Music DSME = new Music("Queen","Don't Stop Me Now","Jazz","r8.jpg","rock");
		Music BR = new Music("Queen","Bohemian Rhapsody","A Night at the Opera","r9.jpg","rock");
		Music BMTL = new Music("Evanescence","Bring Me To Life","Fallen","r10.jpg","rock");
		
		music.add(CS);
		music.add(BIB);
		music.add(I);
		music.add(SCOM);
		music.add(N);
		music.add(T);
		music.add(IS);
		music.add(DSME);
		music.add(BR);
		music.add(BMTL);
		
		Music H = new Music("Camila Cabello","Havana","So Fresh","p1.jpg","Pop");
		Music A = new Music("Rita Ora","Anywhere","RO2","p2.jpg","Pop");
		Music S = new Music("marshmello","Silence","So Fresh","p3.jpg","Pop");
		Music P = new Music("Ed Sheeran","Perfect","Divide","p4.jpg","Pop");
		Music TGAG = new Music("Sam Smith","Too Good At Goodbyes","The Thrill of It All","p5.jpg","Pop");
		Music MNH = new Music("Big Shaq","Man's Not Hot","Daddy K", "p6.jpg","Pop");
		Music BBYG = new Music("Stormzy","Blinded By Your Grace, Pt. 2","Gang Signs & Prayer","p7.jpg","Pop");
		Music r = new Music("Post Malone","rockstar","Unknown","p8.jpg","Pop");
		Music W = new Music("Selene Gomez & marshmello","Wolves","Unknown","p9.jpg","Pop");
		Music DTD = new Music("ZAYN","Dusk Till Dawn","So Fresh","p10.jpg","Pop");
		
		music.add(H);
		music.add(A);
		music.add(S);
		music.add(P);
		music.add(TGAG);
		music.add(MNH);
		music.add(BBYG);
		music.add(r);
		music.add(W);
		music.add(DTD);

		return music;

		
	}
}
