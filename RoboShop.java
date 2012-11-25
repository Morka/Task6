import java.util.HashMap;

/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class RoboShop {
	HashMap<Integer,Android> map;
	
	RoboShop() {
		map = new HashMap<Integer,Android>();
	}
	
	
	
	public void insert(Android android) {
		if(android.getSoftware() != null) //&& android.getSkin() != null && android.getLeistung != null
			map.put(android.getSNumber(), android.deliverAndroid());
	}
	
	public String find(int snr) {
		Android droid;
		if((droid = map.get(snr)) != null)
			return droid.toString();
		
		return "null";
	}	
}