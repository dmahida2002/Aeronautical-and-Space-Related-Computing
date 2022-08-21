import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class InformationScraper {
	
	public String[] getPlanetNames(int count) throws IOException{
		
		String listOfNames[] = new String[count];
		
		String URL = "https://www.coolgenerator.com/planet-name-generator";
		String trail = "";
		
		Document doc = Jsoup.connect(URL).get();
		
		Elements lcEl = doc.select("b");
		
		char nextChar;
		
		int i = 0;
		
		int r = 0;
		
		boolean add[] = {false, true};
		
		for(Element e : lcEl.select("span")) {
			
			if(i == count) break;
			
			trail = "";
			
			if(add[(int) (Math.random()*(1 - 0 + 1))]) {
				
				for(int j = 0; j < 3; j++) {
	                
	                char randomizer[] = {
	                    
	                    (char)(Math.random()*('Z' - 'A' + 1) + 'A'),
	                    (char)(int)(Math.random()*('9' - '0' + 1) + '0')
	                
	                };
	                
	                r = (int)(Math.random()*((randomizer.length - 1) - 0 + 1) + 0);
	                nextChar = randomizer[r];
	                trail += nextChar;
	            }//end for
				
				listOfNames[i] = e.text() + " " + trail;
			}
			
			else {
				
				listOfNames[i] = e.text();
			}
			
			i++;
		}
		
		return listOfNames;
	}
	
}
