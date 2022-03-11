package lettreOO;

import java.util.ArrayList;
import java.util.List;

public class Mot extends LettreComposite{
	
	  public Mot(ArrayList<Caractere> mot) {
		  for(Caractere c : mot) {
			  this.add(c);
		  }
		  
		  }
	

		  @Override
		  protected String printThisBefore() {
		    return " ";
		  }

}
