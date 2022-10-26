#ifndef _PILE_H_
#define _PILE_H_

#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

typedef int ElemType;

typedef struct pile Pile;

Pile *pile_create();
void pile_destory(Pile **adress);
bool pile_stackup(Pile *p, ElemType elemento);
bool pile_unstack(Pile *p, ElemType *saida);
bool pile_top(Pile *p, ElemType *saida);
bool pile_empty(Pile *p);
void pile_print(Pile *p);
int pile_size(Pile *p);
Pile *pile_clone(Pile *p);
void pile_inverter(Pile *p);
bool pile_stackUpAll(Pile *p, ElemType *vetor, int tamVetor);
bool pile_toString(Pile *p, char *str);

#endif