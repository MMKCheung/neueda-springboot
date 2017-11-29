package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@Service
public class DwarfService {
	
	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarfs;
	
	public DwarfService() {
		super();
	}
	
	public ArrayList<Dwarf> getDisneyDwarfs() {

		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

		Dwarf Doc = new Dwarf("Doc", "Disney", "Doc.png");
		Dwarf Grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		Dwarf Happy = new Dwarf("Happy", "Disney", "Happy.png");
		Dwarf Sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		Dwarf Dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		Dwarf Bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		Dwarf Sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		Dwarf Pepe = new Dwarf("Pepe", "Meme", "feelsgoodman.png");

	

		dwarfs.add(Doc);
		dwarfs.add(Grumpy);
		dwarfs.add(Happy);
		dwarfs.add(Sleepy);
		dwarfs.add(Dopey);
		dwarfs.add(Bashful);
		dwarfs.add(Sneezy);
		dwarfs.add(Pepe);

	
		return dwarfs;
	}
	public ArrayList<Dwarf> getTolkienDwarfs() {
		

		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
	
	Dwarf Dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
	Dwarf Balin = new Dwarf("Balin", "Tolkien", "Balin.png");
	Dwarf Kili = new Dwarf("Kili", "Tolkien", "Kili.png");
	Dwarf Fili = new Dwarf("Fili", "Tolkien", "Fili.png");
	Dwarf Dori = new Dwarf("Dori", "Tolkien", "Dori.png");
	Dwarf Nori = new Dwarf("Nori", "Tolkien", "Nori.png");
	Dwarf Ori = new Dwarf("Ori", "Tolkien", "Ori.png");
	Dwarf Oin = new Dwarf("Oin", "Tolkien", "Oin.png");
	Dwarf Gloin = new Dwarf("Gloin", "Tolkien", "Gloin.png");
	Dwarf Bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
	Dwarf Bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
	Dwarf Bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
	Dwarf Thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
	
	dwarfs.add(Dwalin);
	dwarfs.add(Balin);
	dwarfs.add(Kili);
	dwarfs.add(Fili);
	dwarfs.add(Dori);
	dwarfs.add(Nori);
	dwarfs.add(Ori);
	dwarfs.add(Oin);
	dwarfs.add(Gloin);
	dwarfs.add(Bifur);
	dwarfs.add(Bofur);
	dwarfs.add(Bombur);
	dwarfs.add(Thorin);

	return dwarfs;
}
}
