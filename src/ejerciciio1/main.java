package ejerciciio1;

import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
        ArrayList<Integer> operas = new ArrayList<>();
        operas.add(10);
        operas.add(20);
        operas.add(70);
        operas.add(15);
        operas.add(30);
        operas.add(65);

        example analisis = new example(operas);

        System.out.println(analisis.comprobar(operas));
    }
}


