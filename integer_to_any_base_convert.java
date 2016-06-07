package hack;

public class integer_to_any_base_convert
{

	public static void main(String[] args)
	{
		// System.out.println(3|5);

		// System.out.println(Long.toBinaryString((long) (Math.pow(2,
		// 64))-(long)1));
		// System.out.println(Long.toBinaryString((long) (Math.pow(2,
		// 63))-(long)1));
		// System.out.println(Long.toBinaryString((long) (Math.pow(2,
		// 62))-(long)1));
		// System.out.println(Long.toBinaryString((long) (Math.pow(2,
		// 61))-(long)1));
		// System.out.println(Long.toBinaryString((long) (Math.pow(2,
		// 60))-(long)1));

		// System.out.println(Integer.toBinaryString(454));
		// System.out.println(Integer.parseInt("111000110", 6));
		System.out.println(conv(8888, 5));
	}

	public static String conv(long data, int base)
	{

		String ans = "";
		int pow = 0;
		for (int i = 0; i < 1000; i++)
		{
			if (data >= Math.pow(base, i) && data < Math.pow(base, i + 1))
			{
				pow = i;
				break;
			}
		}
		while (pow >= 0)
		{
			if (data >= Math.pow(base, pow))

			{
				ans = ans + String.valueOf((int) (data / Math.pow(base, pow)));;

				data = (long) (data - (int) (data / Math.pow(base, pow))
						* Math.pow(base, pow));
			} else
				ans = ans + "0";

			pow--;

		}
		return ans;
	}

}
