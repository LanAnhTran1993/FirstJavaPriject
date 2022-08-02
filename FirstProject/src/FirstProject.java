

public class FirstProject {//class


	public static void main(String[] args) { 
		int[][] data = {
				{4, 6, 1, 2},
				{2, 3, 4, 6},
				{1, 2, 3, 4}
		};
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				System.out.println(data[i][j]);
			}
			System.out.println();
		}
	}
}
