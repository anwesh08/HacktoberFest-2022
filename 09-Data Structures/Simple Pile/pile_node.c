#include "pile.h"

typedef struct de
{
    ElemType data;
    struct node *next;
} Node;

struct pile
{
    Node *top;
    int countElem;
};

Pile *pile_create()
{

    Pile *aux;
    aux = (Pile *)malloc(sizeof(Pile));

    aux->top = NULL;
    aux->countElem = 0;

    return aux;
}
void pile_destory(Pile **adress)
{

    Node *node = (*adress)->top;
    Node *aux = node;

    int b;

    for (int i = 0; i < (*adress)->countElem; i++)
    {
        pile_unstack((*adress), &b);
    }

    free((*adress)->top);
    (*adress)->top = NULL;
    (*adress)->countElem = NULL;
    free((*adress));
}
bool pile_stackup(Pile *p, ElemType elemento)
{
    Node *node = (Node *)malloc(sizeof(Node));
    if (node == NULL)
    {
        printf("Alocation Error. \n");
    }
    else
    {
        node->data = elemento;
        node->next = NULL;
    }

    if (p->top == NULL)
    {
        p->top = node;
    }
    else
    {
        Node *aux = p->top;

        while (aux->next != NULL)
        {
            aux = aux->next;
        }

        aux->next = node;
    }

    p->countElem++;

    return true;
}
bool pile_unstack(Pile *p, ElemType *saida)
{

    Node *aux = p->top;
    Node *aux2 = p->top;

    if (p->top->next == NULL)
    {
        *saida = p->top->data;

        free(p->top);
        p->top = NULL;
        p->countElem = 0;

        return false;
    }

    for (int i = 0; i < p->countElem - 2; i++)
    {
        aux2 = aux2->next;
    }

    for (int i = 0; i < p->countElem; i++)
    {

        if (aux->next != NULL)
        {
            aux = aux->next;
        }
    }

    *saida = aux->data;

    aux2->next = NULL;
    free(aux);
    aux = NULL;

    p->countElem--;

    return true;
}
bool pile_top(Pile *p, ElemType *saida)
{

    if (p == NULL)
    {
        return false;
    }

    *saida = p->top->data;

    return true;
}
bool pile_empty(Pile *p)
{

    if (p->top == NULL)
    {
        return true;
    }
    else
    {
        return false;
    }
}
void pile_print(Pile *p)
{

    Node *aux = p->top;

    if (p->countElem <= 0)
    {
        printf("Nothing here :v.\n");
    }

    for (int i = 0; i < p->countElem; i++)
    {
        printf("%i ", aux->data);
        aux = aux->next;
    }
}
int pile_size(Pile *p)
{
    return p->countElem;
}

Pile *pile_clone(Pile *p)
{

    Pile *clone;
    clone = pile_create();

    Node *aux = p->top;

    while (aux != NULL)
    {
        pile_stackup(clone, aux->data);
        aux = aux->next;
    }

    return clone;
}
void pile_inverter(Pile *p)
{

    Node *aux = p->top;
    Pile *inverse = pile_create();

    int tam = p->countElem;
    int i = 0;

    int *vet = (int *)calloc(tam, sizeof(int));

    while (aux != NULL)
    {
        vet[i] = aux->data;
        aux = aux->next;
        i++;
    }

    for (int i = 0; i < p->countElem; i++)
    {
        int a;
        pile_unstack(p, &a);
    }

    int j = p->countElem - 1;

    for (int i = 0; i < p->countElem; i++)
    {
        pile_stackup(inverse, vet[j]);
        j--;
    }

    p->top = inverse->top;
}
bool pile_stackUpAll(Pile *p, ElemType *vetor, int tamVetor)
{

    if (p == NULL)
    {
        return false;
    }

    for (int i = 0; i < tamVetor; i++)
    {
        pile_stackup(p, vetor[i]);
    }

    return true;
}
bool pile_toString(Pile *f, char *str);
