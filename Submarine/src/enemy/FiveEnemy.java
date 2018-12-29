package enemy;

import static submarinegame.Coodinatesetter.get;
import static submarinegame.Rader.attempt;
import static submarinegame.Main.shipname;
import java.util.ArrayList;

public class FiveEnemy extends ThreeEnemy {

	ArrayList<String> ddd = new ArrayList<String>();
	ArrayList<String> eee = new ArrayList<String>();

	@Override
	public void check(String co , boolean overrided) {
		
		super.check(co, true);
		if (ddd.contains(co.toUpperCase())) {
			
			ddd.remove(ddd.indexOf(co));
			
				if (ddd.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("ÇÔ¼± " + shipname.get(name) + " ÆÄ±«!");
					shipname.remove(name);
					
				}
			attempt(co,"hit");
		} else if (eee.contains(co.toUpperCase())) {
			
			eee.remove(eee.indexOf(co));
			
				if (eee.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("ÇÔ¼± " + shipname.get(name) + "ÆÄ±«!");
					shipname.remove(name);
					
				}
			attempt(co,"hit");
		} else {
			if (!overrided) attempt(co , "miss");
		}
		
	}
	
	@Override
	public void setenemy() {
		
		super.setenemy();
		
		get(this.ddd);
		get(this.eee);
		
	}
}
