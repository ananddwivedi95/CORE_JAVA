package io.collection;
@FunctionalInterface
interface Lambda
{  
     abstract void sum(int a,int b);
}
public class LambdaExpp  {
public static void main(String[] args)
{  
	Lambda LMD=(a,b) -> 
	{
		 int res=a+b;
		System.out.println(res);
	};

	LMD.sum(10,20);

	
}


}
