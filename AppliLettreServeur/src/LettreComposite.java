
import java.io.Serializable;
import java.util.ArrayList;

public abstract class LettreComposite implements Serializable {
	
	private final ArrayList<LettreComposite> list = new ArrayList<LettreComposite>();
	
	 public void add(LettreComposite letter) {
		    list.add(letter);
		  }
	 
	  protected String printThisBefore() {
		  return "";
	  }

	  protected String printThisAfter() {
		  return "";
	  }
	  
	  public String print() {
		  String chaine = "";
		    chaine += printThisBefore();
		    for(LettreComposite c : list) {
		    	chaine += c.print();
		    }
		    chaine += printThisAfter();
		    
		    return chaine;
		  }
	  

	  
}
