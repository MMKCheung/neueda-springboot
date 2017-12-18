import java.util.ArrayList;

public class Main {
	public static void main(String []arg) {
		
		ArrayList<Floorspace> floorspace = new ArrayList<Floorspace>();
		
		Floorspace NCGC = new Floorspace(1, "New Century Global Center","China","Chengdu",1760000);
		Floorspace DIAT3 = new Floorspace(2, "Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai",1713000);
		Floorspace AABE = new Floorspace(3, "Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", 1575815);
		Floorspace CW = new Floorspace(4, "CentralWorld", "Thailand", "Bangkok",1024000);
		Floorspace AFA = new Floorspace(5, "Aalsmeer Flower Auction", "Netherlands", "Aalsmeer",990000);
		Floorspace  BCIAT3 = new Floorspace(6, "Beijing Capital International Airport Terminal 3", "China","Beijing",986000);
		Floorspace TVM = new Floorspace(7, "The Venetian Macao", "Macao", "Macao",980000);
		Floorspace  SCC = new Floorspace(8, "Sands Cotai Central","Macao","Macao",890000);
		Floorspace CWS = new Floorspace(9, "Ciputra World Surabaya", "Indonesia","Surabaya",750000);
		Floorspace BTS = new Floorspace(10, "Berjaya Times Square", "Malaysia","Kuala Lumpur",700000);
		
		floorspace.add(NCGC);
		floorspace.add(DIAT3);
		floorspace.add(AABE);
		floorspace.add(CW);
		floorspace.add(AFA);
		floorspace.add(BCIAT3);
		floorspace.add(TVM);
		floorspace.add(SCC);
		floorspace.add(CWS);
		floorspace.add(BTS);
		
		System.out.println(floorspace);
	}
}
