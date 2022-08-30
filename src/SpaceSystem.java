import java.util.Arrays;
import java.io.IOException;
import java.math.BigDecimal;

public class SpaceSystem {
	
	private Calculations calculate = new Calculations();
	
	private Graph mySystem;
	
	private int currentBody;
	
	private InformationScraper scraper = new InformationScraper();
	
	private Object currentDetails[];
	
	/**
	 * Constructor randomized star system size. Attempts to generate new system
	 */
	
	public SpaceSystem() {
		
		int count = (int)(Math.random()*(9 - 1 + 1) + 1);
		
		try {
			
			generateNewSystem(scraper.getPlanetNames(count), count);
		} 
		
		catch (IOException e) {
			
			System.out.println("Something went wrong.");
		}
	}
	
	/**
	 * getCurrentLocation returns the current body as a String
	 * @return the name of the current body
	 */
	
	public String getCurrentLocation() {
		
		return (String) mySystem.getLabel(currentBody);
	}
	
	/**
	 * getCurrentLocationRaw returns the current body as a int
	 * @return the index of the current body
	 */
	
	public int getCurrentLocationRaw() {
		
		return currentBody;
	}
	
	/**
	 * getNeighbors returns all of the names of the neighbors for the current body
	 * @return all of the names of the neighbors for the current body
	 */
	
	public String getNeighbors() {
		
		int numberOfNeighbors = (mySystem.neighbors(currentBody).length);
		
		int[] indexOfNeighbors = mySystem.neighbors(currentBody);
		
		String neighborsTranslate[] = new String[numberOfNeighbors];
		
		for(int i = 0; i < numberOfNeighbors; i++) {
			
			neighborsTranslate[i] = (String)mySystem.getLabel(indexOfNeighbors[i]);
		}
		
		return Arrays.toString(neighborsTranslate);
		
	}
	
	/**
	 * getNeighbors returns all of the index(s) of the neighbors for the current body
	 * @return all of the index(s) of the neighbors for the current body
	 */
	
	public String getNeighborsRaw() {
		
		return Arrays.toString(mySystem.neighbors(currentBody));
	}
	
	/**
	 * getCharacteristics returns the mass (in kg), gravitational pull (in m/s�), radius (in meters),
	 * escape velocity (in km/s)
	 * @return all characteristics within a single String
	 */
	
	public String getCharacteristics() {
		
		String getChars = "Mass: " + currentDetails[0].toString() + " kg";
		
		getChars += "\nGravitational Pull: " + currentDetails[1].toString() + " m/s�";
		getChars += "\nRadius: " + currentDetails[2].toString() + " meters";
		getChars += "\nEscape Velocity: " + getEscapeVelocity() + " km/s";
		
		return getChars;
	}
	
	/**
	 * getSystemSize count of all bodies in the system including the star
	 * @return system size
	 */
	
	public int getSystemSize() {
		
		return mySystem.size();
	}
	
	/**
	 * generateNewSystem creates a graph of a star system. Assigns a randomized starting location other than the star.
	 * Obtains characteristics of the current body
	 * @param names list of all body names
	 * @param star system size
	 */
	
	private void generateNewSystem(String names[], int count) {
		
		mySystem = new Graph(count);
		
		calculate.addCharacteristics(mySystem, names, count);
		
		int initialLocation = 0;
		
		while(initialLocation == 0) {
			
			initialLocation = (int)(Math.random()*((mySystem.size() - 1)) + 1);
			
			currentBody = initialLocation;
		}
		
		for(int i = 0; i < mySystem.size(); i++) {
			
			for(int j = 0; j < mySystem.size(); j++) {
				
				// Do not add the body you are currently at as an edge.
				
				if(j == currentBody) {
					
					continue;
				}
				
				mySystem.addEdge(i, j);
			}
		}
		
		currentDetails = mySystem.getProperties(currentBody);
	}
	
	public void travelTo(int position) {
		
		if(position > mySystem.size()) {
			
			System.out.println("That body does not exist.");
		}
		
		else {
			
			currentBody = position;
		}
		
		currentDetails = mySystem.getProperties(currentBody);
	}
	
	public String getEscapeVelocity() {
		
		/* Mass and radius are passed as a BigInteger.
		 * 
		 * We need to pass BigDecimal.
		 * 
		 * We need to convert the two into BigDecimal by coverting them to string and
		 * then into BigDecimal.
		 */
		
		
		return calculate.getEscapeVelocity(new BigDecimal(currentDetails[0].toString()), new BigDecimal(currentDetails[2].toString()));
	}
	
	/**
	 * getMap attempts to get a map given the current location
	 */
	
	public void getMap() {
		
		try {
			
			scraper.getMap(mySystem.size(), getCurrentLocationRaw());
		} 
		
		catch (IOException e) {
			
			System.out.println("Something went wrong.");
		}
	}
}
