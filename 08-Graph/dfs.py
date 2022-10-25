def recursive_dfs(adjacencyList, origin_vertex, visited_vertices):
    """
      explanation: recursive function to do a dfs used by DFS().\n
      input: the origin vertex and a set of visited vertices.\n
      output: the dfs.\n
    """

    visited_vertices.append(origin_vertex)
    print(origin_vertex, end=' ')

    for adjacent in adjacencyList[origin_vertex]:
      if adjacent not in visited_vertices:
        recursive_dfs(adjacencyList, adjacent, visited_vertices)


def dfs(adjacencyList, s):
    """
      explanation: print the DFS of a graph, started in s.\n
      input: the origin vertex s.\n
      output: the dfs.\n
    """

    visited_vertices = []
    recursive_dfs(adjacencyList, s, visited_vertices)
