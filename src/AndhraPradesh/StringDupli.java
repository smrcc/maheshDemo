package AndhraPradesh;

import java.util.HashMap;
import java.util.Map;

public class StringDupli {

	public static void main(String[] args) 
	{
		String str="maheshbabu";
		char[] c=str.toCharArray();
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++)
		{
			if(!m.containsKey(c[i]))
			{
				m.put(c[i], 1);
			}else
			{
				m.put(c[i], m.get(c[i])+1);
			}
		}for(Character c1:m.keySet())
		{
			if(m.get(c1)>1)
			{
				System.out.println(c1+" "+m.get(c1));
			}
		}
		

	}

}
