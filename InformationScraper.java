import java.io.IOException;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class InformationScraper {
	
	public String[] getPlanetNames(int count) throws IOException{
		
		String listOfNames[] = new String[count];
		
		for(int i = 0; i < count; i++) {
			
			listOfNames[i] = "x" + i;
		}
		
		if(true) {
			
			return listOfNames;
		}
		
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
	
	public void getMap(int systemSize, int currentLocation) throws IOException {
		
		String URL = getLink(systemSize, currentLocation);
		
		Document doc = Jsoup.connect(URL).get();
		
		Elements lcEl = doc.select("div.col-12");
		
		for(Element e : lcEl) {
			
			System.out.println(e.text());
		}
	}
	
	private String getLink(int systemSize, int currentLocation) {
		
		String allURLMaps[][] = {
				
				// 1 Planet Mapping
				
				{"https://textdoc.co/SBeOD2Io7U8rw9l6", "https://textdoc.co/CjTtlBDgE7MxWP5q"},
				
				// 2 Planet Mapping
				
				{"https://textdoc.co/30ULVQrtYPuy78FR", "https://textdoc.co/RlSN6Zvg2PobDXqH", "https://textdoc.co/CPV5ZX4BflbDhnr8"},
				
				// 3 Planet Mapping
				
				{"https://textdoc.co/kMpHJjDEf69UY2lN", "https://textdoc.co/F462UHNgpOvCxRaL", "https://textdoc.co/sy5IHn2VC6Sejx7Q", 
					"https://textdoc.co/D6qKGIuBcEvgTwts"},
				
				// 4 Planet Mapping
				
				{"https://textdoc.co/pf7Va986T5q3JKPy", "https://textdoc.co/vuxjaByYWroq5GgR", 
					"https://textdoc.co/FQ2BM3cLle9T4X1v", "https://textdoc.co/oZg4bR7jEyY1SUf2", "https://textdoc.co/BtbK3MXxLE2AhPDJ"},
				
				// 5 Planet Mapping
				
				{"https://textdoc.co/KHXLivw2cJDTUqtx", "https://textdoc.co/L0fEy5dgSj16lPqO", "https://textdoc.co/6XhtYUTwkHFjNedc",
						"https://textdoc.co/C2ZM4ioIt9WQNurG", "https://textdoc.co/Aen348IhxUgsCv6y", "https://textdoc.co/iXSAmFGPuQcq2K6o"},
				
				// 6 Planet Mapping
				
				{"https://textdoc.co/61DeH8Uv2zkhaE3t", "https://textdoc.co/0O4p1tM7XIABFUTK", "https://textdoc.co/o0eQNSKPWdfCO7IB",
					    "https://textdoc.co/AIWpxtOXfNkhGr2U", "https://textdoc.co/td7S4joNnmsiB6Hx", "https://textdoc.co/2dCFmqhZwIAKN548",
					    "https://textdoc.co/qWiSRaZ8NfCnGhxM"},
				
				// 7 Planet Mapping
				
				{"https://textdoc.co/i34FafzOt6uSAmCb", "https://textdoc.co/ZJc2XQaC3hSULiT5", "https://textdoc.co/OW84YM2d7SI9KJGi",
					    "https://textdoc.co/Acdi1LHonbK7qhkP", "https://textdoc.co/3rgm2ZItOuBxEc9k", "https://textdoc.co/o6JhEmXYx9jGpFQ1",
					    "https://textdoc.co/vkumGsHAdfI5li1x", "https://textdoc.co/b7U5pEHklPtxgyzv"},
				
				// 8 Planet Mapping
				
				{"https://textdoc.co/AzaPnxhQBFr8GN6O", "https://textdoc.co/9J1RqUOFjuV4Ppk5", "https://textdoc.co/30EoTtwBYdGV8KOi", 
					    "https://textdoc.co/NvK7dCxYfzDqSEyc", "https://textdoc.co/nwCfTrlZaqvNOcFX", "https://textdoc.co/qrRLVfnOg18v4FkK",
					    "https://textdoc.co/IVtAYi0jGNm8W1sD", "https://textdoc.co/9n5N2WGsfyjEiV3z", "https://textdoc.co/tZDMA2cXfOSu9KPN"},
				
				//9 Planet Mapping
				
				{"https://textdoc.co/7F6tWJ5ZCuLqjDo3", "https://textdoc.co/QtYI1SGadFN827K5", "https://textdoc.co/TzCFavuMn2gLrVKp",
					    "https://textdoc.co/4HcbDgedYFf5RAwS", "https://textdoc.co/Vcx8aqO62EnLUTXu", "https://textdoc.co/kcfF3ys1Ku80Jq5b",
					    "https://textdoc.co/d6YAvPT9GbliR257", "https://textdoc.co/whligxJrC8ByX4tY", "https://textdoc.co/Rsrp5h3Pq78zXYJL", 
					    "https://textdoc.co/vt9AyosB2CaDqlik"}
				
				};
		
		for(int i = 1; i < 10; i++) {
			
			if(systemSize == i) {
				
				return allURLMaps[(i - 2)][currentLocation];
			}
		}
		
		return null;
	}
}
