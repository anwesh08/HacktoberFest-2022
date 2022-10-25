#include <stdio.h>

#define MEMO_SIZE 100

unsigned long long int memo[MEMO_SIZE] = { 0 };

unsigned long long int fib(int n) {
  if (memo[n] != 0) return memo[n];
  if(n < MEMO_SIZE) {
    memo[n] = fib(n - 1) + fib(n - 2);
    return memo[n];
  } else {
    return fib(n - 1) + fib(n - 2);
  }
}

int main() {
  memo[0] = 1;
  memo[1] = 1;

  int n;
  scanf("%d", &n);
  printf("Value at pos %d is %llu\n", n, fib(n - 1));
  return 0;
}