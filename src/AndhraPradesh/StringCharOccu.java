package AndhraPradesh;

public class StringCharOccu {

	public static void main(String[] args) 
	{
		String str="maheshbabu";
		int result=	str.length()-str.replaceAll("m", "").length();
		System.out.println(result);

	}

}
