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
		
		Skin touchSkin = new BeruehrungssensitivSkin();
		Skin armoredSkin = new GepanzerteSkin();
		Skin highDensitySkin = new HochfesteSkin();
		
		Leistung l1 = new Leistung1KW();
		Leistung l2 = new Leistung5KW();
		Leistung l3 = new Leistung10KW();
		Leistung l4 = new LeistungUnendlichKW();
		
		Android a1 = new B_Hilfskraft(1, touchSkin, s1, sec1, l1);
		Android a2 = new B_Gesellschafter(2, touchSkin, s2, sec1, l1);
		Android a3 = new G_Kaempfer(3, armoredSkin, s1, sec1, l1);
		Android a4 = new G_Leibwaechter(4, armoredSkin, s1, sec1, l1);
		Android a5 = new G_Objektbewacher(5, armoredSkin, s1, sec1, l1);
		Android a6 = new S_Bauarbeiter(6, highDensitySkin, s1, sec1, l1);
		Android a7 = new S_ServiceTechniker(7, highDensitySkin, s1, sec1, l1);
		Android a8 = new S_Transportarbeiter(8, highDensitySkin, s1, sec1, l1);
		
		B_Hilfskraft a9 = new B_Hilfskraft(9, touchSkin, s1, sec1, l1);
		B_Gesellschafter a10 = new B_Gesellschafter(10, touchSkin, s2, sec1, l1);
		G_Kaempfer a11 = new G_Kaempfer(11, armoredSkin, s1, sec1, l1);
		G_Leibwaechter a12 = new G_Leibwaechter(12, armoredSkin, s1, sec1, l1);
		G_Objektbewacher a13 = new G_Objektbewacher(13, armoredSkin, s1, sec1, l1);
		S_Bauarbeiter a14 = new S_Bauarbeiter(14, highDensitySkin, s1, sec1, l1);
		S_ServiceTechniker a15 = new S_ServiceTechniker(15, highDensitySkin, s1, sec1, l1);
		S_Transportarbeiter a16 = new S_Transportarbeiter(16, highDensitySkin, s1, sec1, l1);
		
		B_Gesellschafter ges1 = new B_Gesellschafter(4,new BeruehrungssensitivSkin(), s2, sec1, l1);
		B_Hilfskraft hk1 = new B_Hilfskraft(5,new BeruehrungssensitivSkin(), s1, sec1, l1);
		//Android a4 = new G_Kaempfer(6, new GepanzerteSkin(), s5, sec5, l4); 
		
		shop.insert(a1);
		shop.insert(a2);
		shop.insert(a3);
		shop.insert(a4);
		shop.insert(a5);
		shop.insert(a6);
		shop.insert(a7);
		shop.insert(a8);
		shop.insert(a9);
		shop.insert(a10);
		shop.insert(a11);
		shop.insert(a12);
		shop.insert(a13);
		shop.insert(a14);
		shop.insert(a15);
		shop.insert(a16);
		shop.insert(ges1);
		shop.insert(hk1);
		shop.insert(a4);
		

		System.out.println(shop.find(1));
		System.out.println(shop.find(2));
		System.out.println(shop.find(3));
		System.out.println(shop.find(4));
		System.out.println(shop.find(5));
		System.out.println(shop.find(6));
		System.out.println(shop.find(7));
		System.out.println(shop.find(8));
		System.out.println(shop.find(9));
		System.out.println(shop.find(10));
		System.out.println(shop.find(11));
		System.out.println(shop.find(12));
		System.out.println(shop.find(13));
		System.out.println(shop.find(14));
		System.out.println(shop.find(15));
		System.out.println(shop.find(16));
	}
}