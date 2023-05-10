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
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int r=sc.nextInt();
		    int s=sc.nextInt();
		    int u=q+r+s;
		    int v=p+r+s;
		    int x=p+q+s;
		    int y=p+q+r;
		    if(p>u || q>v || r>x || s>y)
		        System.out.println("\nyes");
		    else  
		        System.out.println("\nno");
		}
	}
}
