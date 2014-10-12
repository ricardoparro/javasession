

1.1

//this is bad
public bool checkIfUniqueChars(string s){

	for(i=0; i < s.length; i++){

		char charToCheck = s[i];

		for(r=i+1; r < s.lenght, r++){

			if(s[r] == charToCheck){
				return false;
			}

		}

	}

	return true;
}

//O(n) time complexity and also 0(n) space complexity

public static boolean isUniqueChars2(String str){

	//Assuming the charset is ASCII

	boolean[] charset = new boolean[256];

	for(int i=0; i < str.length; i++){

		int val = str.charAt(i);
		if(charset[val]) return false
		charset[val] = true;
	}

	return true;

}

//0(n^2)
public static isUniqueChars(String str){

	int checker=0;
	
	for(int i=0; i< str.lenght();++i){

		int val = str.charAt(i) - 'a';

	}

}



