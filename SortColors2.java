class Solution {
    public int[] sortColours(int[] arr) {
        // 0,1,1,2,1,0,0,1,2
        // 0,0,0,1,1,1,1,2,2
        int zero=0;two=arr.length-1,i=0;
        while(i<two){
            if(arr[i]==0){
                arr[i]=arr[zero];
                arr[zero]=0;
                zero++;i++;
            }
            else if(arr[i]==2){
                arr[i]=arr[two];
                arr[two]=2;
                two--;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}