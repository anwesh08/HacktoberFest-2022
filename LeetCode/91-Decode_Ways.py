# Problem Link: https://leetcode.com/problems/decode-ways/

class Solution:
    def numDecodings(self, s: str) -> int:
        dp = {}
        return self.calc(s, 0, dp)
    
    def calc(self, s, index, dp):
        if index == len(s):
            return 1
        
        if s[index]=='0':
            return 0

        if index in dp:
            return dp[index]

        if index + 1 < len(s):
            if (s[index] == '2' and s[index+1] <= '6') or s[index]=='1':
                ans = self.calc(s, index+1, dp) + self.calc(s, index+2, dp)
                dp[index] = ans 
                return ans
        
        ans = self.calc(s, index+1, dp)
        dp[index] = ans 
        
        return ans
