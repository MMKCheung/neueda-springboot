import java.util.ArrayList;

public class WhaleWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Whale right = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale blue = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale sperm = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale humpback = new Whale("Humpback", "Antarctic", 919, 13, 13);

		ArrayList<Whale> whales = new ArrayList<Whale>();
		whales.add(right);
		whales.add(blue);
		whales.add(sperm);
		whales.add(humpback);

		// toString method
		// System.out.println(whales.toString());

		// this way looks nicer
		for (Whale w : whales) {
			System.out.println(w);
		}

		printAtlantic(whales);
		
		System.out.println("The fastest whale is: " + printFastest(whales));
		
		System.out.println("The average length is: " + printAverageLength(whales) + "m");
		
		System.out.println("The heaviest whales are: " + printHeaviest(whales));
	}
	
	
	
	
	
	
//outputs name of whales that swim in the Atlantic
	public static void printAtlantic(ArrayList<Whale> whales) {
		for (int i = 0; i < whales.size(); i++) {
			Whale currentWhale = whales.get(i);
			if (currentWhale.getMainOcean().equals("Atlantic")) {
				System.out.println(currentWhale.getName());
			}
		}
	}
	//outputs name of the fastest whale
	public static String printFastest(ArrayList<Whale> whales) {
		
		int topSpeed = 0;
		String fastestWhale = "";
		
		for (int i = 0; i < whales.size(); i++) {
			Whale currentWhale = whales.get(i);
			if (currentWhale.getMaxSpeed() > topSpeed) {
				topSpeed = currentWhale.getMaxSpeed();
				fastestWhale = currentWhale.getName();
				
			}
		}
		return fastestWhale;
	}
	
	//outputs average length of all the whales
	public static double printAverageLength(ArrayList<Whale> whales) {
		double averageLength = 0;
		for (int i = 0; i < whales.size(); i++) {
			Whale currentWhale = whales.get(i);
			averageLength += currentWhale.getLength();
	}
		return averageLength/whales.size();
	}
	//outputs heaviest whale(s)
	public static String printHeaviest(ArrayList<Whale> whales) {
		
		int topWeight = 0;
		String heaviestWhale = "";
		String heaviestWhale1 = "";
		
		for (int i = 0; i < whales.size(); i++) {
			Whale currentWhale = whales.get(i);
			if (currentWhale.getWeight() > topWeight) {
				topWeight = currentWhale.getWeight();
				heaviestWhale = currentWhale.getName();
				
			}
			else if(currentWhale.getWeight() == topWeight) {//i know this is janky
				
				heaviestWhale1 = currentWhale.getName();
			}
		}
		return heaviestWhale + " and " + heaviestWhale1;
	}
}
