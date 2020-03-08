package qsp;

import java.util.Scanner;

public class P22 {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter value");
        for(int i=0;i<a.length;i++)
        {  
        	a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++)
        { int fact=1;
        	int j=1;
        	int temp=a[i];
        	while(j<=temp)
        	{
        		fact=fact*j;
        		j++;
        		
        	}
        	 System.out.println(fact); 

        }
       
	}
	
}
