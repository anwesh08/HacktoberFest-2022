#include "queue.h"

typedef struct node
{
    int data;
    struct node *prox;
} Node;

struct queue
{
    Node *start;
    Node *end;
    int count;
};

Queue *queue_create()
{
    Queue *aux = (Queue *)malloc(sizeof(Queue));
    aux->end = NULL;
    aux->start = NULL;
    aux->count = 0;

    return aux;
}
void queue_destroy(Queue **adressQueue)
{
    Node *aux;
    Queue *f = adressQueue;

    while (f->start != NULL)
    {
        aux = f->start;
        f->start = f->start->prox;
        free(aux);
    }

    free(*adressQueue);

    return true;
}
bool queue_insert(Queue *f, TypeElem element)
{

    if (f == NULL)
    {
        return false;
    }

    Node *node = (Node *)malloc(sizeof(Node));
    node->data = element;
    node->prox = NULL;

    if (f->start == NULL)
    {
        f->start = node;
        f->end = node;
    }

    f->end->prox = node;
    f->end = node;

    f->count++;

    return true;
}
bool queue_remove(Queue *f, TypeElem *exit)
{

    *exit = f->start->data;

    Node *aux = f->start;

    f->start = f->start->prox;

    free(aux);

    f->count--;

    return true;
}
bool queue_first(Queue *f, TypeElem *exit)
{
    *exit = f->start->data;
}
bool queue_empty(Queue *f)
{
    if (f->count == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
int queue_size(Queue *f)
{
    return f->count;
}
void queue_print(Queue *f)
{

    Node *aux = f->start;

    printf("[");

    for (int i = 0; i < f->count; i++)
    {
        printf("%i", aux->data);
        aux = aux->prox;

        if (i < f->count - 1)
        {
            printf(",");
        }
    }

    printf("]");
}
Queue *queue_clone(Queue *f)
{
    Queue *clone = queue_create();

    Node *aux = f->start;

    while (aux != NULL)
    {
        queue_insert(clone, aux->data);
        aux = aux->prox;
    }

    return clone;
}
bool queue_toString(Queue *f, char *str)
{
    if (f == NULL)
    {
        return false;
    }

    Node *aux = f->start;

    str[0] = '\0';

    strcat(str, "[");

    for (int i = 0; i < f->count; i++)
    {
        char casting[50];

        sprintf(casting, "%d", aux->data);
        strcat(str, casting);

        if (i < (f->count) - 1)
        {
            strcat(str, ",");
        }

        aux = aux->prox;
    }

    strcat(str, "]\n");

    return true;
}
bool queue_insertAll(Queue *f, TypeElem *vetor, int sizeVetor)
{

    for (int i = 0; i < sizeVetor; i++)
    {
        queue_insert(f, vetor[i]);
    }

    return true;
}
