package src;

import java.util.Random;

public class BitPattern
{
	public static void main(String[] args) 
	{	
		Random r = new Random();
		
		int toss_1 = -1;
		
		int[] row = new int[5];
		
		int count_H = 0;
		int count_HH = 0;
		int count_HHH = 0;
		int count_HHHH = 0;
		int count_HHHHH = 0;
		
		int times = 20;
		
		for (int i = 0; i < times; i++)
		{
			row = new int[5];
			
			for (int j = 0; j < 5; j++)
			{
				row[j] = r.nextInt(2);
			}
			
			if(row[0] == 1)
			{
				count_H++;
				
				if(row[1] == 1)
				{
					count_HH++;
					
					if(row[2] == 1)
					{
						count_HHH++;
						
						if(row[3] == 1)
						{
							count_HHHH++;
							
							if(row[4] == 1)
							{
								count_HHHHH++;
							}
						}
					}
				}
			}
			
			for (int j = 4; j >= 0; j--)
			{
				if(row[j] == 1)
				{
					System.out.print("H;");
				}
				else
				{
					System.out.print("T;");
				}
			}		
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("count_H (1/2) = ("+(float)times/2+"): "+count_H);
		System.out.println("count_HH (1/4) = ("+(float)times/4+"): "+count_HH);
		System.out.println("count_HHH (1/8) = ("+(float)times/8+"): "+count_HHH);
		System.out.println("count_HHHH (1/16) = ("+(float)times/16+"): "+count_HHHH);
		System.out.println("count_HHHHH (1/32) = ("+(float)times/32+"): "+count_HHHHH);
	}
}
