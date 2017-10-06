package examples;

public class SelectionSort1 {
	
	public static void selSort(int array[]){
		int i, j, min, temp, minIndex;
		for(i=0; i<array.length; i++){
			min = array[i];
			minIndex=i;
			for(j=i+1; j<array.length; j++){
				if(array[j]<min){
					min = array[j];
					minIndex=j;
					
				}
			}
			
			if(min<array[i]){
				temp = array[i];
				array[i]=array[minIndex];
				array[minIndex]=temp;
			}
		}
	}
	
	public static void selSort1(int array[]){
		int i, j, minVal, minIndex, temp;
		
		for(i=0; i<array.length; i++){
			minIndex = i;
			minVal = array[i];
			
			for(j=i+1; j<array.length; j++){
				if(minVal>array[j]){
					minVal = array[j];
					minIndex = j;
				}
			}
			
			if(array[i]>minVal){
				temp = array[i];
				array[i]=minVal;
				array[minIndex]= temp;
			}
		}
	}
	
	public static void main(String args[]){
		int array[]={5,4,86,5,89,2,34,7,3};
		
		selSort1(array);
		
		for(int i:array){
			System.out.print(i+" ");
		}
	}

}
