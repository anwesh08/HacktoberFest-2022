#include <stdio.h>
#include <stdlib.h>

int swap(int* v, int pos1, int pos2) {
  int temp = v[pos1];
  v[pos1] = v[pos2];
  v[pos2] = temp;
}

int reverse(int* v, int size) {
  for (int i = 0, j = size - 1; i < size / 2; i++, j--)
    swap(v, i, j);
}

int main() {
  int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  reverse(v, 10);
  for (int i = 0; i < 10; i++) {
    printf("%d ", v[i]);
  }
  printf("\n");
}