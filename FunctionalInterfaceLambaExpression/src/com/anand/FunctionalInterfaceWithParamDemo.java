package com.anand;

public class FunctionalInterfaceWithParamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//lambda expression implementation 	
	CalcOperation operation= (int a , int b) ->
	{
		return a+b;
	};
	 
	System.out.println(operation.operation(5, 5));
	operation.printInfo();
	CalcOperation.typeOfOperation();
	
	//lambda expression implementation 
	CalcOperation substraction=(a , b) ->{
		return a-b;
	};
	System.out.println(substraction.operation(100, 50));
	
	System.out.println(operation);
	System.out.println(substraction);
	
	//lambda expression implementation
	CalcOperation multiplication= (a,b) -> a*b;
	System.out.println(multiplication.operation(8, 12));
	
	}

}
