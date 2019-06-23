package AndhraPradesh;

public class StringReverse {

	public static void main(String[] args) 
	
	{
	String str="appala mahesh babu";
	String s[]=str.split(" ");
	String s1=" ";
	String s2=" ";
for(int i=0;i<s.length;i++)
{
	s1=s[i];
	System.out.println(s1);
	
	for(int j=s1.length()-1;j>=0;j--)
	{
		s2=s2+s1.charAt(j);
	}
}System.out.println(s2);
	}

}
