public class Convert{
	
	public static void main(String[] args) {
		toUpperCase("Sai Nikhil");
	}
	public static void toUpperCase(String str){
    		String s = "";
    		for(int i=0 ; i<str.length();i++){
		if(Character.isAlphabetic(str.charAt(i))&&Character.isLowerCase(str.charAt(i))){
			s += (char)(str.charAt(i)-32);
        	}else{
        		s += (char)str.charAt(i);
        	}
        }
        System.out.println(s);
        }

}
