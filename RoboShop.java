import java.util.HashMap;
import java.util.Stack;
import java.util.Iterator;


/**
* @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
*/

public class RoboShop {
	private HashMap<Integer,Android> map;
	private Stack<Android> stack;
	
	
	RoboShop() {
		map = new HashMap<Integer,Android>();
		stack = new Stack<Android>();
	}
	
	
	
	public void insert(Android android) {
		Android delivery;
		if((delivery = findAndroid(android.getSNumber())) == null){
			delivery = android.deliverAndroid();
			
			if(delivery != null){
				map.put(delivery.getSNumber(), delivery);
				stack.add(delivery);
			}
			else
				System.out.println("Fehler bei Androidauslieferung");
		}
		else{
			delivery.changeAndroid(android.deliverAndroid());
			delivery = delivery.deliverAndroid();
		}
	}
	
	private Android findAndroid(int snr){
		return map.get(snr);
	}
	
	public String find(int snr) {
		Android droid;
		if((droid = map.get(snr)) != null)
			return droid.toString();
		
		return "Androide mit der Seriennummer " + snr + " nicht gefunden";
	}	
	
	public Iterator<Android> iterator(){
		return stack.iterator();
	}
}