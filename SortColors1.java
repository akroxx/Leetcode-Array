class Solution {
    public int[] sortColours(int[] arr) {
        // 0,1,1,2,1,0,0,1,2
        // 0,0,0,1,1,1,1,2,2
        int first=0,one,two,zero;
        for(int i =1;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(i=0;i<zero;i++){
            arr[i]=0;
        }
        for(i=zero;i<zero+one;i++){
            arr[i]=1;
        }
        for(i=zero+one;i<arr.length;i++)
            arr[i]=2;

        return arr;
    }
}