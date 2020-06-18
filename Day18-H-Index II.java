class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;  
        int start = 0;  
        int end = n-1;  
        int middle;  
        while (start <= end){  
            middle = (end+start)/2;  
            if (citations[middle] == n-middle) 
                return citations[middle];  
            else if(citations[middle] < n-middle) 
                start = middle + 1;  
            else 
                end = middle - 1;  
        }  
        return n - end - 1;  
    }
}
