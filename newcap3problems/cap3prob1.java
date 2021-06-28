package newcap3problems;

import java.util.Scanner;

public class cap3prob1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int len =sc.nextInt();
		int flatArr[] =new int[len];
		for(int i=0;i<len;i++) {
			flatArr[i]=sc.nextInt();
		}
		sc.close();
		
		int i, key, j;
	    for (i = 1; i < len; i++)
	    {
	        key = flatArr[i];
	        j = i - 1;
	 
	        while (j >= 0 && flatArr[j] < key)
	        {
	        	flatArr[j + 1] = flatArr[j];
	            j = j - 1;
	        }
	        flatArr[j + 1] = key;
	        if(i<=2) {
	        	for(int x=0;x<len;x++) {
	    			System.out.print(flatArr[x]+",");
	    		}
	        	System.out.println();
	        }
	    }
		
		
	}

}
