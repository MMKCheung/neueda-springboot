package uk.ac.belfastmet.dwarfs.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

@Service

public class DataLoader {
	
	@Autowired
	private DwarfRepository dwarfRepository;
	
	public DataLoader(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	public void loadData() {



		Dwarf Doc = new Dwarf("Doc", "Disney", "Doc.png");
		Dwarf Grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		Dwarf Happy = new Dwarf("Happy", "Disney", "Happy.png");
		Dwarf Sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		Dwarf Dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		Dwarf Bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		Dwarf Sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		Dwarf Pepe = new Dwarf("Pepe", "Meme", "feelsgoodman.png");

		dwarfRepository.save(Doc);
		dwarfRepository.save(Grumpy);
		dwarfRepository.save(Happy);
		dwarfRepository.save(Sleepy);
		dwarfRepository.save(Dopey);
		dwarfRepository.save(Bashful);
		dwarfRepository.save(Sneezy);
		dwarfRepository.save(Pepe);

	

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

		dwarfRepository.save(Dwalin);
		dwarfRepository.save(Balin);
		dwarfRepository.save(Kili);
		dwarfRepository.save(Fili);
		dwarfRepository.save(Dori);
		dwarfRepository.save(Nori);
		dwarfRepository.save(Ori);
		dwarfRepository.save(Oin);
		dwarfRepository.save(Gloin);
		dwarfRepository.save(Bifur);
		dwarfRepository.save(Bofur);
		dwarfRepository.save(Bombur);
		dwarfRepository.save(Thorin);

	}
}