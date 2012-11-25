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
		Android delivery = android.deliverAndroid();
		if(delivery != null)
			map.put(delivery.getSNumber(), delivery);
		else
			System.out.println("Fehler bei Androidauslieferung");
	}
	
	public String find(int snr) {
		Android droid;
		if((droid = map.get(snr)) != null)
			return droid.toString();
		
		return "null";
	}	
}