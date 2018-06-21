package com.vectores.misclases;

import java.util.Random;

public class Vectores {
	//Ejercicio 23
	public int[] llenaUnos(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=1;
		}
		return vector;
	}
	
	//Ejercicio 24
	public int[] llenadoSerie(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=i+1;
		}
		return vector;
	}
	//Ejercicio 25
	public int[] llenadoSeriedos(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=2*(i+1);
		}
		return vector;
	}
	
	//Ejercicio 26 
	public int[] llenadoSerieReves(int[] vector)
	{
		for(int i=vector.length-1 ;i>=0;i--)
		{
			vector[vector.length-1-i]=i;
		}
		return vector;
	}
	
	//Ejercicio 27
	public int[] llenadoaleatorio(int[] vector)
	{
		Random rnd=new Random(System.nanoTime());
		//int BOUND=100;
		
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=rnd.nextInt(100);  //Agrega numero aleatorios del 1-100 
			//vector[i]=(int)(Math.random()*BOUND)+1; 
		}
		return vector;
	}
	
	//Ejercicio 28 
	
	public int[] llenadoParesImpar(int[] vector)
	{
		int[] paresImpares=new int[2];
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				paresImpares[0]+=1;
			}
			else
			{
				paresImpares[1]+=1;
			}
		}
		return paresImpares;
	}
	//Contados de elementos pares en un vedctor
	public int contadorPares(int[] vector)
	{
		int pares=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				pares+=1;
			}
		}
		return pares;
	}
	//Contador de elementos impraes en un vector
	public int contadorImpares(int[] vector)
	{
		int impares=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2!=0)
			{
				impares+=1;
			}
		}
		return impares;
	}
	
	//Metodo que reotrna un vector con elementos pares de un vector
	
	public int[] vecPares(int[] vector)
	{		
		
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				Pares[i]=vector[i];
			}
		}
		return Pares; 
	}
}
