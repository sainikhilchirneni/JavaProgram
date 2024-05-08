public class Convert{
	
	public static void main(String[] args) {
		ConvertToUpperCase("Sai Nikhil");

		//postive test cases
		System.out.println(tc1());
        	System.out.println(tc2());
        	System.out.println(tc3());
        	System.out.println(tc4());
        	System.out.println(tc5());
        	System.out.println(tc6());
        	System.out.println(tc7());

		//Negative test cases
		System.out.println(tc8());
	}
	public static void ConvertToUpperCase(String str){
    		String result = "";
    		for(int i=0 ; i<str.length();i++){
		if(Character.isAlphabetic(str.charAt(i)) && Character.isLowerCase(str.charAt(i))){
			result += (char)(str.charAt(i)-32);
        	}else{
        		result += (char)str.charAt(i);
        	}
        }
        return result;
        }
	public static boolean tc1() {
        String input = "";
        String expected = "";
        String actual = toUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean tc2() {
        String input = "a";
        String expected = "A";
        String actual = toUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean tc3() {
        String input = "sai nikhil";
        String expected = "SAI NIKHIL";
        String actual = toUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean tc4() {
        String input = "sAi nIkHiL";
        String expected = "SAI NIKHIL";
        String actual = toUpperCase(input);
        return actual.equals(expected);
    }
    public static boolean tc5() {
        String input = "123";
        String expected = "123";
        String actual = toUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean tc6() {
        String input = "123$%&*";
        String expected = "123$%&*";
        String actual = toUpperCase(input);
        return actual.equals(expected);
    }
	
    public static boolean tc7() {
        String input = "   ";
        String expected = "   ";
        String actual = toUpperCase(input);
        return actual.equals(expected);
    }

    public static boolean tc8() {
        String input = null;
        String expected = null;
        String actual = toUpperCase(input);
        return actual.equals(expected);
    }

}
