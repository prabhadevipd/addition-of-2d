package com.javaarray;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {67,45,23,17,38,9};
int min=a[0];
for (int i=0;i<a.length;i++)
{
	if(a[i]<min)
		min=a[i];

}
System.out.println("Smallest Element is " +  min);
	}

}
