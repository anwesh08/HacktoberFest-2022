CC=gcc -Wall

PROGS=main

all: $(PROGS)

clean:
	rm -f $(PROGS)
main: main.c resource_monitor.c resource_monitor.h
	$(CC) main.c resource_monitor.c -o $(PROGS) -lpthread