

public class Main {
	public static int linearSearch(int[] arr , int key  , int n)
	{
		int count = 0;
		for(int i = 0 ; i  < arr.length ; i ++ )
		{
			if(arr[i] == key)
				count++;
			if(arr[i]==key && n == count)
			{
				
				return i;
			}
			
		}
		return -1 ;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,4,1,4,2,5};
		System.out.println(linearSearch(arr, 1, 4));
	}
}
