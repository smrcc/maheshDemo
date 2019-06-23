package AndhraPradesh;

public class StringoccuFirst {

	public static void main(String[] args) 
	{
		String s="appala mahesh babu";
	String str[]	=s.split(" ");
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i].charAt(0));
		
		if(!str[i].isEmpty())
		{
			System.out.println(str[i].charAt(1));
		}
	}
		
		

	}

}
