
public class Anagrams {

	public static void printAnagrams(String prefix, String word)
	{
		if(prefix.length() <= 1)
		{
			System.out.println(prefix+word);
		}
		for(int i = 0 ; i < word.length(); i++)
		{
			String cur = word.substring(i,  i+1);
			String before = word.substring(0,i);
			String after = word.substring(i+1);
			
			printAnagrams(prefix+cur, before + after);
		}
	}
	
	public static void main(String[] args)
	{
		printAnagrams("", "east");
	}
}
