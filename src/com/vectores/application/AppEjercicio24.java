package com.vectores.application;
import com.vectores.misclases.Vectores;

public class AppEjercicio24 {

	public static void main(String[] args) 
	{
		final int NUM_ELEMENTOS=20;
		final int PARES_IMPARES=2;
		
		
		int[] vector=new int[NUM_ELEMENTOS];
		int[] paresimpares=new int[PARES_IMPARES];
		boolean[] isPrimo=new boolean[NUM_ELEMENTOS];
		int iNumPrimos=0;
		
		Vectores objVec1=new Vectores();
		
		System.out.println("Ejercicio 23. de unos");
		vector=objVec1.llenaUnos(vector);
		imprimirVector(vector);
		
		System.out.println("Ejercicio 24. de uno en uno");
		vector=objVec1.llenadoSerie(vector);
		imprimirVector(vector);
		
		System.out.println("Ejercicio 25. de dos en dos");
		vector=objVec1.llenadoSeriedos(vector);
		imprimirVector(vector);
		
		System.out.println("Ejercicio 26. Alreves");
		vector=objVec1.llenadoSerieReves(vector);
		imprimirVector(vector);
		
		System.out.println("Ejercicio 27. Aleatorio");
		vector=objVec1.llenadoaleatorio(vector);
		imprimirVector(vector);
		
		System.out.println("Ejercicio 28. Contar elementos pares e impares");
		paresimpares=objVec1.llenadoParesImpar(vector);
		imprimirVector(paresimpares);
		System.out.println("La cantidad de pares es "+objVec1.contadorPares(vector));
		System.out.println("La cantidad de pares es "+objVec1.contadorImpares(vector));
		
		System.out.println("Ejercicio 29. Cuenta los numeros primos dentro de un vector.");
		isPrimo=objVec1.isPrimovec(vector);
		iNumPrimos=objVec1.iNumPrimos(isPrimo);
		System.out.println("La cantidad de primos en el vector es: "+objVec1.iNumPrimos(isPrimo));

  
		System.out.println("Ejercicio 30. La suma de los elementos de  un vector.");
		System.out.println("La cantidad de primos en el vector es: "+objVec1.iSumaVec(vector));
		
		System.out.println("Ejercicio 31. Inversion de las posiciones de un vector.");
		imprimirVector(vector);
		vector=objVec1.llenadoInversion(vector);
		imprimirVector(vector);
		
		
	}
	
	 public static void imprimirVector(int[] vectorParam)
	 {
		 for(int i=0;i<vectorParam.length;i++)
			{
				System.out.println(vectorParam[i]);
				
			}
	 }

}
