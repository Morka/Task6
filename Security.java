/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Security {	
	public abstract String toString();
	public abstract void vonHilfskraftSoftwareBenutzt(HilfskraftSoftware software);
	public abstract void vonGesellschafterSoftwareBenutzt(GesellschafterSoftware software);
	public abstract void vonBauarbeiterSoftwareBenutzt(BauarbeiterSoftware software);
	public abstract void vonServiceTechnikerSoftwareBenutzt(ServiceTechnikerSoftware software);
	public abstract void vonTransportarbeiterSoftwareBenutzt(TransportarbeiterSoftware software);
	public abstract void vonObjektbewacherSoftwareBenutzt(ObjektbewacherSoftware software);
	public abstract void vonLeibwaechterSoftwareBenutzt(LeibwaechterSoftware software);
	public abstract void vonKaempferSoftwareBenutzt(KaempferSoftware software);
}