#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

int sequentialSearch(int *vet, int chave, int ini, int fim);
int* generateRandomVector(int n, int max, int seed);
void printVector(int *vet, int n);
void *searchForNumber( void *ptr );

struct SearchData {
    int initialPosition;
    int finalPosition;
    int searchForNumber;
    int *vector;
    int interval;
    int sizeOfVector;
    int i;
};

int amountOfThreads = 8;    

void main(){

    struct SearchData *searchData;

    searchData->sizeOfVector = 32;
    searchData->interval = searchData->sizeOfVector / amountOfThreads;
    searchData->initialPosition = 0;
    searchData->finalPosition = searchData->initialPosition + searchData->interval;
    searchData->searchForNumber = 16;
    searchData->vector = generateRandomVector(searchData->sizeOfVector, 50, 999);

    pthread_t thread;
    int returnThread;
    

    for(searchData->i = 0; searchData->i < amountOfThreads; searchData->i++){
        returnThread = pthread_create(&thread, NULL, searchForNumber, (void *)(searchData));
    }

    pthread_join(thread, NULL);

    exit(0);
}

void *searchForNumber( void *ptr ){
    int result;
    struct SearchData *data = (struct SearchData *)ptr;
    result = sequentialSearch(data->vector, data->searchForNumber, data->initialPosition, data->finalPosition);
    if(result != -1){
        printf("\n\nNumber index: %d", result);
        printf("\nThread that find: %ld", pthread_self());
    }
    if(data->i == amountOfThreads-1){
        data->finalPosition = data->sizeOfVector;
    }else{
        data->finalPosition = data->initialPosition + data->interval;
    }
    pthread_exit(NULL);  
}

int sequentialSearch(int *vet, int chave, int ini, int fim){
    for(int i = ini; i < fim; i++){
        if(vet[i] == chave){
            return i;
        }
    }
    return -1;
}

int* generateRandomVector(int n, int max, int seed){
    int i;
    int* v;
    srand(seed);

    v = malloc(sizeof(int) * n);
    for(i = 0; i < n; i++){
        v[i] = rand() % (max +1) ;
    }
    return v;
}

void printVector(int *vet, int n){
    printf("[");
    for(int i = 0; i < n; i++){
        printf("%d", vet[i]);
        if(i < n-1){
            printf(", ");
        }
    }
    printf("]\n");
}