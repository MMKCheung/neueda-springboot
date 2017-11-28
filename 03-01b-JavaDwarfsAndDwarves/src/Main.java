import java.util.ArrayList;

public class Main {
	public static void main(String arg[]) {
		
		ArrayList<Dwarfs> dwarf = new ArrayList<Dwarfs>();
		
		Dwarfs Doc = new Dwarfs("Doc", "Disney", "Doc.png");
		Dwarfs Grumpy = new Dwarfs("Grumpy", "Disney", "Grumpy.png");
		Dwarfs Happy = new Dwarfs("Happy", "Disney", "Happy.png");
		Dwarfs Sleepy = new Dwarfs("Sleepy", "Disney", "Sleepy.png");
		Dwarfs Dopey = new Dwarfs("Dopey", "Disney", "Dopey.png");
		Dwarfs Bashful = new Dwarfs("Bashful", "Disney", "Bashful.png");
		Dwarfs Sneezy = new Dwarfs("Sneezy", "Disney", "Sneezy.png");
		
		Dwarfs Dwalin = new Dwarfs();
		Dwalin.setName("Dwalin");
		Dwalin.setAuthor("Tolkien");
		Dwalin.setImage("Dwalin.png");
		
		Dwarfs Balin = new Dwarfs();
		Balin.setName("Balin");
		Balin.setAuthor("Tolkien");
		Balin.setImage("Balin.png");
		
		Dwarfs Kili = new Dwarfs();
		Kili.setName("Kili");
		Kili.setAuthor("Tolkien");
		Kili.setImage("Kili.png");
		
		dwarf.add(Doc);
		
		
	}
}
