#include "list.h"

typedef struct list
{
    Node *start;
    Node *end;
    int count;
} List;

typedef struct node
{
    TypeElem data;
    struct node *prev;
    struct node *next;
} Node;

List *list_create()
{

    List *new = (List *)malloc(sizeof(List));
    new->count = 0;
    new->start = NULL;
    new->end = NULL;
}
void list_destory(List **adress)
{
    Node *aux = (Node *)malloc(sizeof(Node));
    aux = (*adress)->start;

    while (aux != NULL)
    {
        free(aux);
        aux = aux->next;
    }

    aux = (*adress);
    free(aux);
}

bool list_attach(List *l, TypeElem elemento)
{

    Node *node = (Node *)malloc(sizeof(Node));
    node->prev = NULL;
    node->data = elemento;
    node->next = NULL;

    if (l->start == NULL)
    {
        l->start = node;
        l->end = node;
    }

    node->prev = l->end;
    l->end->next = node;
    l->end = node;

    l->count++;

    return true;
}
bool list_insert(List *l, TypeElem elemento, int position)
{

    if (l == NULL || position > l->count)
    {
        return false;
    }

    Node *node = (Node *)malloc(sizeof(Node));
    node->prev = NULL;
    node->next = NULL;
    node->data = elemento;

    Node *aux2 = (Node *)malloc(sizeof(Node));

    Node *aux = (Node *)malloc(sizeof(Node));
    aux = l->start;

    for (int i = 0; i < l->count; i++)
    {

        if (i == position)
        {

            aux2 = aux;

            aux = aux->prev;
            node->prev = aux;
            aux->next = node;
            node->next = aux2;
            aux2->prev = node;
        }

        aux = aux->next;
    }

    l->count++;
}

bool list_removePosition(List *l, int position, TypeElem *adress)
{

    if (l == NULL)
    {
        return false;
    }

    if (position > l->count)
    {
        printf("\nPosition not found\n");
        return false;
    }

    Node *aux = l->start;
    Node *auxProx;
    Node *auxAnt;

    if (l->count == 1)
    {
        aux->prev = NULL;
        aux->next = NULL;

        *adress = aux->data;

        l->count--;
        free(aux);

        return true;
    }

    for (int i = 0; i < l->count; i++)
    {
        if (i == position)
        {

            *adress = aux->data;

            if (i > 0)
            {
                auxAnt = aux->prev;
            }
            if (aux->next != NULL)
            {
                auxProx = aux->next;
            }

            if (i == 0)
            {
                free(aux);
                auxProx->prev = NULL;
                l->start = auxProx;
            }
            else if ((position - l->count) == 0)
            {
                auxAnt->next = NULL;
                free(aux);
                l->end = auxAnt;
            }
            else if (aux->next == NULL)
            {
                auxAnt->next = NULL;
                free(aux);
                l->end = auxAnt;
            }
            else
            {
                auxAnt->next = auxProx;
                auxProx->prev = auxAnt;
            }

            l->count--;

            return true;
        }

        aux = aux->next;
    }

    return true;
}
int list_removeElement(List *l, TypeElem elemento)
{

    Node *aux = l->start;
    int pos = -1;

    for (int i = 0; i < l->count; i++)
    {
        if (aux->data == elemento)
        {
            list_removePosition(l, i, &pos);
        }

        aux = aux->next;
    }

    if (pos == -1)
    {
        return 0;
    }

    return pos;
}

bool list_replace(List *l, int position, TypeElem newElement)
{

    if (l == NULL)
    {
        return false;
    }

    Node *aux = (Node *)malloc(sizeof(Node));
    aux = l->start;

    for (int i = 0; i < l->count; i++)
    {
        if (i == position)
        {
            aux->data = newElement;
        }

        aux = aux->next;
    }

    return true;
}
int list_position(List *l, TypeElem elemento)
{

    if (l == NULL)
    {
        return false;
    }

    Node *aux = (Node *)malloc(sizeof(Node));
    aux = l->start;

    TypeElem pos = -1;

    for (int i = 0; i < l->count; i++)
    {
        if (aux->data == elemento)
        {
            pos = i;
        }

        aux = aux->next;
    }

    return pos;
}
bool list_search(List *l, int position, TypeElem *adress)
{
    if (l == NULL || position > l->count)
    {
        return false;
    }

    Node *aux = (Node *)malloc(sizeof(Node));
    aux = l->start;

    for (int i = 0; i < l->count; i++)
    {

        if (i == position)
        {
            *adress = aux->data;
        }

        aux = aux->next;
    }

    return true;
}

int list_size(List *l)
{
    return l->count;
}
bool list_empty(List *l)
{
    if (l->count = 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
bool list_toString(List *l, char *str)
{

    if (l == NULL)
    {
        return false;
    }

    Node *aux = l->start;

    str[0] = '\0';

    strcat(str, "[");

    for (int i = 0; i < l->count; i++)
    {
        char casting[50];

        sprintf(casting, "%d", aux->data);
        strcat(str, casting);

        if (i < (l->count) - 1)
        {
            strcat(str, ",");
        }

        aux = aux->next;
    }

    strcat(str, "]\n");

    return true;
}

void list_print(List *l)
{

    Node *aux = (Node *)malloc(sizeof(Node));
    aux = l->start;

    printf("[");
    for (int i = 0; i < l->count; i++)
    {
        printf("%i", aux->data);

        if (i < l->count - 1)
        {
            printf(", ");
        }

        aux = aux->next;
    }
    printf("]");
}