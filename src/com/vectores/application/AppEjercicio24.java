package com.vectores.application;
import com.vectores.misclases.Vectores;

public class AppEjercicio24 {

	public static void main(String[] args) {
		int[] vector=new int[20];
		Vectores objVec1=new Vectores();
		
		vector=objVec1.llenadoSerie(vector);
		
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
