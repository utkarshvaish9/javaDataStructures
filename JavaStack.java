package javaclass;
import java.util.*;
import java.util.Map.Entry;
//check for balance of paranthesis
public class JavaStack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Map<Character,Character> map = new HashMap<>();
		map.put('(',')');
		map.put('{','}');
		map.put('[',']');
		char charArr[] = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(char ch: charArr)
		{
			for(Entry<Character, Character> entry: map.entrySet())
			{
				if(ch==entry.getKey())
					stack.push(ch);
				if(ch==entry.getValue() && stack.peek()==entry.getKey())
					stack.pop();
				
			}
		}
		if(stack.isEmpty())
			System.out.println("True");
		else
			System.out.println("False");
		
		//List<Character> list = new ArrayList<>();
		
		
		
		
	}
}
