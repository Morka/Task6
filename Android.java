/**
 * @author Matthias Gusenbauer, Wolfgang Hofer, Alexander Neff
 */

import java.util.Iterator;
import java.util.Stack;

public abstract class Android {
	private Stack<Android> stack = new Stack<Android>();
	private final int snr;
	private Skin skin;
	private Software software;
	
	public Android(int snr, Skin skin, Software software) {
		this.snr = snr;
		
		this.benutzeSoftware(software);
		//this.benutzeSkin(Skin);
		
	}
	
	public Android deliverAndroid() {
		stack.add(this);
		return this;
	}
	
	public abstract void benutzeSoftware(Software software);
	
	protected void setSoftware(Software software) {
		this.software = software;
	}
	
	public Software getSoftware() {
		return software;
	}
	
	//public abstract void benutzeSkin(Skin skin);
	
	/*public Skin getSkin() {
		return skin;
	}*/
	
	public abstract String toString();
	
	protected int getSNumber() {
		return snr;
	}
	
	protected Skin getSkin() {
		return skin;
	}
	
	public Iterator<Android> iterator() {
		return stack.iterator();
	}
}