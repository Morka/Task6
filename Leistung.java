/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

public abstract class Leistung{
	//Postcondition: if the appropriate method makes call to security.setLeistung(this), Leistung is  this, otherwise leistung is null
	public abstract void vonSecurityStufe1Benutzt(SecurityStufe1 security);
	public abstract void vonSecurityStufe2Benutzt(SecurityStufe2 security);
	public abstract void vonSecurityStufe3Benutzt(SecurityStufe3 security);
	public abstract void vonSecurityStufe4Benutzt(SecurityStufe4 security);
	public abstract void vonSecurityStufe5Benutzt(SecurityStufe5 security);
	
	//Postcondition: returns a descriptive String
	public abstract String toString();
}
