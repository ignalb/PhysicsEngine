package util;

public class Utils {

	public static <T> void debug(T s){
		System.err.println("DEBUG | " + s.toString());
	}
	public static void debug(String format, Object...objects){
		System.err.printf(format, objects);
	}
	
	public static boolean contains(String string, String s){
		char[] chars = s.toCharArray();
		for(char c : chars){
			if(string.contains(c + "")){
				return true;
			}
		}
		return false;
	}
	
}
