package enemy;

import static submarinegame.Coodinatesetter.get;
import static submarinegame.Rader.attempt;
import static submarinegame.Main.shipname;
import java.util.ArrayList;

public class SevenEnemy extends FiveEnemy{

	ArrayList<String> fff = new ArrayList<String>();
	ArrayList<String> ggg = new ArrayList<String>();
	
	@Override
	public void check(String co , boolean overrided) {
		
		super.check(co, true);
		if (fff.contains(co.toUpperCase())) {
			
			fff.remove(fff.indexOf(co));
			
				if (fff.isEmpty()) {
					
					int name = (int)Math.random() * 8;
					System.out.println("ÇÔ¼± " + shipname.get(name) + " ÆÄ±«!");
					shipname.remove(name);
					
				}
			attempt(co,"hit");
		} else if (ggg.contains(co.toUpperCase())) {
			
			ggg.remove(ggg.indexOf(co));
			
				if (ggg.isEmpty()) {
					
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
		
		get(this.fff);
		get(this.ggg);
		
	}
}
