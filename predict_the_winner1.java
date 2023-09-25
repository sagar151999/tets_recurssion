package recurssion_tes;

public class predict_the_winner1 {
	
	public static int iswinnerof(int nums[],int left,int right)
	{
		{
		if(left==right)
		return nums[left];
		}
		int leftch=nums[left]-iswinnerof(nums,left+1,right);
		int rightch=nums[right]-iswinnerof(nums,left,right-1 );
		return Math.max(leftch, rightch);
	}
	public static void main(String[] args)
	{
		//int num[]= {1,5,233,3};
		int num[]= {1,5,2};
		System.out.println(iswinnerof(num,0,num.length-1)>=0);
	
	}

}
