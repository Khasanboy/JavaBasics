package examples;

public class LinearSearch {
	
	public static String linearSearch(int key, int array[]){
		
		String indexes = "";
		
		for(int i = 0; i< array.length; i++){
			if(key == array[i]){
				indexes=indexes +" "+ i;
			}
			
		}
		
		if(indexes == ""){
			indexes = "Not found";
		}
		
		return indexes;
		
	}
	
	public static void main(String args[]){
		
		int array[] = {22,18,14,2,3,2,8,2,2,2,2,65,1};
		
		System.out.println(linearSearch(2, array));
		
	}

}
