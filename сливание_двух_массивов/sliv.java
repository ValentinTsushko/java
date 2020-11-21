public class sliv{
	public static void quickSort(int[] array, int low, int high) {

        if (array.length == 0)
            return;
 
        if (low >= high)
            return;
 

        int middle = low + (high - low) / 2;
        int opora = array[middle];
 
 
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
 
            while (array[j] > opora) {
                j--;
            }
 
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
 
        
        if (low < j)
            quickSort(array, low, j);
 
        if (high > i)
            quickSort(array, i, high);
    }


	public static int[] mergeArrays(int[] a1, int[] a2) {
		int max = a1.length + a2.length;
		int[] a3 = new int [max];
		int id1 = 0;
		int id2 = 0;
		/*
		if(a1.length > a2.length){
			for(int i = 0; i < max; i++){
				
			}
		}
		*/
		/*   */
		for(int i = 0; i < max; i++){
            if (id2 >= a2.length || id1 < a1.length && a1[id1] < a2[id2]) {
                a3[i] = a1[id1];
                id1++;
            } 
			else {
                a3[i] = a2[id2];
                id2++;
            }
		}
		
///////////////////////////////////////////////////////   
        /*int max1 = max / 2 + 1;
		for (int j = 0; j < max1; j++){
			for (int i = 0; i <= max - j - 2; i++){
				if(a3[i] > a3[i + 1]){
					int c = a3[i];
					a3[i] = a3[i + 1];
					a3[i + 1] = c;
				}
			}
		}*/
//////////////////////////////////////////////////////
		//quickSort(a3, 0, (max - 1));    
		return a3;
	}
	public static void main(String[] args){
		java.util.Scanner in = new java.util.Scanner(System.in);
		int[] a = new int[]{0, 2, 2};
		int[] b =  new int[]{1, 3, 2, 7};
		int[] c = mergeArrays(a, b);
		int max = a.length + b.length;
		for(int i = 0; i < max; i++){
			System.out.print("   ");
			System.out.print(c[i]);
		}
	}
}
