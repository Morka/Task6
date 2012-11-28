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

	/**
	 * insert new Android into roboShop if its functional or changes
	 * old android
	 * 
	 * @param android
	 *
	 */
	//precondition: android != null
	//postcondition: if new Android is functional it is on the stack and in the map
	//				 otherwise it gives notice.
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
			stack.add(delivery);
			delivery.changeAndroid(android.deliverAndroid());
			delivery = delivery.deliverAndroid();
		}
	}
	/**
	 * finds Android in map
	 * @param snr
	 * @return gives back Android with specified snr or null if not found
	 */
	private Android findAndroid(int snr){
		return map.get(snr);
	}
	/**
	 * finds Android with given snr if existing otherwise error notice
	 *
	 * @param snr
	 *Ê
	 * @return string that describes the android or error notice
	 */
	//postcondition: descirptive string is given back if found, or an error notice
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