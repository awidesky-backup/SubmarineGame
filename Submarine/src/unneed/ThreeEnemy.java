package unneed;

import static unneed.Coodinatesetter.get;
import static unneed.Coodinatesetter.reset;
import static unneed.Rader.attempt;

import java.util.ArrayList;

@Deprecated
public class ThreeEnemy {

	ArrayList<String> aaa = new ArrayList<String>();
	ArrayList<String> bbb = new ArrayList<String>();
	ArrayList<String> ccc = new ArrayList<String>();
	
	ArrayList<String> shipname = null;
	
	public void check(String co , boolean overrided) {
		

		if (aaa.contains(co.toUpperCase())) {
			
			aaa.remove(aaa.indexOf(co));
			
				if (aaa.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("�Լ� " + shipname.get(name) + "�ı�!");
					shipname.remove(name);
					
				}
			attempt(co,"hit");
		} else if (bbb.contains(co.toUpperCase())) {
			
			bbb.remove(bbb.indexOf(co));
			
				if (bbb.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("�Լ� " + shipname.get(name) + "�ı�!");
					shipname.remove(name);
					
				}
				attempt(co,"hit");
		} else if (ccc.contains(co.toUpperCase())) {
			
			ccc.remove(ccc.indexOf(co));
			
				if (ccc.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("�Լ� " + shipname.get(name) + "�ı�!");
					shipname.remove(name);
					
				}
			attempt(co,"hit");
		} else {
			
		if (!overrided) attempt(co , "miss");
			
		}
		
	}
	
	public void setenemy() {
		
		reset();
		
		get(this.aaa);
		get(this.bbb);
		get(this.ccc);
		
	}
}
