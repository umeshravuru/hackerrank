package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fun_poker_puzzle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// while (s.hasNext()) {
		// String dataTem = s.nextLine();
		// String data[] = dataTem.split(" ");
		//
		// int numData[] = new int[10];
		// Map<Integer, Integer> numMapper = new HashMap<Integer, Integer>();
		// for (int i = 0; i < 10; i++) {
		// if (data[i].charAt(0) == 'A') {
		// if (numMapper.get(1) == null) {
		// numMapper.put(1, 1);
		// numMapper.put(14, 1);
		// } else {
		// numMapper.put(1, numMapper.get(1) + 1);
		// numMapper.put(14, numMapper.get(14) + 1);
		// }
		// } else if (data[i].charAt(0) == 'J') {
		// if (numMapper.get(11) == null) {
		// numMapper.put(11, 1);
		// } else {
		// numMapper.put(11, numMapper.get(11) + 1);
		// }
		// } else if (data[i].charAt(0) == 'Q') {
		// if (numMapper.get(12) == null) {
		// numMapper.put(12, 1);
		// } else {
		// numMapper.put(12, numMapper.get(12) + 1);
		// }
		// } else if (data[i].charAt(0) == 'K') {
		// if (numMapper.get(13) == null) {
		// numMapper.put(13, 1);
		// } else {
		// numMapper.put(13, numMapper.get(13) + 1);
		// }
		// } else {
		// int now = Integer
		// .parseInt(String.valueOf(data[i].charAt(0)));
		// if (numMapper.get(now) == null) {
		// numMapper.put(now, 1);
		// } else {
		// numMapper.put(now, numMapper.get(now) + 1);
		// }
		// }
		// }
		//
		// for (int ii = 0; ii <= 10; ii++) {
		// // for royal flush
		// if (ii == 0) {
		//
		// }
		// }
		//
		// }
