package com.javaarray;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[6];
		a[0]=84;
a[1]=76;
a[2]=34;
a[3]=16;
a[4]=59;
a[5]=90;
int max=a[0];
for(int i:a)
{
	if(i>max)
		max=i;
}
System.out.println("Maximum element is  "+ max);
	}

}
