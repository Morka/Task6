import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class RoboShop {
	ArrayList<Android> list;
	
	RoboShop() {
		list = new ArrayList<Android>();
	}
	
	
	
	public void insert(Android android) {
		if(android.getSoftware() != null) //&& android.getSkin() != null && android.getLeistung != null
			list.add(android);
	}
	
	public String find(int snr) {
		
		return null;
	}
	
	public Iterator<Android> iterator() {
		return list.iterator();
	}
	
}