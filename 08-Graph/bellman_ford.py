import sys

def bellman_ford(adjacencyList, source):
  distance = [sys.maxsize] * (max(adjacencyList) + 1) 
  distance[source] = 0
  
  for _ in range(len(adjacencyList) - 1):
    for u in adjacencyList:
      for v in adjacencyList[u]:
        if distance[u] != sys.maxsize:
          if distance[u] + adjacencyList[u][v] < distance[v]:
            distance[v] = distance[u] + adjacencyList[u][v]

  for u in adjacencyList:
      for v in adjacencyList[u]:
        if distance[u] != sys.maxsize:
          if distance[u] + adjacencyList[u][v] < distance[v]:
            return False

  return distance
