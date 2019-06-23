package AndhraPradesh;

import java.util.Arrays;
import java.util.Collections;

public class StringAnagrams {

	public static void main(String[] args) 
	{
		String s1="appala";
		String s2="ppaala";
		char [] c=s1.toLowerCase().toCharArray();
		char c1[]=s2.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		if(Arrays.equals(c, c1))
		{
			System.out.println("anagrams");
		}
		else
		{
			System.out.println("not anagrams");
		}
	}

}
