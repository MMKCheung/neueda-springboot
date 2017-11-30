package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.buildings.domain.Floorspace;
import uk.ac.belfastmet.buildings.domain.Footprint;
import uk.ac.belfastmet.buildings.domain.Volume;

@Service
public class BuildingService {

	private ArrayList<Floorspace> floorspace;
	private ArrayList<Volume> volume;
	private ArrayList<Footprint> footprint;

	public BuildingService() {
		super();
	}

	public ArrayList<Floorspace> getFloorspace() {
		ArrayList<Floorspace> floorspace = new ArrayList<Floorspace>();

		Floorspace NCGC = new Floorspace(1, "New Century Global Center", "China", "Chengdu", 1760000);
		Floorspace DIAT3 = new Floorspace(2, "Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai",
				1713000);
		Floorspace AABE = new Floorspace(3, "Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", 1575815);
		Floorspace CW = new Floorspace(4, "CentralWorld", "Thailand", "Bangkok", 1024000);
		Floorspace AFA = new Floorspace(5, "Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", 990000);
		Floorspace BCIAT3 = new Floorspace(6, "Beijing Capital International Airport Terminal 3", "China", "Beijing",
				986000);
		Floorspace TVM = new Floorspace(7, "The Venetian Macao", "Macao", "Macao", 980000);
		Floorspace SCC = new Floorspace(8, "Sands Cotai Central", "Macao", "Macao", 890000);
		Floorspace CWS = new Floorspace(9, "Ciputra World Surabaya", "Indonesia", "Surabaya", 750000);
		Floorspace BTS = new Floorspace(10, "Berjaya Times Square", "Malaysia", "Kuala Lumpur", 700000);

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

		return floorspace;
	}

	public ArrayList<Volume> getVolume() {
		ArrayList<Volume> volume = new ArrayList<Volume>();

		Volume BEF = new Volume(1, "Boeing Everett Factory", "United States", "Everett, Washington", 13300000);
		Volume GMOM = new Volume(2, "Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", 8000000);
		Volume JLLP = new Volume(3, "Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", 5600000);
		Volume BCWC = new Volume(4, "Boeing Composite Wing Center", "United States", "Everett, Washington", 3700000);
		Volume A = new Volume(5, "Aerium", "Germany", "Halbe, Brandenburg", 5200000);
		Volume MWD2 = new Volume(6, "Meyer Werft Dockhalle 2", "Germany", "Papenburg, Niedesachsen", 4720000);
		Volume NVAB = new Volume(7, "NASA Vehicle Assembly Building", "United States", "Brevard County, Florida",
				3660000);
		Volume TO2 = new Volume(8, "The O2", "United Kingdom", "London", 2790000);
		Volume TIDC = new Volume(9, "Tesco Ireland Distribution Centre", "Ireland", "Donabate, Fingal", 1550000);
		Volume TIW = new Volume(10, "Target Import Warehouse", "United States", "Savannah, Georgia", 1500000);

		volume.add(BEF);
		volume.add(GMOM);
		volume.add(JLLP);
		volume.add(BCWC);
		volume.add(A);
		volume.add(MWD2);
		volume.add(NVAB);
		volume.add(TO2);
		volume.add(TIDC);
		volume.add(TIW);

		return volume;
	}

	public ArrayList<Footprint> getFootprint() {
		ArrayList<Footprint> footprint = new ArrayList<Footprint>();

		Footprint AFA = new Footprint(1,"Aalsmeer Flower Auction","Netherlands","Aalsmeer",518000);
		Footprint TF = new Footprint(2, "Tesla Factory","United States","Fremont, California",427354);
		Footprint BEF = new Footprint(3,"Boeing Everett Factory","United States","Everett, Washington",398000);
		Footprint MDC = new Footprint(4, "Michelin Distribution Center","United States","Spartanburg, South Carolina",371612);
		Footprint GMOM = new Footprint(5,"Great Mosque of Mecca","Saudi Arabia","Hijaz-Saudi Arabia",356000);
		Footprint NNALC = new Footprint(6,"Nike - North America Logistics Center","United States","Memphis, Tennessee",260000);
		Footprint JDNAPDC = new Footprint(7,"John Deere North America Parts Distribution Center","United States","Milan, Illinois",246000);
		Footprint MOD = new Footprint(8,"Mall of Dubai","United Arab Emirates","Dubai",500000);
		Footprint MMNA = new Footprint(9,"Mitsubishi Motors North America","United States","Normal, Illinois",220000);
		Footprint ICE = new Footprint(10,"Indonesia Convention Exhibition","Indonesia","Bumi Serpong Damai",220000);
		
		footprint.add(AFA);
		footprint.add(TF);
		footprint.add(BEF);
		footprint.add(MDC);
		footprint.add(GMOM);
		footprint.add(NNALC);
		footprint.add(JDNAPDC);
		footprint.add(MOD);
		footprint.add(MMNA);
		footprint.add(ICE);
		
		return footprint;
	}
}
