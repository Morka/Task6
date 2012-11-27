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
		Software s5 = new KaempferSoftware();
		
		Security sec1 = new SecurityStufe1();
		Security sec2 = new SecurityStufe2();
		Security sec3 = new SecurityStufe3();
		Security sec4 = new SecurityStufe4();
		Security sec5 = new SecurityStufe5();
		
		Leistung l1 = new Leistung1KW();
		Leistung l2 = new Leistung5KW();
		Leistung l3 = new Leistung10KW();
		Leistung l4 = new LeistungUnendlichKW();
		
		Android a1 = new B_Hilfskraft(1, new BeruehrungssensitivSkin(), s1, sec1, l1);
		Android a2 = new B_Gesellschafter(2, new BeruehrungssensitivSkin(), s2, sec1, l1);
		Android a3 = new B_Gesellschafter(3, new BeruehrungssensitivSkin(), s1, sec1, l1);
		B_Gesellschafter ges1 = new B_Gesellschafter(4,new BeruehrungssensitivSkin(), s2, sec1, l1);
		B_Hilfskraft hk1 = new B_Hilfskraft(5,new BeruehrungssensitivSkin(), s1, sec1, l1);
		Android a4 = new G_Kaempfer(6, new GepanzerteSkin(), s5, sec5, l4); 
		
		shop.insert(a1);
		shop.insert(a2);
		shop.insert(a3);
		shop.insert(ges1);
		shop.insert(hk1);
		shop.insert(a4);
		

		System.out.println(shop.find(1));
		System.out.println(shop.find(2));
		System.out.println(shop.find(3));
		System.out.println(shop.find(4));
		System.out.println(shop.find(5));
		System.out.println(shop.find(6));
	}
}