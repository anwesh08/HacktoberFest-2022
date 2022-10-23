class stack()
{
	

    stack<char> st;
    int ans=false;
    for(int i=0;i<A.length();i++)
    {
        if(A[i]=='('||A[i]=='+'||A[i]=='-'||A[i]=='*'||A[i]=='/')
            st.push(A[i]);
        else if(A[i]==')'&&!st.empty())
        {
            if(st.top()=='(')
                ans=1;
                
            while(st.top()!='(')
            {
                st.pop();
            }
            if(!st.empty())
                st.pop();
        }
    }
    return ans;
}

