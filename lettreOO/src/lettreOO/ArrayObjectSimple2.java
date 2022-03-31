package lettreOO;

import java.io.Serializable;

public class ArrayObjectSimple2<T>{
	
	private T[] array;

	
	public ArrayObjectSimple2(int taille) {
		array = (T[]) (new Object[taille]);
	}
	
	public void ajouteElement(int nCase,T element) {
			array[nCase] = element;
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
