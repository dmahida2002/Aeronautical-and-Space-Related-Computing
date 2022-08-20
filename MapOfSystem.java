import java.util.Arrays;
import java.math.BigInteger;
import java.util.HashMap;

public class MapOfSystem {
	
	private Graph mySystem;
	
	private int currentBody;
	
	public MapOfSystem() {
		
		/* 9 planets in our system but passed a value of (10 + 1) because we are including
		 * a star.
		 * 
		 * Maybe we could have 2 stars like the system Luke Skywalker lived in...
		 */
		
		mySystem = new Graph(10);
		
		mySystem.setLabel(0, "Sun", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(1, "Mercury", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(2, "Venus", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(3, "Earth", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(4, "Mars", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(5, "Jupiter", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(6, "Saturn", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(7, "Uranus", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(8, "Neptune", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		mySystem.setLabel(9, "Pluto", BigInteger.valueOf(1), BigInteger.valueOf(2), BigInteger.valueOf(3));
		
		/* Starting position is 3 (Earth). We will add edges to all
		 * bodies connecting them to every other bodies in the system.
		 * 
		 * In other words, every planet should have access to travel to entire system but itself.
		 */
		
		currentBody = 3;
		
		for(int i = 0; i < mySystem.size(); i++) {
			
			for(int j = 0; j < mySystem.size(); j++) {
				
				// Do not add the body you are currently at as an edge.
				
				if(j == currentBody) {
					
					continue;
				}
				
				mySystem.addEdge(i, j);
			}
		}
	}
	
	public String getCurrentLocation() {
		
		return (String) mySystem.getLabel(currentBody);
	}
	
	public int getCurrentLocationRaw() {
		
		return currentBody;
	}
	
	public String getNeighbors() {
		
		int numberOfNeighbors = mySystem.neighbors(currentBody).length;
		
		int[] indexOfNeighbors = mySystem.neighbors(currentBody);
		
		String neighborsTranslate[] = new String[numberOfNeighbors];
		
		for(int i = 0; i < numberOfNeighbors; i++) {
			
			neighborsTranslate[i] = (String)mySystem.getLabel(indexOfNeighbors[i]);
		}
		
		return Arrays.toString(neighborsTranslate);
	}
	
	public int[] getNeighborsRaw() {
		
		return mySystem.neighbors(currentBody);
	}
	
	public String getCharacteristics() {
		
		BigInteger[] test = mySystem.getProperties(currentBody);
		
		String getChars = "Mass (in kilos): " + test[0];
		
		getChars += "\nGravitational Pull (in meters per second squared): " + test[1];
		getChars += "\nRadius (in miles): " + test[2];
		
		return getChars;
	}
}
