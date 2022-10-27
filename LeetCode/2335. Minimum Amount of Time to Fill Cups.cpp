class Solution {
public:
    int fillCups(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        int a = arr[0],b = arr[1],c = arr[2];        
        int sum = a+b+c;
        
        if(a+b>c) 
            return sum/2+sum%2;
        else 
            return c;
    }
};
