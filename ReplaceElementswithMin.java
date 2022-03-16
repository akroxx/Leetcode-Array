class Solution {
    public int[] replaceElementswithMin(int[] arr) {
    	int min;
        for(int i=0;i<arr.length;i++){
            min=Integer.MAX_VALUE;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                }
            }
            arr[i]=min;
        }
        return arr;
    }
}