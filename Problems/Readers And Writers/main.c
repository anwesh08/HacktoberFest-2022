#include <pthread.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

#include "resource_monitor.h"

#define MAX 3
#define NUM_LEITORES 4

void *escritores(void *ptr)
{
    for (int i = 0; i < MAX; i++)
    {
        sleep(i + 1);
        printf("Writer writing, time %d - buffer: %d\n", (i + 1), i);
        put(i);
        printf("Writer finished writing\n");
    }
    pthread_exit(0);
}

void *leitores(void *ptr)
{
    int time = (intptr_t) ptr;

    for (int i = 0; i < MAX; i++)
    {
        sleep(time + i);
        printf("Reader %ld, time %d - reading buffer: %d\n", pthread_self(), time + i, take());
    }
    pthread_exit(0);
}

int main(int argc, char **argv)
{
    pthread_t esc;
    pthread_t lei[NUM_LEITORES];

    initMonitor();

    for(int i=0; i < NUM_LEITORES; i++) {
        pthread_create(&(lei[i]), NULL, (void *)leitores, (void *)(intptr_t)(i));
    }

    pthread_create(&esc, NULL, (void *)escritores, NULL);

    for (int i=0; i < NUM_LEITORES; i++) {
        pthread_join(lei[i],NULL);
    }
    pthread_join(esc, NULL);

    destroyMonitor();
}
