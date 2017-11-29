package uk.ac.belfastmet.dwarfs;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void createDwarfs() {
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf Doc = new Dwarf("Doc", "Disney", "Doc.png");
		Dwarf Grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		Dwarf Happy = new Dwarf("Happy", "Disney", "Happy.png");
		Dwarf Sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		Dwarf Dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		Dwarf Bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		Dwarf Sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		
		Dwarf Dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
		Dwarf Balin = new Dwarf("Balin", "Tolkien", "Balin.png");
		Dwarf Kili = new Dwarf("Kili", "Tolkien", "Kili.png");
		Dwarf Fili = new Dwarf("Fili", "Tolkien", "Fili.png");
		Dwarf Doro = new Dwarf("Doro", "Tolkien", "Doro.png");
		Dwarf Nori = new Dwarf("Nori", "Tolkien", "Nori.png");
		Dwarf Ori = new Dwarf("Ori", "Tolkien", "Ori.png");
		Dwarf Oin = new Dwarf("Oin", "Tolkien", "Oin.png");
		Dwarf Gloin = new Dwarf("Gloin", "Tolkien", "Gloin.png");
		Dwarf Bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
		Dwarf Bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
		Dwarf Bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
		Dwarf Thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
		
		dwarfs.add(Doc);
		dwarfs.add(Grumpy);
		dwarfs.add(Happy);
		dwarfs.add(Sleepy);
		dwarfs.add(Dopey);
		dwarfs.add(Bashful);
		dwarfs.add(Sneezy);
		
		dwarfs.add(Dwalin);
		dwarfs.add(Balin);
		dwarfs.add(Kili);
		dwarfs.add(Fili);
		dwarfs.add(Doro);
		dwarfs.add(Nori);
		dwarfs.add(Ori);
		dwarfs.add(Oin);
		dwarfs.add(Gloin);
		dwarfs.add(Bifur);
		dwarfs.add(Bofur);
		dwarfs.add(Bombur);
		dwarfs.add(Thorin);
		
		System.out.println("Snow White's Dwarfs are: ");
		System.out.println("");
		
		for(int i = 0; i < dwarfs.size(); i++) {
			
			if(dwarfs.get(i).getAuthor().equals("Disney")) {
				
				System.out.println(dwarfs.get(i).getName() + ": " + dwarfs.get(i).getImage());
			
			}
		
		}
			System.out.println("");
		
		System.out.println("The dwarfs in Thorin's company are: ");
		System.out.println("");
		
		for(int i = 0; i < dwarfs.size(); i++) {
			if(dwarfs.get(i).getAuthor().equals("Tolkien")) {
				System.out.println(dwarfs.get(i).getName() + ": " + dwarfs.get(i).getImage());	
	}
		}
	}
}
