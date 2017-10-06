package examples;

import java.util.Arrays;

public class BubbleSortExample {
	
	public static void bubSort(int array[]){
		for(int i=array.length-1; i>1; i--){
			for(int j=0; j<i; j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public static void binarySearch(int key, int array[]){
		int lowIndex = 0;
		int highIndex = array.length-1;
		
		while(lowIndex <= highIndex){
			
			int middleIndex = (lowIndex + highIndex)/2;
			
			if(array[middleIndex]<key){
				lowIndex = middleIndex;
			}
			else if(array[middleIndex]>key){
				highIndex = middleIndex;
			}
			else{
				System.out.println("\n Found a match for "+ key+" at "+ middleIndex);
				
				lowIndex = highIndex+1;
				break;
			}
		}
		
	}
	
	public static void main(String args[]){
		int array[]={4,5,6,78,95,24,1,24,3,6,4,55,87,65,0,12,14,3};
		
		for(int i: array){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		bubSort(array);
		
		for(int j: array){
			System.out.print(j+" ");
		}
		
		System.out.println("\n----------");
		
		//Arrays.sort(array);
		
		binarySearch(14, array);
	}

}
