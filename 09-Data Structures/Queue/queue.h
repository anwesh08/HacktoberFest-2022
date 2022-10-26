#ifndef _FILA_H_
#define _FILA_H_

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

typedef int TypeElem;

typedef struct queue Queue;

Queue *queue_create();
void queue_destroy(Queue **adressQueue);
bool queue_insert(Queue *f, TypeElem element);
bool queue_remove(Queue *f, TypeElem *exit);
bool queue_first(Queue *f, TypeElem *exit);
bool queue_empty(Queue *f);
int queue_size(Queue *f);
void queue_print(Queue *f);
Queue *queue_clone(Queue *f);
bool queue_toString(Queue *f, char *str);
bool queue_insertAll(Queue *f, TypeElem *vetor, int sizeVetor);

#endif