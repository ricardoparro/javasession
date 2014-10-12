public class DuplicateCharacters{

    public static void main(String[] args){


	char[] target = {'a','a','b','c','a','a','a','v','b'};
	char[] target1 = {'a', 'b', 'c'};
	char[] target2 = {};
	char[] target3 = {'a','a','a','a','a'};
	char[] target4 = {'a', 'a', 'a', 'b', 'b', 'b', 'f','f'};
	char[] target5 = null;

	target = RemoveDuplicateCharacters(target);
	System.out.println(target);

	target1 = RemoveDuplicateCharacters(target1);
	System.out.println(target1);
	
	target2 = RemoveDuplicateCharacters(target2);
	System.out.println(target2);

	target3 = RemoveDuplicateCharacters(target3);
	System.out.println(target3);

	target4 = RemoveDuplicateCharacters(target4);
	System.out.println(target4);

	target5 = RemoveDuplicateCharacters(target5);
	if(target5 != null){
	    System.out.println(target5);
	}
    }

    public static char[] RemoveDuplicateCharacters(char[] target){
	
	
	if(target == null) return target;
	int head = 0;
	int tail = target.length -1;

	while (head < tail){
	    
	    char temp = target[head];
	    
	    for(int i=head+1; i < target.length; i++){
		
		if(target[i] == temp){
		     target[i] = '\0'; 
		}
	    }
	    
	    head++;

	}
	return target;
	
    }


  



}