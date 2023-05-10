import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    float n=sc.nextFloat()/2;
		    float r=sc.nextFloat();
		    if(r>=n)
		       System.out.println("yes");
		    else
		        System.out.println("no");
		}
	}
}
