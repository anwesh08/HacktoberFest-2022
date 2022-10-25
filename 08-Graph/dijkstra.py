import sys

def dijkstra(adjacencyList, source):
    distance = [sys.maxsize] * (max(adjacencyList) + 1) 
    predecessor = [None] * (max(adjacencyList) + 1)

    distance[source] = 0
    vertices = [source]

    while vertices:
      output = vertices.pop()
      for vertex in adjacencyList[output]:
        if distance[vertex] > distance[output] + adjacencyList[output][vertex]:
          distance[vertex] = distance[output] + adjacencyList[output][vertex]
          predecessor[vertex] = output
          vertices.append(vertex)

    return(distance)
    