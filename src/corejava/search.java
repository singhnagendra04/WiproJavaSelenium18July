package corejava;

public class search {
	
	public void display(int arr[],int n)
	{
		int found =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) {
				found =1;
				break;
			}
		} 
		
		if(found == 1) {
			System.out.println("Number is found");
		}
		else 
			System.out.println("Number not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,20,30,40,50};
		search s =  new search();
		s.display(arr,4);

	}

}
