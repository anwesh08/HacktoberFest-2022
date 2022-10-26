// Given an array nums of integers, return how many of them contain an even number of digits.

// Example 1:

// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.



// answer:


// Approach 1- This approach involves the following steps:

// Step 1- Maintain a counter (let say c=0)

// Step 2- Iterate through the list and typecast each numbers (here elements of the list) into string and store the string into a variable.

// Step 3- Check if length of string is even i.e. if it is divisible by 2.

// Step 4- If step 2 holds True increase the counter value by 1.

// Step 5- Return counter c.

// Python Solution using the Approach 1-

class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        c=0
        for i in nums:
            j=str(i)
            x=len(j)
            if x%2==0:
                c=c+1
        return c
// Approach 2- This approach involves the following steps:

// Step 1- Maintain a counter (let say c=0)

// Step 2- Iterate through the list and store each numbers into a variable (say D)

// Step 3- Loop while D>0

// Step 4- Divide the number by 10 again and again to get the number of digits.

// Step 5- Count number of digits and store digit count in a variable (say digitcount)

// Step 6- Check if digitcount is even

// Step 7- If step 6 holds True increase the counter c value by 1.

// Step 8- Return c

// Python Solution using the Approach 2-

def findNumbers(nums):
    c=0
    for i in nums: #iterating through list
        D=i
        digitcount=0
        while(D>0):
            n=n//10
            digitcount+=1 
        if(digitcount%2==0):
            c=c+1
    return c
if __name__=="__main__":
    N=int(input())
    nums=list(map(int,input().split(",")))
    print(findNumbers(nums))
