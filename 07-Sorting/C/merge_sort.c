#include <limits.h>
#include <stdio.h>
#include <stdlib.h>

void merge(int *v, int start, int middle, int end) {
  int i, j, k;
  int sizeOfFirstSubVector = middle - start + 1;
  int sizeOfSecondSubVector = end - middle;
  int *firstSubVector = (int *)calloc((sizeOfFirstSubVector + 1), sizeof(int));
  int *secondSubVector =
      (int *)calloc((sizeOfSecondSubVector + 1), sizeof(int));

  for (i = 0; i < sizeOfFirstSubVector; i++) {
    firstSubVector[i] = v[start + i];
  }
  firstSubVector[sizeOfFirstSubVector] = INT_MAX;

  for (j = 0; j < sizeOfSecondSubVector; j++) {
    secondSubVector[j] = v[middle + j + 1];
  }
  secondSubVector[sizeOfSecondSubVector] = INT_MAX;
  i = 0;
  j = 0;

  for (k = start; k <= end; k++) {
    if (firstSubVector[i] <= secondSubVector[j]) {
      v[k] = firstSubVector[i++];
    } else {
      v[k] = secondSubVector[j++];
    }
  }

  free(firstSubVector);
  free(secondSubVector);
}

void mergeSort(int *v, int left, int right) {
  if (left < right) {
    int middle = (left + right) / 2;
    mergeSort(v, left, middle);
    mergeSort(v, middle + 1, right);
    merge(v, left, middle, right);
  }
}

int main(int argc, char **argv) {
  int vet[5] = {-2, 6, 4, 10, 3};

  mergeSort(vet, 0, 5);
}