

def bin_search(li,x):
	
	l=0
	u=len(li)-1
	m=(l+u)//2
	while li[m]==x or l<=u:
		
		
		if li[m]==x:
			return m
		
		elif x<li[m]:
			u=m-1
		else:
			l=m+1

		m=(l+u)//2


li=list(map(int,input("Enter list of item by space: ").split()))
li.sort()
print("sorted list: ",li)
x=int(input("Enter item to search: "))
i=bin_search(li,x)
print(x,"is at",i+1,"place")
