package examples;

public class InsertionSort1 {
	
	public static void inSort(int array[]){
		int i, j, key, temp;
		
		for(i=1; i<array.length; i++){
			key = array[i];
			j=i-1;
			
			while(j>=0 && key<array[j]){
				temp = array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
				j--;
			}
		}
		
	}
	
	public static void selSort(int array[]){
		int i, j, key, temp;
		
		for(i=1; i<array.length; i++){
			key = array[i];
			j=i-1;
			while(j>0 && key<array[j]){
				temp = array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				
				j--;
			}
		}
	}
	
	public static void main(String args[]){
		int array[] = {2,25,84,1,4,5,78,58,6};
		//inSort(array);
		selSort(array);
		for(int i:array){
			System.out.print(i+" ");
		}
	}

}
