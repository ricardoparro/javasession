import java.util.Arrays;

public class Anagram{


    public static void main(String[] args){
	
	String original = "satin";
	String anagram = "stain";
	
	
	boolean result = isAnagram(original, anagram);
	System.out.println(result);

    }

    public static boolean isAnagram(String original, String anagram){

       
	String sortedOriginal = sort(original);

	String sortedAnag = sort(anagram);
	
	System.out.println(sortedOriginal);
	System.out.println(sortedAnag);
	
	return sortedOriginal.equals(sortedAnag);

    }

    public static String sort(String stringToSort){
	
	char[] charArray = stringToSort.toCharArray();

	Arrays.sort(charArray);
	//System.out.println(charArray);
	return new String(charArray);
    }



}