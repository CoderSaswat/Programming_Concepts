package com.Practice_07_Methods;

public class _03_SumOfNNumbersRecursion {
	public static int sum(int x)
	{	if(x==1)
		return 1;
	else
		return x+sum(x-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));
	}

}
