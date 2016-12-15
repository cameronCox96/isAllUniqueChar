package main;

/**
* 
*
* @author  Cameron Cox
* @version 1.0
* @since   2016-12-15 
*/
public class Main {
	
/**
 * 
 * 	
 * @param args Unused
 * @return nothing
 */
	public static void main(String args[]) {
		String test1 = null;
		String test2 = new String("asdeftuhno"); 
		String test3 = new String("asdeftuhho");
		String test4 = new String("hasdeftuho");
		String test5 = new String("aaaaaaaaaa"); 
		
		System.out.println(isAllUniqueChar(test1));
		System.out.println(isAllUniqueChar(test2));
		System.out.println(isAllUniqueChar(test3));
		System.out.println(isAllUniqueChar(test4));
		System.out.println(isAllUniqueChar(test5));
	}

	
	static boolean isAllUniqueChar(String input)
	{

		if(input == null) {
			return false;
		}
		boolean[] allChars = new boolean [256];

		for(int i = 0 ; i < input.length(); i++){
			char c = input.charAt(i);
			if(allChars[c] == false) {
				allChars[c] = true;
			}
			else {
				return false;
			}
		}
		return true;
	}
}