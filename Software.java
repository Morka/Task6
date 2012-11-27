/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Software {
	//Postcondition: if the appropriate method makes call to android.setSoftware(this), Software is  this, otherwise Software is null
	public abstract void vonHilfskraftBenutzt(B_Hilfskraft android);
	public abstract void vonGesellschafterBenutzt(B_Gesellschafter android);
	public abstract void vonBauarbeiterBenutzt(S_Bauarbeiter android);
	public abstract void vonServicetechnikerBenutzt(S_ServiceTechniker android);
	public abstract void vonTransportarbeiterBenutzt(S_Transportarbeiter android);
	public abstract void vonObjektbewacherBenutzt(G_Objektbewacher android);
	public abstract void vonLeibwaechterBenutzt(G_Leibwaechter android);
	public abstract void vonKaempferBenutzt(G_Kaempfer android);
	//Postcondition: returns a descriptive String
	public abstract String toString();
}