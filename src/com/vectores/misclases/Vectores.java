package com.vectores.misclases;

public class Vectores {
	
	public int[] llenaUnos(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=1;
		}
		return vector;
	}
	
	public int[] llenadoSerie(int[] vector)
	{
		for(int i=0;i<vector.length;i++)
		{
			vector[i]=i;
		}
		return vector;
	}

}
