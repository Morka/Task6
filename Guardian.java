/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Guardian extends Android {

	public Guardian(int snr, Skin skin, Software software, Security security, Leistung leistung) {
		super(snr, skin, software, security, leistung);
		// TODO Auto-generated constructor stub
	}
	
	public void aufGesellschafterWechseln(Android android){
	}
	
	public void aufHilfskraftWechseln(Android android){

	}
	public void aufKaempferWechseln(Android android){
		android = new G_Kaempfer(android.getSNumber(), android.getSkin(), android.getSoftware(), android.getSecurity(), android.getSecurity().getLeistung()); 
		
	}
	public void aufLeibwaechterWechseln(Android android){
		android = new G_Leibwaechter(android.getSNumber(), android.getSkin(), android.getSoftware(), android.getSecurity(), android.getSecurity().getLeistung()); 
	
	}
	public void aufObjektbewacherWechseln(Android android){
		android = new G_Objektbewacher(android.getSNumber(), android.getSkin(), android.getSoftware(), android.getSecurity(), android.getSecurity().getLeistung()); 
	
	}
	
	public void aufBauarbeiterWechseln(Android android){
	
	}
	
	public void aufServiceTechnikerWechseln(Android android){
	
	}
	
	public void aufTransportarbeiterWechseln(Android android){
	
	}
	
	public String toString(){
		return super.toString();
	}
}