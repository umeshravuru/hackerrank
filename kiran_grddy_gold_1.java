package hack;

public class kiran_grddy_gold_1
{

	public static void main(String[] args)
	{

		int input[] =
		{55,1739, 72, 212, 55, 511, 1239, 99};

		int weight[] =
		{2, 5, 14, 17, 19, 13, 1, 3, 5, 11, 19};
		int gold[] =
		{57, 191, 417, 231, 741, 139, 28, 117, 13, 9, 18};

		int max =0;
			
		for (int i1 = 0; i1 <= input[0] / 2; i1++)
		{
			System.err.println(i1);
			for (int i2 = 0; i2 <= input[0] / 5; i2++)
			{
				for (int i3 = 0; i3 <= input[0] / 14; i3++)
				{
					for (int i4 = 0; i4 <= input[0] / 17; i4++)
					{
						for (int i5 = 0; i5 <= input[0] / 19; i5++)
						{
							for (int i6 = 0; i6 <= input[0] / 13; i6++)
							{
								for (int i7 = 0; i7 <= input[0] / 1; i7++)
								{
									for (int i8 = 0; i8 <= input[0] / 3; i8++)
									{
										for (int i9 = 0; i9 <= input[0]
												/ 5; i9++)
										{
											for (int i10 = 0; i10 <= input[0]
													/ 11; i10++)
											{
												for (int i11 = 0; i11 <= input[0]
														/ 19; i11++)
												{
														if(i1*2+i2*5+i3*14+i4*17+i5*19+i6*13+i7*1+i8*3+i8*5+i10*11+i11*19 == input[0])
														{
															if(i1*57+i2*191+i3*417+i4*231+i5*741+i6*139+i7*28+i8*117+i8*13+i10*9+i11*18 >max)
															{
																max = i1*57+i2*191+i3*417+i4*231+i5*741+i6*139+i7*28+i8*117+i8*13+i10*9+i11*18;
															}
														}
												}
											}
										}
									}
								}
							}

						}
					}
				}
			}
		}

		System.err.println(max);
		
		
	}

}
