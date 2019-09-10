package submarinegame;

import static submarinegame.Coodinatesetter.get;
import static submarinegame.Coodinatesetter.reset;
import static submarinegame.Rader.attempt;
import static submarinegame.Main.shipname;

import java.util.ArrayList;

@Deprecated
public class ThreeEnemy {

	ArrayList<String> aaa = new ArrayList<String>();
	ArrayList<String> bbb = new ArrayList<String>();
	ArrayList<String> ccc = new ArrayList<String>();
	
	public void check(String co , boolean overrided) {
		
		if (aaa.contains(co.toUpperCase())) {
			
			aaa.remove(aaa.indexOf(co));
			
				if (aaa.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("ÇÔ¼± " + shipname.get(name) + "ÆÄ±«!");
					shipname.remove(name);
					
				}
			attempt(co,"hit");
		} else if (bbb.contains(co.toUpperCase())) {
			
			bbb.remove(bbb.indexOf(co));
			
				if (bbb.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("ÇÔ¼± " + shipname.get(name) + "ÆÄ±«!");
					shipname.remove(name);
					
				}
				attempt(co,"hit");
		} else if (ccc.contains(co.toUpperCase())) {
			
			ccc.remove(ccc.indexOf(co));
			
				if (ccc.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("ÇÔ¼± " + shipname.get(name) + "ÆÄ±«!");
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
