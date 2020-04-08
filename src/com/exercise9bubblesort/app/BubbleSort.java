package com.exercise9bubblesort.app;

import java.util.Random;;

public class BubbleSort {

	public static void main(String[] args) {
		// Constants declaration
		final int ELEMENTS_ARRAY =100;
		//Variable declaration
		int temp=0;
		
		//Arrays
		int[]disorderedArray = new int[ELEMENTS_ARRAY];
		int[]orderedArray = new int[ELEMENTS_ARRAY];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		//Create the vector whit the random values
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
		{
			disorderedArray[i] = randomNumbers.nextInt(101);
		}
			for (int j=0;j<ELEMENTS_ARRAY-1;j++)
			{
				if(disorderedArray[j]<disorderedArray[j+1])
				{
					temp=disorderedArray[j+1];
					disorderedArray[j+1]=disorderedArray[j];
					disorderedArray[j]=temp;
				}
			}
		}
		
		//Display the disorded vector
		for(int i=0;i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(disorderedArray[i]+" ");
		}
		

	}

}
