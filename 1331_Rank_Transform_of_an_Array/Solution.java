import java.util.Arrays;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];            
        int cont = 0;
        for(int s : arr){
            temp[cont] = s;
            cont++;
        }
        Arrays.sort(temp);
        
        int[] rankArray = new int[arr.length];
        
        if (arr.length == 0) return rankArray;
        
        int[] uniqueSorted = new int[arr.length];
        uniqueSorted[0] = temp[0];
        int uniqueCount = 1;
        
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i - 1]) {
                uniqueSorted[uniqueCount] = temp[i];
                uniqueCount++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            int pos = Arrays.binarySearch(uniqueSorted, 0, uniqueCount, arr[i]);
            rankArray[i] = pos + 1;
        }
        
        return rankArray;
    }
}