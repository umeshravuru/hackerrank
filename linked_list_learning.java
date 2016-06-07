package hack;

import java.awt.DisplayMode;

public class linked_list_learning
{
	
	
	public String books;
	public int millions_sold;

	public linked_list_learning next;
	
	public linked_list_learning(String a, int b){
		
		this.books=a;
		this.millions_sold=b;
		
	}
	
	public void display(){
		System.out.println(books+" "+ millions_sold);
		
		
	}
	public static void main(String[] args)
	{
		
		//System.out.println(display());
		
		// TODO Auto-generated method stub

	}

}
