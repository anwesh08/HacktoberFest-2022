#include <stdio.h>
#include <stdlib.h>

int binarySearch(int* v, int start, int end, int target) {
  int pos = (start + end) / 2;
  if(pos < 0 || start > end) return -1;
  if(v[pos] == target) return pos;
  if(v[pos] > target) return binarySearch(v, start, pos - 1, target);
  return binarySearch(v, pos + 1, end, target);
}


int main() {
  int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int target = 4;
  int pos = binarySearch(v, 0, 9, target);
  printf("The position of %d is %d\n", target, pos);
}