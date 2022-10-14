#include <stdio.h> 
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h> 

int linear_search(int *vet, int chave, int ini, int fim){
    for(int i = ini; i < fim; i++){
        if(vet[i] == chave){
            return i;
        }
    }
    return -1;
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

void main(){
    int amountChilds = 3;
    int status;

    int vet[] = {0,1,2,3,4,5,6,7,8,9};
    int sizeOfVet = sizeof(vet)/sizeof(vet[0]);

    int interval = sizeOfVet / amountChilds;

    int posIni = 0;
    int posFim = 0;
    int findNumber = 4;
    int indexNum;

    printf("Searching for: %d\n", findNumber);
    printf("Vector: ");
    printVector(vet, sizeOfVet);

    for(int i=0; i < amountChilds; i++)
    {
        posIni = posFim;

        if(i = amountChilds - 1){
            posFim = sizeOfVet;
        }else{
            posFim = posIni + interval;
        }

        if(fork() == 0){
            indexNum = linear_search(vet, findNumber, posIni, posFim);
            if(indexNum != -1){
                printf("PID that find: %d \nNumber index: %d\n", getpid(), indexNum);
            }else{
                printf("Number not found.");
            }
            exit(0);
        }
    }
    exit(0);
}