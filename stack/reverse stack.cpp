void insert(stack<int> &st,int ele)
{
    if(st.empty())
    {
        st.push(ele);
        return;
    }
    int temp=st.top();
    st.pop();
    insert(st,ele);
    st.push(temp);
}

void reverse(stack<int> &st)
{
    if(st.empty())
        return;
    int top_ele=st.top();
    st.pop();
    reverse(st);
    insert(st,top_ele);
}
void reverseStack(stack<int> &st) {
    // Write your code here
    reverse(st);
}
