
public class SpaceCraft {
	
	private Calculations calculate = new Calculations();
	
	private int fuelInPounds;
	
	private boolean takeOffEngines;
	private boolean spaceFlightEngines;
	
	public SpaceCraft() {
		
		fuelInPounds = (int)(Math.random()*(400000 - 100000 + 1) + 100000);
		
		takeOffEngines = true;
		spaceFlightEngines = true;
	}
	
	public int remainingFuel() {
		
		return fuelInPounds;
	}
	
	public void canTravelTo(int body, String escapeVel) {
		
		calculate.canTravelTo(body, fuelInPounds, escapeVel);
	}
}
