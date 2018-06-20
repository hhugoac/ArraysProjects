package com.vectores.application;

public class AppEjercicio25 {

	public static void main(String[] args) {
		int[] vector=new int[100];
		
		//inicializacion
		for(int i=vector.length-1;i>=0;i--)
		{
			vector[i]=i+1;
		}
		for(int i=0;i<vector.length;i++)
		{
			System.out.println("Vector["+i+"]:"+vector[i]);
			
		}
	}

}
