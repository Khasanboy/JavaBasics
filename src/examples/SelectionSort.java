package examples;

public class SelectionSort {

	public static void selectSort(int array[]){
		for(int i = 0; i<array.length-1; i++){
			int index = i;
			
			for(int j = i+1; j<array.length; j++){
				if(array[j]<array[index]){
					index = j;
				}
			}
			
			int smallestNumber = array[index];
			array[index] = array[i];
			
			array[i] = smallestNumber;
		}
		
	}
	
	public static void main(String args[]){
		int array[]={98,7,12,-9,-6,78,22,10};
		
		for(int i:array){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		selectSort(array);
		
		for(int j:array){
			System.out.print(j+" ");
		}
	}
	
}
