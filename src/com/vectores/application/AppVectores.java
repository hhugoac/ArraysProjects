package com.vectores.application;
import com.vectores.misclases.*;

public class AppVectores {

	public static void main(String[] args) {
		 
		 //Se evitan los magicNUmbers con el uso de constantes.
		 final int NUM_FACTURAS=20;
		 boolean[] vecBoolean=new boolean[20];
		 int[] vecInt= {10,20,30,40,50,60,70,80,90,100};
		 char[] vecCaracteres=new char[] {'a','b','c','d','e','f','g','h','i'};
		 double[] vecDouble=new double [NUM_FACTURAS];
		 float[] vecFloat=new float [5];
		 String[] vecString=new String[10];
		 String cadena="Holo";
		 
		 System.out.println(cadena);
		 cadena=vecInt.toString();
		 System.out.println("Valor de cadena"+cadena.charAt(1));
		 System.out.println(vecCaracteres);
		 vecCaracteres=cadena.toCharArray();
		 System.out.println(vecCaracteres);
		 
		 Vectores[] objVector=new Vectores[20];
		 System.out.println(vecCaracteres.length);
		 for(int i=0;i<vecCaracteres.length;i++)
		 {
			 System.out.println(vecCaracteres);
		 }
		 
		
	}
}


