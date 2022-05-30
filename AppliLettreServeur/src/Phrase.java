

import java.util.ArrayList;

public class Phrase extends LettreComposite{
	
	Ponctuation ponctuation;
	
	public Phrase(ArrayList<Mot> mot, Ponctuation ponctuation) {
		for(Mot m : mot) {
			 this.add(m);
		}
		
		this.ponctuation = ponctuation;
	   
	  }
	
	@Override
	protected String printThisAfter() {
		  return ponctuation.print();
	  }
	  


}
