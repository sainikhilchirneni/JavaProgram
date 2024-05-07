public class Convert{
	
	public static void main(String[] args) {
		ConvertToUpperCase("Sai Nikhil");
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
        System.out.println(result);
        }

}
