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
		
		Android a1 = new B_Hilfskraft(1, new BeruehrungssensitivSkin(), s1);
		Android a2 = new B_Gesellschafter(2, new BeruehrungssensitivSkin(), s2);
		Android a3 = new B_Gesellschafter(3, new BeruehrungssensitivSkin(), s1);
		B_Gesellschafter ges1 = new B_Gesellschafter(4,new BeruehrungssensitivSkin(), s2);
		B_Hilfskraft hk1 = new B_Hilfskraft(5,new BeruehrungssensitivSkin(), s1);
		
		shop.insert(a1);
		shop.insert(a2);
		shop.insert(a3);
		shop.insert(ges1);
		shop.insert(hk1);
		

		System.out.println(shop.find(1));
		System.out.println(shop.find(2));
		System.out.println(shop.find(3));
		System.out.println(shop.find(4));
		System.out.println(shop.find(5));
	}
}