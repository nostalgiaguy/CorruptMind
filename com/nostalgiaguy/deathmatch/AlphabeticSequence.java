//http://stackoverflow.com/questions/8710719/generating-an-alphabetic-sequence-in-java/20954353#20954353
//http://www.javacodegeeks.com/2015/09/how-to-use-java-8-functional-programming-to-generate-an-alphabetic-sequence-2.html

//Sequence :  A B C D E .......AA AB AC......ZX ZY ZZ

package com.nostalgiaguy.deathmatch;

import static java.lang.Math.*;


public class AlphabeticSequence {
	
	private static String getString(int n) {
	    char[] buf = new char[(int) floor(log(25 * (n + 1)) / log(26))];
	    for (int i = buf.length - 1; i >= 0; i--) {
	        n--;
	        buf[i] = (char) ('A' + n % 26);
	        n /= 26;
	    }
	    return new String(buf);
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=702;i++){
		System.out.print(getString(i)+" ");
		if(i%10==0)
			System.out.println();
		}
	}
}
