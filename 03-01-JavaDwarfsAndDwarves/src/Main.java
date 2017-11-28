import java.util.ArrayList;

public class Main {
	public static void main(String[] arg) {
		ArrayList<String> dwarfs = new ArrayList<String>(7);
		ArrayList<String> dwarves = new ArrayList<String>(13);

		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");

		dwarves.add("Dwalin");
		dwarves.add("Balin");
		dwarves.add("Kili");
		dwarves.add("Fili");
		dwarves.add("Doro");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("Oin");
		dwarves.add("Gloin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		dwarves.add("Thorin");

		System.out.println("The dwarfs in Snow White are: ");
		for (int i = 0; i < dwarfs.size(); i++)
			System.out.println(dwarfs.get(i));
		
		System.out.println("");
		System.out.println("The dwarves in Thorin Oakenshield's party are: ");
		for (int i = 0; i < dwarves.size(); i++)
			System.out.println(dwarves.get(i));
	}
}
