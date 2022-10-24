#include <stdio.h>
#include <stdlib.h>

int max(int* v, int size) {
  int max = v[0];
  for (int i = 0; i < size; i++)
    if (v[i] > max)
      max = v[i];
  return max;
}

int main() {
  int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  printf("%d\n", max(v, 10));
}