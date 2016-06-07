package hack;

import java.util.LinkedList;
import java.util.Scanner;



class Palindrome{
	
	
	LinkedList<Character> data1 = new LinkedList<Character>();
	LinkedList<Character> data2 = new LinkedList<Character>();
	public void pushCharacter(char a){
		data1.addFirst(a);
		//System.out.println(data1);
	}
	
	public void enqueueCharacter(char a){
		data2.add(a);
		//System.out.println(data2);
	}
	
	public char popCharacter(){
		char a=data1.getFirst();
		data1.removeFirst();
	
		
		return a;
	}
	public char dequeueCharacter(){
		char a=data2.getFirst();
		data2.removeFirst();
		
		
		return a;
	}
	
	
}




public class Day_18_Queues_Stacks {

	
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        // read the string s.
	        String s = sc.nextLine();
	        
	        // create the Palindrome class object p.
	        Palindrome p = new Palindrome();
	        char arr[]=s.toCharArray();//Converting string to a character array
	        // push all the characters of string s to stack.
	        for (char c : arr) {
	            p.pushCharacter(c);
	        }
	        
	        // enqueue all the characters of string s to queue.
	        for (char c : arr) {
	            p.enqueueCharacter(c);
	        }
	        
	        boolean f = true;
	        
	        // pop the top character from stack.
	        // dequeue the first character from queue.
	        // compare both the characters.
	        for (int i = 0; i < s.length(); i++) {
	        	//System.out.println(p);
	            if (p.popCharacter() != p.dequeueCharacter()) {
	                f = false;                
	                break;
	            }
	        }
	        
	        // finally print whether string s is palindrome or not.
	        if (f) {
	            System.out.println("The word, "+s+", is a palindrome.");
	        } else {
	            System.out.println("The word, "+s+", is not a palindrome.");
	        }
	    }
	

}
