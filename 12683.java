// https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=602&page=show_problem&problem=4421

import java.io.*;
import java.util.*;

public class uva {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()){
			long a = Integer.parseInt(input.nextLine());
			if (a == -1){
				break;
			}
			else				
				System.out.println(evenZero(a));
		}	
	}
	
	public static int evenZero(long  n){
		long count = 0;
		
		for (long i=0; i<=n; i++){
			if (trailZero(i)%2 ==0){
				count += 1;
			}
		}		
		return (int) count;
	}
	
	public static int trailZero(long n){
		long count = 0;
		
		for (long i = 5; n/i >= 1; i=i*5){
			count = count + n/i;
		}		
		return (int) count;
	}
	
}
