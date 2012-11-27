/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Security {	
	private Leistung leistung;
	//Postcondition: if the appropriate method makes call to android.setSecurity(this), Security is  this, otherwise Security is null
	public abstract void vonHilfskraftBenutzt(B_Hilfskraft android);
	public abstract void vonGesellschafterBenutzt(B_Gesellschafter android);
	public abstract void vonBauarbeiterBenutzt(S_Bauarbeiter android);
	public abstract void vonServiceTechnikerBenutzt(S_ServiceTechniker android);
	public abstract void vonTransportarbeiterBenutzt(S_Transportarbeiter android);
	public abstract void vonObjektbewacherBenutzt(G_Objektbewacher android);
	public abstract void vonLeibwaechterBenutzt(G_Leibwaechter android);
	public abstract void vonKaempferBenutzt(G_Kaempfer android);
	
	public abstract void benutzeLeistung(Leistung leistung);
	
	//Postcondition: this.leistung is set to parameter leistung
	public void setLeistung(Leistung leistung){
		this.leistung = leistung;
	}
	
	public Leistung getLeistung(){
		return leistung;
	}
	
	//Postcondition: returns a descriptive String
	public abstract String toString();
}