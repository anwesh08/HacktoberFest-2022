#include<bits/stdc++.h>
using namespace std;
int swap(int n,int r)
{

if(n>0)
return (n%r+swap(n/r,r));
else
return 0;
}
int main()
{
//	int a=200,b=110;
	
	cout<<swap(513,2);;
	return 0;
}
