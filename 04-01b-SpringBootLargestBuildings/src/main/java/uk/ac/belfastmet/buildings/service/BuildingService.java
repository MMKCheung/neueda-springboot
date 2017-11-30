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

		Floorspace NCGC = new Floorspace(1, "New Century Global Center", "China", "Chengdu", "1,760,000","newcentury.jpg");
		Floorspace DIAT3 = new Floorspace(2, "Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai",
				"1,713,000","dubaiinternational.jpg");
		Floorspace AABE = new Floorspace(3, "Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "1,575,815","abraj.JPG");
		Floorspace CW = new Floorspace(4, "CentralWorld", "Thailand", "Bangkok", "1,024,000","centralworld.jpg");
		Floorspace AFA = new Floorspace(5, "Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "990,000","aalsmeer.jpg");
		Floorspace BCIAT3 = new Floorspace(6, "Beijing Capital International Airport Terminal 3", "China", "Beijing",
				"986,000","beijingcapital.jpg");
		Floorspace TVM = new Floorspace(7, "The Venetian Macao", "Macao", "Macao", "980,000","venetian.jpg");
		Floorspace SCC = new Floorspace(8, "Sands Cotai Central", "Macao", "Macao", "890,000","sandscotai.jpg");
		Floorspace CWS = new Floorspace(9, "Ciputra World Surabaya", "Indonesia", "Surabaya", "750,000","ciputraworld.jpg");
		Floorspace BTS = new Floorspace(10, "Berjaya Times Square", "Malaysia", "Kuala Lumpur", "700,000","berjayatimessquare.jpg");

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

		Volume BEF = new Volume(1, "Boeing Everett Factory", "United States", "Everett, Washington", "13,300,000", "boeingeverettfactory.jpg");
		Volume GMOM = new Volume(2, "Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "8,000,000","greatmosqueofmecca.jpg");
		Volume JLLP = new Volume(3, "Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "5,600,000","jeanluc.jpg");
		Volume BCWC = new Volume(4, "Boeing Composite Wing Center", "United States", "Everett, Washington", "3,700,000","boeingcompositewingcenter.jpg");
		Volume A = new Volume(5, "Aerium", "Germany", "Halbe, Brandenburg", "5,200,000","aerium.jpg");
		Volume MWD2 = new Volume(6, "Meyer Werft Dockhalle 2", "Germany", "Papenburg, Niedesachsen", "4,720,000","meyerwerft.jpg");
		Volume NVAB = new Volume(7, "NASA Vehicle Assembly Building", "United States", "Brevard County, Florida",
				"3,660,000","NASA.jpg");
		Volume TO2 = new Volume(8, "The O2", "United Kingdom", "London", "2,790,000","o2.jpg");
		Volume TIDC = new Volume(9, "Tesco Ireland Distribution Centre", "Ireland", "Donabate, Fingal", "1,550,000","tescoireland.jpg");
		Volume TIW = new Volume(10, "Target Import Warehouse", "United States", "Savannah, Georgia", "1,500,000","targetwarehouse.jpg");

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

		Footprint AFA = new Footprint(1,"Aalsmeer Flower Auction","Netherlands","Aalsmeer","518,000","aalsmeer.jpg");
		Footprint TF = new Footprint(2, "Tesla Factory","United States","Fremont, California","427,354","teslafactory.jpg");
		Footprint BEF = new Footprint(3,"Boeing Everett Factory","United States","Everett, Washington","398,000","boeingeverettfactory.jpg");
		Footprint MDC = new Footprint(4, "Michelin Distribution Center","United States","Spartanburg, South Carolina","371,612","michelin.jpg");
		Footprint GMOM = new Footprint(5,"Great Mosque of Mecca","Saudi Arabia","Hijaz-Saudi Arabia","356,000","greatmosqueofmecca.jpg");
		Footprint NNALC = new Footprint(6,"Nike - North America Logistics Center","United States","Memphis, Tennessee","260,000","nike.jpg");
		Footprint JDNAPDC = new Footprint(7,"John Deere North America Parts Distribution Center","United States","Milan, Illinois","246,000","johndeere.jpg");
		Footprint MOD = new Footprint(8,"Mall of Dubai","United Arab Emirates","Dubai","500,000","dubaimall.jpg");
		Footprint MMNA = new Footprint(9,"Mitsubishi Motors North America","United States","Normal, Illinois","220,000","mitsubishi.png");
		Footprint ICE = new Footprint(10,"Indonesia Convention Exhibition","Indonesia","Bumi Serpong Damai","220,000","indonesia.jpg");
		
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
