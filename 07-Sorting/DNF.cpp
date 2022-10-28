#include<bits/stdc++.h>
using namespace std;

void DNFsort(vector<int>& nums) {
    int lo = 0; 
    int hi = nums.size() - 1; 
    int mid = 0; 

    while (mid <= hi) { 
        switch (nums[mid]) { 
        // If the element is 0,1,2 . 
        case 0: 
            swap(nums[lo++], nums[mid++]); 
            break; 
        case 1: 
            mid++; 
            break; 
        case 2: 
            swap(nums[mid], nums[hi--]); 
            break; 
        }
    }
}

void print(vector<int> arr)
{
    for(auto it : arr)
        cout<<it<<" ";;
}

int main ()
{
    vector<int> arr = {1,0,1,0,1,0};
    DNFsort(arr);
    print(arr);
}
