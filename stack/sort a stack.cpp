// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

class SortedStack{
public:
	stack<int> s;
	void sort();
};

void printStack(stack<int> s)
{
    while (!s.empty())
    {
        printf("%d ", s.top());
       	s.pop();
    }
    printf("\n");
}

int main()
{
int t;
cin>>t;
while(t--)
{
	SortedStack *ss = new SortedStack();
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
	int k;
	cin>>k;
	ss->s.push(k);
	}
	ss->sort();
	printStack(ss->s);
}
}// } Driver Code Ends


/*The structure of the class is
class SortedStack{
public:
	stack<int> s;
	void sort();
};
*/

/* The below method sorts the stack s 
you are required to complete the below method */

int insert_sorted(stack<int>& s1,int k)
{
	if(s1.empty()||s1.top()>k)
	{
		s1.push(k);
		return 0;
	}
	int temp=s1.top();
	s1.pop();
	insert_sorted(s1,k);
	s1.push(temp);
	return 0;
}

int sort_stack(stack<int> &s1)
{
	if(s1.empty())
		return 0;
	int temp=s1.top();
	s1.pop();
	sort_stack(s1);
	insert_sorted(s1,temp);
	return 0;	
}
void SortedStack :: sort()
{
    stack<int> ss;
    
    sort_stack(s);
    while(!s.empty())
    {
        ss.push(s.top());
        s.pop();
    }
    s=ss;
   //Your code here
}
