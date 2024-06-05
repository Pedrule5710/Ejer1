package ejerciciio1;
import java.util.*;

public class example {
	ArrayList<Integer> operas = new ArrayList<Integer>();
	
	   public example(ArrayList<Integer> operas) {
	        this.operas = operas;
	    }
	   public String comprobar(ArrayList<Integer> operas) {
		   String mensaje = null;
		   int suma=0;
		   if( operas.size() == 0) {
			   mensaje="El ArrayList esta vacio";
			   
		   }else {
			   for(int i=0; i < operas.size(); i++){
				   if((operas.get(i) % 2 ==1) || (operas.get(i) % 4 == 0)) {
					   suma= suma + operas.get(i);
				   }
			   }
			   mensaje = "EL arraylist es: " + operas.toString() +  " Y la suma de los impares y divisibles entre 4 es " + suma;
		   }
		   
		   
		return mensaje;
		   
	   }

}
