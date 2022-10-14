#include <stdio.h>
#include <stdlib.h>

void insertion(int *vetor, int size) {
  int i = size - 1;
  int temp = vetor[size];

  while (i >= 0 && vetor[i] > temp) {
    vetor[i + 1] = vetor[i];
    i--;
  }

  vetor[i + 1] = temp;
}

void insertionSort(int *vetor, int size) {
  for (int i = 1; i < size; i++) {
    insertion(vetor, i);
  }
}

void printVetor(int *vetor, int size) {
  for (int i = 0; i < size; i++) {
    printf("%d, ", vetor[i]);
  }
}

int main(int argc, char **argv) {
  int vet[5] = {-2, 6, 4, 10, 3};

  insertionSort(vet, 5);
}