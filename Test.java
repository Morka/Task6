import java.util.Iterator;

/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RoboShop shop = new RoboShop();	
		
		Software s1 = new HilfskraftSoftware();
		Software s2 = new GesellschafterSoftware();
		
		Android a1 = new B_Hilfskraft(1, new Skin(), s1);
		Android a2 = new B_Gesellschafter(2, new Skin(), s2);
		Android a3 = new B_Gesellschafter(3, new Skin(), s1);
		
		shop.insert(a1);
		shop.insert(a2);
		shop.insert(a3);
		
		Iterator<Android> it = shop.iterator();
		
		while(it.hasNext()) {
			Android and = it.next();
			System.out.println(and.toString());
		}		
	}
}