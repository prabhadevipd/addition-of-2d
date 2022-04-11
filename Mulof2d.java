package com.javaarray;

public class Mulof2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},{7,8,9,2}};
		int b[][]= {{9,8,7,6},{3,5,7,1}};
		int c[][]=new int[2][4];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
				
			}
		}
		System.out.println("Multiplication of two matrices");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{

			System.out.println(c[i][j]);
			}
		System.out.println();
		}
		}
		}
	


