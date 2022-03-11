package lettreOO;

import java.util.ArrayList;

public class Phrase extends LettreComposite{
	
	public Phrase(ArrayList<Mot> mot) {
		for(Mot m : mot) {
			 this.add(m);
		}
	   
	  }

	  @Override
	  protected String printThisAfter() {
	    return ".";
	  }

}
