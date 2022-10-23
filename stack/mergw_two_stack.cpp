#include "stdafx.h"
#include <iostream.h>
#include <stdlib.h>
#define MAX 10;
#define TRUE 0;
#define FALSE 0;
struct stack
{
int top;
int item[10];
};
int empty(stack *st);
int full(stack *st);
void push(stack *st, int x);
int pop(stack *st);
void main()
{
struct stack st1,st2,st3;
int x, y, i, value;
cout<<"enter the number of items of stack1";
cin>> x; /*x <MAX*/
for(i=0;i<=x-1;i++){
cin>> value;
push(&st1,value);
}
cout<<"enter the number of items of stack2";
cin>> y;
for(i=0;i<=y-1;i++){
cin>> value;
push(&st2,value);
}
while (~(empty(&st1)))
{
value=pop(&st1);
push(&st3,value);
st3.top++;
}
while (~(empty(&st2)))
{
value=pop(&st2);
push(&st3,value);
st3.top++;
}
for(i=st3.top;i>=0;i--)
cout<< st3.item[i];
return;
}
int empty(struct stack *st)
{
if (st->top==-1)
return (0);
else
return(1);
} 
int full(struct stack *st)
{
if(st->top==9)
return(0);
3
else
return(1);
}
int pop(struct stack *st)
{
if (~ empty(st)){
cout<< "empty stack";
exit(1);
}
return (st->item[st->top--]);
} /*end pop*/
void push(struct stack *st, int x)
{
if (~(full(st))){
cout << "stack is full";
exit(1);
}
else
st->item[++(st->top)]=x;
return;
}
