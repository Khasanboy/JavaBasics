package examples;

public class InsertionSort {
	
	public static void insertSort(int array[]){
		int n = array.length;
		
		for(int j=1; j<n; j++){
			int key = array[j];
			int i=j-1;
			
			while((i>-1)&&(array[i]>key)){
				array[i+1]=array[i];
				i--;
				
			}
			
			array[i+1]=key;
		}
	}
	
	
	public static void main(String args[]){
		int array[] = {9,78,2,66,89,111,2,56,78,15,46};
		
		for(int i:array){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		insertSort(array);
		
		for(int j :array){
			System.out.print(j+" ");
		}
	}

}
