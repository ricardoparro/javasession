public class ExerciseOne{

    public static void main(String[] args){
	
	boolean unique = isUniqueChars("abcdd");
	System.out.println("the result is: " + unique);
    }

    public static boolean isUniqueChars(String str){
	
	int checker=0;
	for (int i=0; i < str.length(); ++i){
	   
	    System.out.println("======================================================");
	    int val = str.charAt(i) - 'a';
	    System.out.println("char at string index: " + str.charAt(i));
	    System.out.println("position of the char within the alphabet array: " + val );
	    System.out.println("value of left shift 1 << val: " + (1 << val));
	    System.out.println("value of left shift 1 << val in binary: " + (Integer.toString((1 << val), 2)));
	    System.out.println("value of checker before set: " + checker);
	    

	    if((checker & (1 << val))>0) return false;
	    checker |= (1 << val);
	    System.out.println("value of checker after set: " + checker);
	    System.out.println("value of checker after set in binary: " + Integer.toString(checker, 2));
	}
	return true;
    }


}