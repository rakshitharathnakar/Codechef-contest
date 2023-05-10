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
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    long r=0L,s=0L;
		    for(int i=n-1;i>=0;i--){
		        if(a[i]==1){
		            r+=i+1;
		        }
		        else{
		            s+=i+1;
		        }
		    }
		    if(r>s)
		        System.out.println(r-s);
		    else
		        System.out.println(s-r);
		}
	}
}
