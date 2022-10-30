class Solution {
public:
    bool checkString(string s) 
    {
         for(int i = 0; i < s.length(); i++){ //iterating over every element
            if(s[i] == 'b') 
                if(s[i+1] == 'a') return false; //if current is b and next is a return false
        }
        return true; //otherwise return true
}   

};
