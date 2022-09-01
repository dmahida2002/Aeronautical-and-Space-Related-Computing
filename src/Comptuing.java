
public class Comptuing {
	
	public static void main(String[] args) {
		
		SpaceSystem system = new SpaceSystem();
		
//		for(int i = 0; i < system.getSystemSize(); i++) {
//			
//			system.travelTo(i);
//			
//			System.out.println("------> AT " + i + " <------\n");
//			
//			System.out.println("--> Location\nYou are at " + system.getCurrentLocation() + ".\n");
//			System.out.println("--> Travel\nYou can travel to: " + system.getNeighbors() + "\n");
//			System.out.println("--> Characteristics of " + system.getCurrentLocation() + ": \n" + system.getCharacteristics());
//			
//			System.out.println("\n\n");
//		}
		
		system.travelTo(1);
		
		System.out.println("------> AT " + 1 + " <------\n");
		
		System.out.println("--> Location\nYou are at " + system.getCurrentLocation() + ".\n");
		System.out.println("--> Travel\nYou can travel to: " + system.getNeighbors() + "\n");
		System.out.println("--> Characteristics of " + system.getCurrentLocation() + ": \n" + system.getCharacteristics());
		
		System.out.println("\n\n");
		
		SpaceCraft myCraft = new SpaceCraft();
		
		myCraft.canTravelTo(2, system.getEscapeVelocity());
		
//		system.getMap();
		
	}
}