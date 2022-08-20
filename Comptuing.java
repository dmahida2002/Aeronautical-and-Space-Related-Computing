import java.math.BigInteger;
import java.util.HashMap;

public class Comptuing {
	public static void main(String[] args) {
		
		MapOfSystem system = new MapOfSystem();
		
		System.out.println("--> Location\nYou are at " + system.getCurrentLocation() + ".\n");
		System.out.println("--> Travel\nYou can travel to: " + system.getNeighbors() + "\n");
		System.out.println("--> Characteristics: \n" + system.getCharacteristics());
		
		InadequateMapDisplay displayMap = new InadequateMapDisplay();
		
//		displayMap.showMap();
		
	}
}