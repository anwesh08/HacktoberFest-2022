#include "resource_monitor.h"

pthread_mutex_t mutex;
pthread_cond_t reader, writer;

int buffer;
int readers;
int writers;

void initMonitor()
{
    pthread_mutex_init(&mutex, NULL); 
    pthread_cond_init(&reader, NULL); 
    pthread_cond_init(&writer, NULL); 

    buffer = 0;
    readers = 0;
    writers = 0;
}

void put(int value)
{
    pthread_mutex_lock(&mutex); 
    while(readers > 0 || writers > 0){
        pthread_cond_wait(&writer, &mutex);
    }
    writers++;
    pthread_mutex_unlock(&mutex); 
    buffer = value;
    pthread_mutex_lock(&mutex); 
    writers--;
    pthread_cond_signal(&writer);     
    pthread_cond_signal(&reader); 
    pthread_mutex_unlock(&mutex); 
}

int take()
{
    pthread_mutex_lock(&mutex); 
    while(writers > 0){
        pthread_cond_wait(&reader, &mutex);
    }
    readers++;
    pthread_mutex_unlock(&mutex); 
    int value = buffer;
    pthread_mutex_lock(&mutex); 
    readers--;
    if(readers == 0){
        pthread_cond_signal(&writer);    
    }
    pthread_mutex_unlock(&mutex);
    return value;
}

void destroyMonitor()
{
    pthread_mutex_destroy(&mutex);    
    pthread_cond_destroy(&reader);    
    pthread_cond_destroy(&writer);     
}
