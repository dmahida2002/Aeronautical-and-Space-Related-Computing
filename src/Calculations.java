import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculations {
	
	/**
	 * addCharacteristics randomly generates mass and radius. Calculates
	 * gravitational pull (in m/s�) with Newton's law of universal gravitation.
	 * Sets the labels of all bodies within the system
	 * @param mySystem the star system 
	 * @param names list of names
	 * @param count star system size
	 */
	
	public void addCharacteristics(Graph mySystem, String[] names, int count) {
		double upperRangeForMass = 0;
		double lowerRangeForMass = 0;
		
		int upperRangeForRad = 0;
		int lowerRangeForRad = 0;
		
		int zeros = 0;
		
		String massValueToBeAdded = "";
		String radValueToBeAdded = "";
		String gravValueToBeAdded = "";
		
		for(int i = 0; i < count; i++) {
			
			// If the body is a star, generate greater than normal values.
			
			if(i == 0) {
				
				/**
				 * Being mass generations.
				 * 
				 * This mass value is randomized.
				 * 
				 * Unit is in kg.
				 */
				
				double tempHoldDouble;
				
				int tempHoldInt;
				
				upperRangeForMass = 2.322;
				lowerRangeForMass = 2.000;
				
				tempHoldDouble = (Math.random()*(upperRangeForMass - lowerRangeForMass + 1) + lowerRangeForMass);
				
				tempHoldDouble = Math.round(tempHoldDouble * 1000.0) / 1000.0;
				
				tempHoldDouble = (tempHoldDouble * 1000);
				
				zeros = ((int)(Math.random()*(33 - 28 + 1) + 28)) - 3;
				
				massValueToBeAdded = String.valueOf((int)tempHoldDouble);
				
				for(int j = 0; j < zeros; j++) {
					
					massValueToBeAdded += "0";
				}
				
				/**
				 * Being radius generation.
				 * 
				 * This radius value is randomized.
				 * 
				 * Unit is in meters.
				 */
				
				upperRangeForRad = 995700000;
				lowerRangeForRad = 595700000;
				
				tempHoldInt = (int)(Math.random()*(upperRangeForRad - lowerRangeForRad + 1) + lowerRangeForRad);
				
				radValueToBeAdded = String.valueOf(tempHoldInt);
				
				/**
				 * Begin gravitational generation.
				 * 
				 * The gravitational pull is calculated using the 
				 * gravitational force formula.
				 * 
				 * F = ([G * M1] / r^2)
				 * 
				 * F = Force
				 * G = Gravitational constant
				 * M1 = Mass of object 1
				 * r = Radius (distance; in meters)
				 * 
				 * Unit is in meters per second squared.
				 */
				
				BigDecimal massMultiply = new BigDecimal(massValueToBeAdded);
				
				// Step 1: Multiply (G * M1)
				
				massMultiply = massMultiply.multiply(new BigDecimal("0.000000000066743"));
				
				// Step 2: Divide by r^2
				
				BigDecimal radius = new BigDecimal(String.valueOf(tempHoldInt));
				
				radius = radius.multiply(radius);
				
				massMultiply = massMultiply.divide(radius, 2, RoundingMode.HALF_UP);
				
				gravValueToBeAdded = massMultiply.toString();
				
				/**
				 * The setLabel() method has the following parameters:
				 * 
				 * - Label #
				 * - Label name
				 * - Label mass
				 * - Label gravitational pull (in m/s�)
				 * - Label radius (in meters)
				 */
				
				
				
				mySystem.setLabel(i, names[i], new BigInteger(massValueToBeAdded), new BigDecimal(gravValueToBeAdded), new BigInteger(radValueToBeAdded));
			}
			
			// If the body is not a star, generate reduced values.
			
			else {
				
				int tempHoldInt;
				
				/**
				 * Being mass generations.
				 * 
				 * This mass value is randomized.
				 * 
				 * Unit is in kg.
				 */
				
				upperRangeForMass = 1.300;
				lowerRangeForMass = 0.500;
				
				double firstValue = (Math.random()*(upperRangeForMass - lowerRangeForMass + 1) + lowerRangeForMass);
				
				firstValue = Math.round(firstValue * 1000.0) / 1000.0;
				
				firstValue = (firstValue * 1000);
				
				zeros = ((int)(Math.random()*(24 - 22 + 1) + 22)) - 3;
				
				massValueToBeAdded = String.valueOf((int)firstValue);
				
				for(int j = 0; j < zeros; j++) {
					
					massValueToBeAdded += "0";
				}
				
				/**
				 * Being radius generation.
				 * 
				 * This radius value is randomized.
				 * 
				 * Unit is in meters.
				 */
				
				upperRangeForRad = 3000000;
				lowerRangeForRad = 1000000;
				
				tempHoldInt = (int)(Math.random()*(upperRangeForRad - lowerRangeForRad + 1) + lowerRangeForRad);
				
				radValueToBeAdded = String.valueOf(tempHoldInt);
				
				/**
				 * Begin gravitational generation.
				 * 
				 * The gravitational pull is calculated using the 
				 * gravitational force formula.
				 * 
				 * F = ([G * M1] / r^2)
				 * 
				 * F = Force
				 * G = Gravitational constant
				 * M1 = Mass of object 1
				 * r = Radius (distance; in meters)
				 * 
				 * Unit is in meters per second squared.
				 */
				
				BigDecimal massMultiply = new BigDecimal(massValueToBeAdded);
				
				// Step 1: Multiply G * M1
				
				massMultiply = massMultiply.multiply(new BigDecimal("0.000000000066743"));
				
				// Step 2: Divide by r^2
				
				BigDecimal radius = new BigDecimal(String.valueOf(tempHoldInt));
				
				radius = radius.multiply(radius);
				
				massMultiply = massMultiply.divide(radius, 2, RoundingMode.HALF_UP);
				
				gravValueToBeAdded = massMultiply.toString();
				
				/**
				 * The setLabel() method has the following parameters:
				 * 
				 * - Label #
				 * - Label name
				 * - Label mass
				 * - Label gravitational pull (in m/s�)
				 * - Label radius (in meters)
				 */
				
				mySystem.setLabel(i, names[i], new BigInteger(massValueToBeAdded), new BigDecimal(gravValueToBeAdded), new BigInteger(radValueToBeAdded));
			}
		}
	}
	
	/**
	 * getEscapeVelocity calculates escape velocity of the current body with the given details.
	 * Uses the escape velocity formula
	 * @param mass mass (in kg) of the current body
	 * @param radius (in meters) of the current body
	 * @return the calculated escape velocity (in km/s)
	 */
	
	public String getEscapeVelocity(BigDecimal mass, BigDecimal radius) {
		
		/**
		 * The escape velocity formula is as follows:
		 * 
		 * Ev = square root of ([2 * G * M1] / r)
		 * 
		 * G = Gravitational constant
		 * M = Mass of object 1
		 * r = radius (distance; in meters)
		 * 
		 * Unit is in km per second.
		 * 
		 * RoundingMode must be set to CEILING for safety.
		 */
		
		String escapeVelocity;
		
		BigDecimal value = new BigDecimal("0.000000000066743");
		
		// Step 1: Multiply (G * M1)
		
		value = value.multiply(mass);
		
		// Step 2: Multiply by 2
		
		value = value.multiply(new BigDecimal("2"));
		
		value = value.divide(radius, 10, RoundingMode.CEILING);
		
		// Step 4: Square root the entire value
		
		value = value.sqrt(new MathContext(2));
		
		// Step 5: Convert to km (per seconds)
		
		value = value.divide(new BigDecimal("1000"), 2, RoundingMode.CEILING);
		
		escapeVelocity = value.toString();
		
		return escapeVelocity;
	}
}
