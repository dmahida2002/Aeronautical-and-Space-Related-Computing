import java.math.BigInteger;
import java.util.HashMap;

public class Comptuing {
	public static void main(String[] args) {
		
		SpaceSystem system = new SpaceSystem();
		
		for(int i = 0; i < system.getSystemSize(); i++) {
			
			system.travelTo(i);
			
			System.out.println("------> AT " + i + " <------");
			
			System.out.println("--> Location\nYou are at " + system.getCurrentLocation() + ".\n");
			System.out.println("--> Travel\nYou can travel to: " + system.getNeighbors() + "\n");
			System.out.println("--> Characteristics of " + system.getCurrentLocation() + ": \n" + system.getCharacteristics());
		}
		
		System.out.println("\n\n");
		
//		system.getMap();
		
	}
}