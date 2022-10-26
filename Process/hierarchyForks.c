#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>     
#include <sys/types.h> 

void forkNLevels(int n){ 
    if(n <= 1) return;   
    pid_t pid = fork();  
    if(pid){            
        pid = fork();
        if(pid == 0){
            return forkNLevels(n-1);
        }
        return;
    }
    return forkNLevels(n-1);
}

void main(){

    int n = 3;

    forkNLevels(n);

    while(1){}
    
    exit(0);    
}

    