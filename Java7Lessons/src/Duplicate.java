

import java.util.HashSet;
import java.util.Set;

public class Duplicate  {
	public static String removeDuplicate(String s)
	{
	    StringBuilder sb = new StringBuilder();
	    Set<Character> seen = new HashSet<Character>();
	
	    for(int i = 0; i < s.length(); ++i) {
	        char c = s.charAt(i);
	        if(!seen.contains(c)) {
	            seen.add(c);
	            sb.append(c);
	        }
	    }
	    return sb.toString();
	}
	
	
	public static void main (String[] args)
	{
		String result=removeDuplicate("Hello");
		System.out.println(result);
		
	}
	
	
}

