#include <stdio.h>
#include <stdlib.h>

int max(int *vetor, int start, int end) {
  int bigger = end;

  for (int i = start; i <= end; i++) {
    if (vetor[i] > vetor[end] && vetor[i] > vetor[bigger]) {
      bigger = i;
    }
  }

  return bigger;
}

void swap(int *vetor, int bigger, int lastPosition) {
  int temp = vetor[lastPosition];
  vetor[lastPosition] = vetor[bigger];
  vetor[bigger] = temp;
}

void selectionSort(int *vetor, int size) {
  int bigger;
  for (int i = size - 1; i > 0; i--) {
    bigger = max(vetor, 0, i);
    swap(vetor, bigger, i);
  }
}

void printVetor(int *vetor, int size) {
  for (int i = 0; i < size; i++) {
    printf("%d, ", vetor[i]);
  }
}

int main(int argc, char **argv) {
  int vet[5] = {-2, 6, 4, 10, 3};

  selectionSort(vet, 5);
}