//		String test = "";
//		int [] test1 = new int [5];
//		test1[0] = 1;
//		test1[2] = 11;
//		test1[3] = 12;
//		test1[4] = 13;
//		test1[1] = 10;
//		System.out.println(isStright(test1));
		
		while (s.hasNext()) {
			String dataTem = s.nextLine();
			String data1[] = dataTem.split(" ");

			int ans = -1;
			String data[] = new String[5];
			for (int i = 0; i < 5; i++) {
				data[i] = data1[i];
			}
			ans = Math.max(ans, hand(data));

			for (int i = 0; i < 5; i++) {
				String temData[] = new String[5];
				for (int j = 0; j < 5; j++) {
					temData[j] = data1[j];
				}
				temData[i] = data1[5];
				 ans = Math.max(ans, hand(temData));
			}
//			System.out.println(ans);
//			System.out.println("222");
			for (int i = 0; i < 4; i++) {
				for (int j = i+1; j < 5; j++) {
					String temData[] = new String[5];
					for (int k = 0; k < 5; k++) {
						temData[k] = data1[k];
					}
					temData[i] = data1[5];
					temData[j] = data1[6];
				//	disp(temData);
					 ans = Math.max(ans, hand(temData));
				}
			}
//			System.out.println(ans);
//			System.out.println("333");
			for (int i = 0; i < 4; i++) {
				for (int j = i+1; j < 5; j++) {
					String temData[] = new String[5];
					for (int k = 0; k < 5; k++) {
						temData[k] = data1[k+5];
					}
					temData[3] = data1[i];
					temData[4] = data1[j];
					 ans = Math.max(ans, hand(temData));
				}
			}
//			System.out.println(ans);
//			System.out.println("444");
			for (int i = 0; i < 5; i++) {
				String temData[] = new String[5];
				for (int j = 0; j < 5; j++) {
					temData[j] = data1[j+5];
				}
				temData[4] = data1[i];
//				disp(temData);
				 ans = Math.max(ans, hand(temData));
//				 System.out.println(ans);
			}
			
//			System.out.println(ans);
//			System.out.println("555");
			String data11[] = new String[5];
			for (int i = 0; i < 5; i++) {
				data11[i] = data1[i+5];
			}
		//	disp(data11);
//			System.out.println(hand(data11));
			ans = Math.max(ans, hand(data11));
			
			
			String [] StrAns = new String[10];
			StrAns[1]= "highest-card";
			StrAns[2]= "one-pair";
			StrAns[3]= "two-pairs";
			
			StrAns[4]= "three-of-a-kind";
			StrAns[5]= "straight";
			StrAns[6]= "flush";
			
			StrAns[7]= "full-house";
			StrAns[8]= "four-of-a-kind";
			StrAns[9]= "straight-flush";
			
			System.out.println("Hand: "+data1[0]+" "+data1[1]+" "+data1[2]+" "+data1[3]+" "+data1[4]+" Deck: "+" "+data1[5]+" "+data1[6]+" "+data1[7]+" "+data1[8]+" "+data1[9]+" Best hand: "+StrAns[ans]);
			

		}

	}

	public static int hand(String[] data) {
//			disp(data);
		int nums[] = new int[5];
		int symb[] = new int[5];
		for (int i = 0; i < 5; i++) {
			if (data[i].charAt(0) == 'A')
				nums[i] = 1;
			else if (data[i].charAt(0) == 'J')
				nums[i] = 11;
			else if (data[i].charAt(0) == 'Q')
				nums[i] = 12;
			else if (data[i].charAt(0) == 'K')
				nums[i] = 13;
			else if (data[i].charAt(0) == 'T')
				nums[i] = 10;
			else {
				nums[i] = Integer.parseInt(String.valueOf(data[i].charAt(0)));
			}

			if (data[i].charAt(1) == 'C')
				symb[i] = 1;
			else if (data[i].charAt(1) == 'D')
				symb[i] = 2;
			else if (data[i].charAt(1) == 'H')
				symb[i] = 3;
			else if (data[i].charAt(1) == 'S')
				symb[i] = 4;

		}

		// stright flush
		if (isSameSymb(symb) && isStright(nums))
			// return "straight-flush";
			return 9;

		// four - of - a - kind
		if (is4ofAKind(nums))
			// return "four-of-a-kind";
			return 8;

		// full - house
		if (isFullHouse(nums))
			// return "full-house";
			return 7;

		// flush
		if (isSameSymb(symb))
			// return "flush";
			return 6;

		// straight
		if (isStright(nums))
			// return "straight";
			return 5;

		// three-of-a-kind
		if (isThreeOfaKind(nums))
			// return "three-of-a-kind";
			return 4;

		// two-pairs
		if (isTwoPairs(nums))
			// return "two-pairs";
			return 3;

		// one-pair
		if (isOnePairs(nums))
			// return "one-pair";
			return 2;

		// highest-card

		return 1;
		// return "highest-card";
	}

	public static boolean isOnePairs(int data[]) {
		Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		for (int i = 0; i < 5; i++) {
			if (mapper.get(data[i]) == null)
				mapper.put(data[i], 1);
			else
				mapper.put(data[i], mapper.get(data[i]) + 1);
		}
		if (mapper.size() != 4)
			return false;
		else {
			int max = -1;
			for (Integer key : mapper.keySet()) {
				int now = mapper.get(key);
				if (max < now)
					max = now;
			}
			if (max == 2)
				return true;
			else
				return false;

		}

	}

	public static boolean isTwoPairs(int data[]) {
		
		Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		for (int i = 0; i < 5; i++) {
			if (mapper.get(data[i]) == null)
				mapper.put(data[i], 1);
			else
				mapper.put(data[i], mapper.get(data[i]) + 1);
		}
		//System.out.println(mapper);
		if (mapper.size() != 3)
			return false;
		else {
			int a = 0;
			int b = 0;
			int c = 0;
			for (Integer key : mapper.keySet()) {
				int now = mapper.get(key);
				if (a == 0)
					a = now;
				else if (b == 0)
					b = now;
				else if (c == 0)
					c = now;
			}
		//	System.out.println(a+" "+b+" "+c);
			if (a == 1 && b == 2 && c == 2)
				return true;
			if (a == 2 && b == 1 && c == 2)
				return true;
			if (a == 2 && b == 2 && c == 1)
				return true;

			return false;

		}

	}

	public static boolean isThreeOfaKind(int data[]) {
		Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		for (int i = 0; i < 5; i++) {
			if (mapper.get(data[i]) == null)
				mapper.put(data[i], 1);
			else
				mapper.put(data[i], mapper.get(data[i]) + 1);
		}
		int max = -1;
		for (Integer key : mapper.keySet()) {
			if (max < mapper.get(key))
				max = mapper.get(key);
		}
		if (max == 3)
			return true;
		else
			return false;

	}

	public static boolean isFullHouse(int data[]) {
		Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		for (int i = 0; i < 5; i++) {
			if (mapper.get(data[i]) == null)
				mapper.put(data[i], 1);
			else
				mapper.put(data[i], mapper.get(data[i]) + 1);
		}
		if (mapper.size() != 2)
			return false;
		else {
			int a = 0;
			int b = 0;
			for (Integer key : mapper.keySet()) {
				if (mapper.get(key) == 2 || mapper.get(key) == 3)
					return true;
			}
			return false;

		}
	}

	public static boolean is4ofAKind(int data[]) {
		Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		for (int i = 0; i < 5; i++) {
			if (mapper.get(data[i]) == null)
				mapper.put(data[i], 1);
			else
				mapper.put(data[i], mapper.get(data[i]) + 1);
		}
		if (mapper.size() != 2)
			return false;
		else {
			for (Integer key : mapper.keySet()) {
				if (mapper.get(key) == 4)
					return true;
			}
			return false;
		}
	}

	public static boolean isSameSymb(int data[]) {
		if (data[0] != data[1])
			return false;
		if (data[0] != data[2])
			return false;
		if (data[0] != data[3])
			return false;
		if (data[0] != data[4])
			return false;
		return true;

	}

	public static boolean isStright(int data[]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (data[j] > data[j + 1]) {
					int tem = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tem;
				}
			}
		}
//		disp1(data);
		if (data[0] != 1) {

			for (int i = 0; i < 4; i++) {
				if (data[i] + 1 != data[i + 1])
					return false;
			}
			return true;
		} else {
			int che1 = 0;
			for (int i = 0; i < 4; i++) {
				if (data[i] + 1 != data[i + 1])
					che1 = 1;
			}

			data[0] = data[1];
			data[1] = data[2];
			data[2] = data[3];
			data[3] = data[4];
			data[4] = 14;
			int che2 = 0;
			for (int i = 0; i < 4; i++) {
				if (data[i] + 1 != data[i + 1])
					che2 = 1;
			}
//				System.out.println(che1 + " "+ che2);
			if (che1 == 1 && che2 == 1)
				return false;
			else
				return true;

		}

	}
	public static void disp(String [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}
	
	public static void disp1(int [] data)
	{
		for(int i =0;i<data.length;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.println("");
	}

}
