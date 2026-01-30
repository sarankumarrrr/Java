class ArrayDemo
{
	public static void main(String args[])
	{
		int num[]={2,6,4};
		System.out.println(num[2]);
		
		//For loop used to print all the values from the array of elements
		for(int n : num)
			System.out.println(n);


		int nums[][]=new int[3][3];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				nums[i][j]=(int)(Math.random()*10);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}