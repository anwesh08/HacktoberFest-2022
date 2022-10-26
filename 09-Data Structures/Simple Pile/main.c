#include <stdio.h>
#include "pile.h"

int main()
{

    Pile *a = pile_create();

    pile_stackup(a, 10);

    pile_print(a);

    return 0;
}