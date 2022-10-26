#ifndef _LIST_H_
#define _LIST_H_

#include <stdlib.h>
#include <stdio.h>

#include <stdbool.h>
#include <string.h>

typedef int TypeElem;

/**************************************
 * DADOS
 **************************************/
typedef struct list List;
typedef struct node Node;

/**************************************
 * PROTÓTIPOS
 **************************************/
List *list_create();
void list_destory(List **adress);

bool list_attach(List *l, TypeElem elemento);
bool list_insert(List *l, TypeElem elemento, int position);

bool list_removePosition(List *l, int position, TypeElem *adress);
int list_removeElement(List *l, TypeElem elemento);

bool list_replace(List *l, int position, TypeElem newElement);
int list_position(List *l, TypeElem elemento);
bool list_search(List *l, int position, TypeElem *adress);

int list_size(List *l);
bool list_empty(List *l);
bool list_toString(List *l, char *str);

void list_print(List *l);

#endif