public class InadequateMapDisplay {
	
	public void showMap() {
		
		SpaceSystem map = new SpaceSystem();
		
		if(map.getCurrentLocationRaw() == 0) {
			
			System.out.println("\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@%S#@@@@@@@@@@@@@@@@@@@@@@@#SS@@@@@@@@@@@@@@@@@@@%S@@@@@@@@@@@@@@@@@@@S#@@@@@@@@@@@@@@@@@@@#%@@@@@@@@@@@@@@@@@@@%#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@#S%%?%S@@@@@@@@@@@@@@@@@@@@@S?%#@@@@@@@@@@@@@@@@#*?S@@@@@@@@@@@@@@@@@#*?@@@@@@@@@@@@@@@@@@#*%@@@@@@@@@@@@@@@@@@#+S@@@@?+?##%?#@%#@@@S%@@S%%@@@@@@?+?#S%S%@S%S@#??S@S%%S#%S%#\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@S%??%#@@@@@@@@@@@@@@@@@@@#??S@@@@@@@@@@@@@@@@S*%#@@@@@@@@@@@@@@@@#?*#@@@@@@@@@@@@@@@@@@*?@@@@@@@@@@@@@@@@@@#+#@@@%*+#?**+@;?@@#;,S@+;:S@@@@@%*+##+:%@?;;S#%;@@++?#%,:,#\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#S??S@@#?*+++*%#@@@@@@@#??%@@@@@@@@@@@@@@@@%*S@@@@@@@@@@@@@@@@@S*S@@@@@@@@@@@@@@@@@@??@@@@@@@@@@@@@@@@@@#+S@@?*+#S++%@?*?#?*%*@?%*S@@@@@?*+#@S*@@%*;#@S*@@?+?#??S+#\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@S%?+,,,,,,,,,+#@@@@@@@S??%@@@@@@@@@@@@@@@#??@@@@@@@@@@@@@@@@@#*%@@@@@@@@@@@@@@@@@@??@@@@@@@@@@@@@@@@@@S*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "SSS%SS%%%%SS#S#@@@@@@@@@@@@@@@@@@@@@@@@@@@;,,,,,,,,,,,:#@@@@@@@@#??S@@@@@@@@@@@@@@#%*%@@@@@@@@@@@@@@@@@??#@@@@@@@@@@@@@@@@@??#@@@@@@@@@@@@@@@@@%+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@#@###S%%%%%S#@@@@@@@@@@@@@@@@@@@@%.,,,,,,,,,,,.%@@@@@@@@@@#*?S@@@@@@@@@@@@@@#??#@@@@@@@@@@@@@@@@?*@@@@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@#S%%%%%S@@@@@@@@@@@@@@@S,,,,,,,,,,,,,S@@@@@@@@@@@@S*%#@@@@@@@@@@@@@@%*#@@@@@@@@@@@@@@@@%*#@@@@@@@@@@@@@@@@@??@@@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@S%%??S@@@@@@@@@@@@%,,,,,,,,,,.?@@@@@@@@@@@@@@@%*S@@@@@@@@@@@@@@S*%@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@#%??%#@@@@@@@@@S*;:,,,:;+%?%@@@@@@@@@@@@@@@#*?@@@@@@@@@@@@@@#*%@@@@@@@@@@@@@@@@S*#@@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#%??S@@@@@@@@@@@SS#@@@@#S?%@@@@@@@@@@@@@@@%*S@@@@@@@@@@@@@@??@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@#*S@@@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "S####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#%??S@@@@@@@@@@@@@@@@@@%*%@@@@@@@@@@@@@@#*%@@@@@@@@@@@@@@??@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "SSSSSS%%%%%SSS#@@@@@@@@@@@@@@@@@@@@@@#%?%S@@@@@@@@@@@@@@@@#??#@@@@@@@@@@@@@@??@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@%;::::;*S@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@SSS%%%SS@@@@@@@@@@@@@@@@@@@@%??S@@@@@@@@@@@@@@@@S*S@@@@@@@@@@@@@@%*#@@@@@@@@@@@@@%?@@@@@@@@@@@@S;.........;#@@@@@@@@@@?%@@@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@%%%?%S@@@@@@@@@@@@@@@@@@S*?S@@@@@@@@@@@@@@@@??@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@%?@@@@@@@@@@@:...........+@@@@@@@@@@@+@@@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@S?%%S#@@@@@@@@@@@@@@@@S??S@@@@@@@@@@@@@@@%*#@@@@@@@@@@@@@%*#@@@@@@@@@@@@@??@@@@@@@@@@,...........:@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@#%??S@@@@@@@@@@@@@@@@S*%@@@@@@@@@@@@@@@S*S@@@@@@@@@@@@@S*#@@@@@@@@@@@@@?%@@@@@@@@@+...........*@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@#%?S@@@@@@@@@@@@@@@@?*#@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@%*#@@@@@@@@@@@@@*#@@@@@@@@@?:.......:%@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@S?%#@@@@@@@@@@@@@@S*%@@@@@@@@@@@@@@#*?#@@@@@@@@@@@@%*@@@@@@@@@@@@@#*@@@@@@@@@@@S?***;%@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "SS%S%SSS@@@@@@@@@@@@@@@@@@@@@@@@@S??#@@@@@@@@@@@@@#??#@@@@@@@@@@@@@@??@@@@@@@@@@@@@??#@@@@@@@@@@@@%?@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@#*#@@@@@@@@@@@@@@@@S+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@##SS%%%%SS@@@@@@@@@@@@@@@@@@@@@S?%@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@?%@@@#%S@@@@@@@*#@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@%%@@@@@@@@@@@@@@@@@+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@SS%%%#@@@@@@@@@@@@@@@@@@#%?S@@@@@@@@@@@@@%*#@@@@@@@@@@@@@@*S@@@@@@@@@@@@#*@@@S,.:*#@@@@#*@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@S%%%#@@@@@@@@@@@@@@@@@S*%#@@@@@@@@@@@@S*#@@@@@@@@@@@@@#+#@@@@@@@@@@@@S*@@@S:..,;%@@@%S@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@S??S#@@@@@@@@@@@@@@@@??@@@@@@@@@@@@@S*S@@@@@@@@@@@@@%*@@@@@@@@@@@@@*S@@@#*,.,,:?S%;***%S@@@@@@@@@@S*@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@%*%#@@@@@@@@@@@@@@@%*#@@@@@@@@@@@@S*@@@@@@@@@@@@@@?%@@@@@@@@@@@@#*@@@@@S;,,:.........:*S@@@@@@@@+#@@@@@@@@@@@@@@@@*@@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@%*?**?#@@@@@@@@@@@%*#@@@@@@@@@@@@??@@@@@@@@@@@@@#*#@@@@@@@@@@@@?S@@@@@@%,............:#@@@@@@@%%@@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@*,....,%@@@@@@@@@@@%*#@@@@@@@@@@@@*S@@@@@@@@@@@@@%?@@@@@@@@@@@@#*@@@@@@#,.............+@@@@@@@S+@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@:......*@@@@@@@@@@@@%?@@@@@@@@@@@@#*@@@@@@@@@@@@@@*#@@@@@@@@@@@@*#@@@@@S..............:@@@@@@@@*@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@S;,.,,+#@@@@@@@@@@@@@?S@@@@@@@@@@@@?%@@@@@@@@@@@@@%?@@@@@@@@@@@@S?@@@@@@;............,%@@@@@@@@?S@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "???%#@@@@@@@@@@@@@@@@@@@@@#S#S*#@@@@@@@@@@@@@#*#@@@@@@@@@@@#*@@@@@@@@@@@@@@*@@@@@@@@@@@@@+@@@@@@#+,.........,,?@@@@@@@@%?@@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "....,:+?#@@@@@@@@@@@@@@@@@@@@@S?@@@@@@@@@@@@@@%?@@@@@@@@@@@@?S@@@@@@@@@@@@@*S@@@@@@@@@@@@*#@@@@@@@S*+::,,;:.,,.;%@@@@@@#+@@@@@@@@@@@@@@@@S%@@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "........,*#@@@@@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@#*@@@@@@@@@@@@S?@@@@@@@@@@@@@%%@@@@@@@@@@@@%S@@@@@@@@@@@@S?@@%;,...+#@@@@@*@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "..........,%@@@@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@?S@@@@@@@@@@@@*@@@@@@@@@@@@@#*@@@@@@@@@@@@S?@@@@@@@@@@@@#*@@@@S*,..:%@@@@*#@@@@@@@@@@@@@@@#?@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "............?@@@@@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@%?@@@@@@@@@@@@*#@@@@@@@@@@@@@*@@@@@@@@@@@@#+@@@@@@@@@@@@@+@@@@@@#?+:;@@@@*#@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@+S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "............,#@@@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@S*@@@@@@@@@@@@*S@@@@@@@@@@@@@+#@@@@@@@@@@@@*@@@@@@@@@@@@@?@@@@@@@@@@@@@@@?#@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ " � H E R E � ?@@@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@?@@@@@@@#%*+;,:+*%#@@@@@@@@@*#@@@@@@@@@@@@?@@@@@@@@@@@@@*@@@@@@@@@@@@@@@?#@@@@@@@@@@@@@@@@?@@@@@@@@@@@@@@@@@%S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ ".............*@@@@@@@@@@@@@@@@@@S+@@@@@@@@@@@@@@?@@@@@#*:.........,;%#@@@@@@?#@@@@@@@@@@@@?@@@@@@@@@@@@@*@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@?@@@@@@@@@@@@@@@%+::+?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ ".............%@@@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@#*@@@@S:..............+@@@@@@*#@@@@@@@@@@@@?@@@@@@@@@@@@@*@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@*@@@@@@@@@@@@@@%......%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "............;@@@@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@S?@@@#,................*@@@@@+@@@@@@@@@@@@@+@@@@@@@@@@@@@*@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@S:....,S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "...........;#@@@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@?%@@@?.................,@@@@#*@@@@@@@@@@@@#*@@@@@@@@@@@@#+@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@?@@@@@@@@@@@@@@@#%:+%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ ".........,*#@@@@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@*#@@@%.................:@@@@S?@@@@@@@@@@@@S?@@@@@@@@@@@@#*@@@@@@@@@@@@@@@*@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ ".......:*#@@@@@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@S?@@@@@+...............,%@@@@?S@@@@@@@@@@@@?S@@@@@@@@@@@@S%@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ ",,::+*S@@@@@@@@@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@*S@@@@@#*,............:%@@@@@*@@@@@@@@@@@@@+#@@@@@@@@@@@@?S@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@S?@@@@@@@@S*:,......,;?@@@@@@#*@@@@@@@@@@@@#*@@@@@@@@@@@@@+@@@@@@@@@@@@@@@%%@@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@#?%@@@@@@@@@@@@@@#*@@@@@@@@@@@@#+?%%%S@@@@@@@@@*S@@@@@@@@@@@@%%@@@@@@@@@@@@#*@@@@@@@@@@@@@@@?#@@@@@@@@@@@@@@@@*@@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@S*S@@@@@@@@@@@@@@@*S@@@@@@@@@@@@%?@@@@@@@@@@@@@#*@@@@@@@@@@@@@*#@@@@@@@@@@@@%%@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@S??#@@@@@@@@@@@@@@@?S@@@@@@@@@@@@#*@@@@@@@@@@@@@@*S@@@@@@@@@@@@S?@@@@@@@@@@@@@+#@@@@@@@@@@@@@@S?@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@#%?S@@@@@@@@@@@@@@@@?S@@@@@@@@@@@@#+#@@@@@@@@@@@@@S*@@@@@@@@@@@@@*#@@@@@@@@@@@@S?@@@@@@@@@@@@@@@?S@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@#%?%@@@@@@@@@@###@@@@?S@@@@@@@@@@@@@*%@@@@@@@@@@@@@@*#@@@@S?+;;;;;;;S#@@@@@@@@@@@*#@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@S??S@@@@@@@@S*;:,,,,;**#@@@@@@@@@@@@@?%@@@@@@@@@@@@@@?S@@#*:...........,+S@@@@@@@@S*@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@S%%?S@@@@@@@@@#+,.........,+#@@@@@@@@@@@??@@@@@@@@@@@@@@%?@@%:...............,?@@@@@@@*S@@@@@@@@@@@@@@@*@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@##SS%%%S@@@@@@@@@@@@;.............:#@@@@@@@@#?%@@@@@@@@@@@@@@S*@@%...................*@@@@@%?@@@@@@@@@@@@@@@%%@@@@@@@@@@@@@@@@S?@@@@@@@@@@@@@@@@@?%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "SSSSSS%%S%S#@@@@@@@@@@@@@@@%...............?@@@@@@@#*%@@@@@@@@@@@@@@S*@@@:...................,#@@@#*@@@@@@@@@@@@@@@#*@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@@+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "##@@@@@@@@@@@@@@@@@@@@@@@@@S...............%@@@@@@S?#@@@@@@@@@@@@@@S*#@@#,....................S@@@*S@@@@@@@@@@@@@@@*S@@@@@@@@@@@@#%**+;S@@@@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@+.............;@@@@@#??#@@@@@@@@@@@@@@S*@@@@@:...................,#@@??@@@@@@@@@@@@@@@%*@@@@@@@@@@@@*,.....,+#@@@@@@@@@@@@@@+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@#S?+:.........,*#@@@#%*S@@@@@@@@@@@@@@@%*#@@@@@?...................*@@S*@@@@@@@@@@@@@@@@+#@@@@@@@@@@@?.........*@@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@S%%%#@#%*+;:;;*%#@@@#S*%@@@@@@@@@@@@@@@@??@@@@@@@@?,...............,*@@S*#@@@@@@@@@@@@@@@?%@@@@@@@@@@@@*.........*@@@@@@@@@@@@@+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@#S%%S#@@@@@@@@@@@@@@@@#S?%#@@@@@@@@@@@@@@@S*%@@@@@@@@@@S*,...........,+S@@#*#@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@#+,.....,;#@@@@@@@@@@@@%?@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@#S%%?S#@@@@@@@@@@@@@@@@@@@S*?#@@@@@@@@@@@@@@@@%*S@@@@@@@@@@@@@S+++::::;;*%#@@@#+S@@@@@@@@@@@@@@@S*#@@@@@@@@@@@@@@@S+:++?S@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@##SS%%%%%%#@@@@@@@@@@@@@@@@@@@@@#%??#@@@@@@@@@@@@@@@@#?%@@@@@@@@@@@@@@S*#@@@@@@@@@@@@@#+S@@@@@@@@@@@@@@@#+@@@@@@@@@@@@@@@@@#+#@@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "%SS%%SSS###@@@@@@@@@@@@@@@@@@@@@@@@@S%?%@@@@@@@@@@@@@@@@@@?*#@@@@@@@@@@@@@@%*S@@@@@@@@@@@@@S+S@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@@@@@*S@@@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#%%%S@@@@@@@@@@@@@@@@@@%*%#@@@@@@@@@@@@@#??@@@@@@@@@@@@@@#*#@@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@@@@@??@@@@@@@@@@@@@@@@@#+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#%??#@@@@@@@@@@@@@@@@@@@S*%@@@@@@@@@@@@@@@S*S@@@@@@@@@@@@@@%*#@@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@#%%%%#@@@@@@@@@@@@@@@@@@@@S*?#@@@@@@@@@@@@@@#?*#@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@#*%@@@@@@@@@@@@@@@@@S*@@@@@@@@@@@@@@@@@@%*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@##S%%%%S@@@@@@@@@@@@@@@@@@@@@@%?%#@@@@@@@@@@@@@@#%*%@@@@@@@@@@@@@@#*?@@@@@@@@@@@@@@@@@*%@@@@@@@@@@@@@@@@@#+S@@@@@@@@@@@@@@@@@S+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@##S%%%%%S##@@@@@@@@@@@@@@@@@@@@@@#%?%#@@@@@@@@@@@@@@@S??@@@@@@@@@@@@@@@%*%@@@@@@@@@@@@@@@@#+S@@@@@@@@@@@@@@@@@#+#@@@@@@@@@@@@@@@@@#+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "######SS%SSSS%%SS#@@@@@@@@@@@@@@@@@@@@@@@@@@#%??#@@@@@@@@@@@@@@@@#?*#@@@@@@@@@@@@@@@%*#@@@@@@@@@@@@@@@@S*S@@@@@@@@@@@@@@@@@S+S@@@@@@@@@@@@@@@@@#+S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "S##S#####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#S@@@@@@@@@@@@@@@@@@@S#@@@@@@@@@@@@@@@@#%#@@@@@@@@@@@@@@@@@S#@@@@@@@@@@@@@@@@@@S#@@@@@@@@@@@@@@@@@@#S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n"
					+ "\r\n"
					+ "");
		}
	}	
}
