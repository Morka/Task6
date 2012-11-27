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
		
		//Initialize android parts
		Software helpSoft = new HilfskraftSoftware();
		Software communitySoft = new GesellschafterSoftware();
		Software fightSoft = new KaempferSoftware();
		Software builderSoft = new BauarbeiterSoftware();
		Software protectSoft = new LeibwaechterSoftware();
		Software objProtSoft = new ObjektbewacherSoftware();
		Software serviceSoft = new ServiceTechnikerSoftware();
		Software cargoSoft = new TransportarbeiterSoftware();
		
		Security sec1 = new SecurityStufe1();
		Security sec2 = new SecurityStufe2();
		Security sec3 = new SecurityStufe3();
		Security sec4 = new SecurityStufe4();
		Security sec5 = new SecurityStufe5();
		
		Skin touchSkin = new BeruehrungssensitivSkin();
		Skin armoredSkin = new GepanzerteSkin();
		Skin highDensitySkin = new HochfesteSkin();
		
		Leistung power1 = new Leistung1KW();
		Leistung power5 = new Leistung5KW();
		Leistung power10 = new Leistung10KW();
		Leistung powerInf = new LeistungUnendlichKW();
		
		//Initialize all androids
		Android a1 = new B_Hilfskraft(1, touchSkin, helpSoft, sec2, power1);
		Android a2 = new B_Gesellschafter(2, touchSkin, communitySoft, sec1, power1);
		Android a3 = new G_Kaempfer(3, armoredSkin, fightSoft, sec5, powerInf);
		Android a4 = new G_Leibwaechter(4, armoredSkin, protectSoft, sec4, power10);
		Android a5 = new G_Objektbewacher(5, armoredSkin, objProtSoft, sec4, power10);
		Android a6 = new S_Bauarbeiter(6, highDensitySkin, builderSoft, sec3, power5);
		Android a7 = new S_ServiceTechniker(7, highDensitySkin, serviceSoft, sec3, power5);
		Android a8 = new S_Transportarbeiter(8, highDensitySkin, cargoSoft, sec4, power10);
		
		B_Hilfskraft a9 = new B_Hilfskraft(9, touchSkin, helpSoft, sec2, power1);
		B_Gesellschafter a10 = new B_Gesellschafter(10, touchSkin, communitySoft, sec1, power1);
		G_Kaempfer a11 = new G_Kaempfer(11, armoredSkin, fightSoft, sec5, powerInf);
		G_Leibwaechter a12 = new G_Leibwaechter(12, armoredSkin, protectSoft, sec4, power10);
		G_Objektbewacher a13 = new G_Objektbewacher(13, armoredSkin, objProtSoft, sec4, power10);
		S_Bauarbeiter a14 = new S_Bauarbeiter(14, highDensitySkin, builderSoft, sec3, power5);
		S_ServiceTechniker a15 = new S_ServiceTechniker(15, highDensitySkin, serviceSoft, sec3, power5);
		S_Transportarbeiter a16 = new S_Transportarbeiter(16, highDensitySkin, cargoSoft, sec4, power10);
		
		//Initiliaze a bad fighter unit with parts
		Skin tmpTouchSkin = new BeruehrungssensitivSkin();
		Software tmpServiceSoft = new ServiceTechnikerSoftware();
		Security tmpSec3 = new SecurityStufe3();
		Leistung tmpPower5 = new Leistung5KW();
		
		G_Kaempfer badFighter = new G_Kaempfer(17, tmpTouchSkin, tmpServiceSoft, tmpSec3, tmpPower5);
		
		//Update unit 16 with proper settings
		S_Transportarbeiter newA16 = new S_Transportarbeiter(16, highDensitySkin, cargoSoft, sec3, power5); //new Unit 16 - OK!
		
		//Update unit 8 with false settings
		Skin tmpDensitySkin = new HochfesteSkin();
		Software tmpCarSoftware = new TransportarbeiterSoftware();
		Security tmpSecu3 = new SecurityStufe3();
		Leistung tmpPower10 = new Leistung10KW();
		
		Android newA8 = new S_Transportarbeiter(8, tmpDensitySkin, tmpCarSoftware, tmpSecu3, tmpPower10);//new Unit 8 - BAD!
		
		//Add all androids into the RoboShop list
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
		shop.insert(badFighter);
		shop.insert(newA16);
		shop.insert(newA8);
		
		//Print all androids in the list
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
		
		Software newTransportSoft = new TransportarbeiterSoftware();
		
		Android newA15 = new S_Transportarbeiter(15, highDensitySkin, newTransportSoft, sec3, power5);
		
		shop.insert(newA15);
		
		System.out.println("new: " + 	shop.find(15));
		
		

	}
}