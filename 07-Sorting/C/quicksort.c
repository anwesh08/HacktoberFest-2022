#include <stdio.h>
#include <stdlib.h>

void swap(int *vetor, int bigger, int lastPosition) {
  int temp = vetor[lastPosition];
  vetor[lastPosition] = vetor[bigger];
  vetor[bigger] = temp;
}

int partition(int *v, int p, int r) {
  int x;
  int i, j;
  x = v[r];
  i = p - 1;

  for (j = p; j < r; j++) {
    if (v[j] <= x) {
      i++;
      swap(v, i, j);
    }
  }
  swap(v, i + 1, r);

  return i + 1;
}

void quickSort(int *v, int l, int r) {
  int q;
  if (l < r) {
    q = partition(v, l, r);
    quickSort(v, l, q - 1);
    quickSort(v, q + 1, r);
  }
}

int main(int argc, char **argv) {
  int vet[5] = {-2, 6, 4, 10, 3};

  quickSort(vet, 0, 5);
}