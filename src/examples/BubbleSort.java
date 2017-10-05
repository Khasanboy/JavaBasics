package examples;

public class BubbleSort {
	
	public static void bSort(int array[]){
		int n = array.length;
		int temp = 0;
		
		for(int i=0; i<n; i++){
			for(int j=1; j<(n-i); j++){
				
				if(array[j-1]>array[j]){
					temp = array[j-1];
					array[j-1]= array[j];
					array[j]=temp;
				}
				
				for(int k:array){
					System.out.print(k+ " ");
				}
				
				System.out.println();
			}
		}
	}
	
	
	public static void main(String args[]){
		
		int array[] = {1,7,2,56,55,98,3};
		
		for(int i:array){
			System.out.print(i+ " ");
		}
		
		System.out.println("-----------");
		
		bSort(array);
		
		for(int i:array){
			System.out.print(i+ " ");
		}
	}

}
