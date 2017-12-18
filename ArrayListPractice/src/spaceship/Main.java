package spaceship;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Asteroid a1 = new Asteroid(0,0,"South",1.0);
		Asteroid a2 = new Asteroid(1,1,"East",2.0);
		Asteroid a3 = new Asteroid(2,2,"North",3.0);
		
		Spaceship s1 = new Spaceship(0,1,"East",2.0,100,3);
		Spaceship s2 = new Spaceship(4,4,"North",3.0,100,3);
		Spaceship s3 = new Spaceship(2,0,"South",2.5,100,3);
		
		ArrayList<Asteroid> ast = new ArrayList<Asteroid>();
		ast.add(a1);
		ast.add(a2);
		ast.add(a3);
		
		ArrayList<Spaceship> ss = new ArrayList<Spaceship>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		
		s1.shoot();
		s1.crash();
		s1.crash();
		
		s1.crash();
		
		s1.crash();
		
		
	
		
		for(Spaceship sp:ss) {
			System.out.println(sp);
		}
		
	}

	
}
