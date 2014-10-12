public class ReverseCstyleString{
    
    public static void main(String[] args){
	
	char[] test = {'1','2','3','3','1','5','\0'};

	char[] reversedCstring = reverseString(test);
	
    System.out.println(reversedCstring);
    }

    public static char[] reverseString(char[] target){
	
	int head = 0;
	int tail = target.length -2;
	
	while(head < tail){
	    
	    char temp = target[head];
	    target[head] = target[tail];
	    target[tail] = temp;
	    head++;
	    tail--;
	}
	
	return target;
    }

}