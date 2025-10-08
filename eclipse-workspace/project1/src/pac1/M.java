package pac1;

public class M {
	
	public static void main(String[] args) {
		
//			
//		
//				
//		String str="parg";
//		
//	String[] arr=	str.split(" ");
//	
//	for(String s:arr)
//	{
//		System.out.println(s);
//	}
//	
//	
		


			
		
		
	int[] arr= {9, 8, 3,12, 1};
	int temp;
	
	for(int i=0; i<=arr.length-1;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			
			if(arr[j]>arr[j+1])
			{
				
				
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			
			}
		}
	}
	
	
	for(int k:arr)
	{
		System.out.println(k);
	}
	
	
	
	
	
	
		
	
	
	
	
	}
	
	
	}
	
	
