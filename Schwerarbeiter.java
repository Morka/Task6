/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Schwerarbeiter extends Android {

	public Schwerarbeiter(int snr, Skin skin, Software software, Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}
	
	public void aufGesellschafterWechseln(Android android){

	}
	
	public void aufHilfskraftWechseln(Android android){

	}
	public void aufKaempferWechseln(Android android){
		
	}
	public void aufLeibwaechterWechseln(Android android{
	
	}
	public void aufObjektbewacherWechseln(Android android){
	
	}
	
	public void aufBauarbeiterWechseln(Android android){
		android = new S_Bauarbeiter(android.getSNumber(), android.getSkin(), android.getSoftware(), android.getSecurity(), android.getSecurity().getLeistung()); 

	}
	
	public void aufServiceTechnikerWechseln(Android android){
		android = new S_ServiceTechniker(android.getSNumber(), android.getSkin(), android.getSoftware(), android.getSecurity(), android.getSecurity().getLeistung()); 
	
	}
	
	public void aufTransportarbeiterWechseln(Android android){
		android = new S_Transportarbeiter(android.getSNumber(), android.getSkin(), android.getSoftware(), android.getSecurity(), android.getSecurity().getLeistung()); 
	
	}
	
	public String toString(){
		return super.toString();
	}
}