package src;

import java.util.ArrayList;
import java.util.Random;

public class Experiment 
{
	public static void main(String[] args)
	{
		int[] random_experiment_output = new int[1000];
		
		for (int i = 0; i < random_experiment_output.length; i++)
		{
			Random r = new Random();
			
			int toss_1 = r.nextInt(2);
			int toss_2 = r.nextInt(2);
			int toss_3 = r.nextInt(2);
			
			int counter = 1;
			
			while( !(toss_1 == 0 && toss_2 == 0 && toss_3 == 0) )
			//while( !(toss_1 == 0 && toss_2 == 0) )
			{
				toss_1 = r.nextInt(2);
				toss_2 = r.nextInt(2);
				toss_3 = r.nextInt(2);
				
				counter++;
			}
			
			random_experiment_output[i] = counter;
		}
		
		ArrayList<Integer> already_counted = new ArrayList<Integer>(); 
		
		for (int i = 0; i < random_experiment_output.length; i++)
		{
			if(!already_counted.contains(random_experiment_output[i]))
			{
				int counter = 0;
				
				for (int j = 0; j < random_experiment_output.length; j++) 
				{
					if(random_experiment_output[j] == random_experiment_output[i])
					{
						counter++;
					}
				}
				
				System.out.println(random_experiment_output[i] + ";"+ counter);
				
				already_counted.add(random_experiment_output[i]);
			}			
		}
	}
}