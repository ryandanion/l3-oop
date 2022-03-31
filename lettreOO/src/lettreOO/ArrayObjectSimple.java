package lettreOO;

import java.io.Serializable;

public class ArrayObjectSimple implements Serializable{
	
	private Object[] array;
	private Object first;
	
	public ArrayObjectSimple(int taille) {
		array = new Object[taille];
		first = null;
	}

	public void ajouteElement(int nCase,Object element) {
		Boolean ajouter = true;
		
		if(first != null && first.getClass() != element.getClass()) {
			ajouter = false;
		}
		
		if(ajouter) {
			array[nCase] = element;
			first = element;
		}else {
			System.out.println("l'élement n'est pas du même type que le premier");
		}
	
			
			
	}
	
	@Override
	public String  toString() {
		String string = "";
		for(Object o : array) {
			if(o != null) {
				string+=o.toString() +" /// ";
			}else {
				string+=" null /// ";
			}
		}
		return string;
	}
	
	

}
