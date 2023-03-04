package interview;

public class ginterview {

	public static void main(String[] args) {
		
		
		int arr[] = {2,7,3,4,5,2,0,2};
		
		int input = 2;
		int pointer = 0;
		for(int i = 0; i< arr.length;i++)
		{
			if(i==arr.length-1)
			{
				
				break;
				
			}
			
		 if(arr[i]==input)
		 {
		arr[i]=arr[i+1];
		pointer++;
			
		}
		}
		
			for(int i = 0; i< arr.length;i++)
			{
			System.out.println(arr[i]);
				
			}
		 
		
		
		
	}
	
	}

