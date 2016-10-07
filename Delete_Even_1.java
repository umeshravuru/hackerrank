/**
 *  author - Umesh Reddy
 *	Contact me @ urgd4@mst.edu
 */
package hack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Delete_Even_1
{

	public static class LinkedListNode
	{
		int val;
		LinkedListNode next;

		LinkedListNode(int node_value)
		{
			val = node_value;
			next = null;
		}
	};

	public static LinkedListNode _insert_node_into_singlylinkedlist(
			LinkedListNode head, LinkedListNode tail, int val)
	{
		if (head == null)
		{
			head = new LinkedListNode(val);
			tail = head;
		} else
		{
			tail.next = new LinkedListNode(val);
			tail = tail.next;
		}
		return tail;
	}
	public static LinkedListNode ans;
	public static int che;

	static LinkedListNode deleteEven(LinkedListNode list)
			throws InterruptedException
	{
		if(list.val % 2 != 0)
		{
			_insert_node_into_singlylinkedlist(list, list.next, list.val);
		}
		
		
		return list.next;
		
		
	}

	public static void main(String[] args)
			throws IOException, InterruptedException
	{
		Scanner in = new Scanner(System.in);
		// final String fileName = System.getenv("OUTPUT_PATH");
		// BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		LinkedListNode res;

		int _list_size = 0;
		_list_size = Integer.parseInt(in.nextLine());
		int _list_i;
		int _list_item;
		LinkedListNode _list = null;
		LinkedListNode _list_tail = null;
		for (_list_i = 0; _list_i < _list_size; _list_i++)
		{
			_list_item = Integer.parseInt(in.nextLine().trim());
			if (_list_i == 0)
			{
				_list = _insert_node_into_singlylinkedlist(_list, _list_tail,
						_list_item);
				_list_tail = _list;
			} else
			{
				_list_tail = _insert_node_into_singlylinkedlist(_list,
						_list_tail, _list_item);
			}
		}

		res = deleteEven(_list);
		while (res != null)
		{
			System.out.println(res.val);
			// bw.write(String.valueOf(res.val));
			// bw.newLine();
			res = res.next;
		}

		// bw.close();
	}
}