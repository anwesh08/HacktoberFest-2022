def bfs(adjacencyList, s):
    """
      explanation: print the bfs of a graph starting in the s origin vertex.\n
      input: the s origin vertex.\n
      output: the bfs.\n
    """

    visited = [False] * (max(adjacencyList) + 1)
    visited_queue = []

    visited_queue.append(s)
    visited[s] = True

    while visited_queue:
      vertex = visited_queue.pop(0)
      print(vertex, end = ' ')

      for i in adjacencyList[vertex]:
        if visited[i] == False:
          visited_queue.append(i)
          visited[i] = True
    print()
