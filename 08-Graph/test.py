from dijkstra import dijkstra
from graph import Graph
from bfs import bfs
from dfs import dfs
from bellman_ford import bellman_ford

graph = Graph(4)

graph.addEdge(0, 1)
graph.addEdge(0, 2)
graph.addEdge(1, 2)
graph.addEdge(2, 0)
graph.addEdge(2, 3)
graph.addEdge(3, 3)

bfs(graph.adjacencyList, 2)
dfs(graph.adjacencyList, 2)

print()
print(dijkstra(graph.adjacencyList, 1))
print(bellman_ford(graph.adjacencyList, 1))