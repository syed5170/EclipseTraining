import java.util.Scanner;

public class ArrMat {
	
	
	public static void main(String[] args) {
   
		int a[][]={{1,2},{3,4}};    
		int b[][]={{5,6},{7,8}};    	
		int c[][]=new int[2][2]; 
			    			  
		for(int i=0;i<2;i++)	
		{    
			for(int j=0;j<2;j++)	
			{    
				c[i][j]=0;      
				for(int k=0;k<2;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				}
				System.out.print(c[i][j]+" ");  
			} 
			System.out.println();
		}    
	}
}  


