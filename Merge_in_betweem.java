package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Merge_in_betweem {
	public static class LinkedListNode {
		int val;
		LinkedListNode next;

		LinkedListNode(int node_value) {
			val = node_value;
			next = null;
		}
	};

	public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
		if (head == null) {
			head = new LinkedListNode(val);
			tail = head;
		} else {
			tail.next = new LinkedListNode(val);
			tail = tail.next;
		}
		return tail;
	}

	static LinkedListNode mergeInBetween(LinkedListNode list1, LinkedListNode list2, int a, int b) {
		
		LinkedListNode ans = null;
		if(a==1)
			ans = list2;
		else
			ans = list1;
		for (int i = 1; i < a; i++) {
			ans.next = list1;
			list1 = list1.next;
		}
		while (true) {
			ans.next = list2;
			if (list2.next == null)
				break;
			list2 = list2.next;
		}
		for (int i = a; i < b; i++) {
			list1 = list1.next;
		}
		while (true) {
			ans.next = list1;
			if (list1.next == null)
				break;
			list1 = list1.next;
		}

		return ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		LinkedListNode res;

		int _list1_size = 0;
		_list1_size = Integer.parseInt(in.nextLine());
		int _list1_i;
		int _list1_item;
		LinkedListNode _list1 = null;
		LinkedListNode _list1_tail = null;
		for (_list1_i = 0; _list1_i < _list1_size; _list1_i++) {
			_list1_item = Integer.parseInt(in.nextLine().trim());
			if (_list1_i == 0) {
				_list1 = _insert_node_into_singlylinkedlist(_list1, _list1_tail, _list1_item);
				_list1_tail = _list1;
			} else {
				_list1_tail = _insert_node_into_singlylinkedlist(_list1, _list1_tail, _list1_item);
			}
		}

		int _list2_size = 0;
		_list2_size = Integer.parseInt(in.nextLine());
		int _list2_i;
		int _list2_item;
		LinkedListNode _list2 = null;
		LinkedListNode _list2_tail = null;
		for (_list2_i = 0; _list2_i < _list2_size; _list2_i++) {
			_list2_item = Integer.parseInt(in.nextLine().trim());
			if (_list2_i == 0) {
				_list2 = _insert_node_into_singlylinkedlist(_list2, _list2_tail, _list2_item);
				_list2_tail = _list2;
			} else {
				_list2_tail = _insert_node_into_singlylinkedlist(_list2, _list2_tail, _list2_item);
			}
		}

		int _a;
		_a = Integer.parseInt(in.nextLine().trim());

		int _b;
		_b = Integer.parseInt(in.nextLine().trim());

		res = mergeInBetween(_list1, _list2, _a, _b);
		while (res != null) {
			bw.write(String.valueOf(res.val));
			bw.newLine();
			res = res.next;
		}

		bw.close();
	}
}