from collections import defaultdict

class Graph:
  """Graph class for representing and manipulating graphs"""

  def __init__(self, N):
    """N is the vertex quantity that'll be added to the graph"""

    self.adjacencyList = defaultdict(dict)

    for i in range (0, N):
      self.adjacencyList[i] = {}


  def addEdge(self, u, v, w = 1):
    """
      explanation: add an edge to v vertex. \n
      input: U and V are the vertices. W is the value of the edge. \n
      condition: if W isn't passed, the edge value is 1. \n
      return (unsuccessfully): if U and V are non-existent vertices in the graph, a message will be returned. \n
    """

    if u not in self.adjacencyList.keys():
      return "vertex" + str(u) + "doesn't exists"

    if v not in self.adjacencyList.keys():
      return "vertex " + str(v) + " doesn't exists"

    else:
      self.adjacencyList[u].update({v: w})


  def getInDegree(self, v):
    """
      explanation: return the in-degree of a vertex.\n
      input: the vertex V.\n
      output: the in-degree of a vertex.\n
    """

    inDegree = 0

    for vertex in self.adjacencyList.keys():
      if v in self.adjacencyList[vertex].keys():
        inDegree += 1

    return inDegree


  def getOutDegree(self, v):
    """
      explanation: return the out-degree of a vertex.\n
      input: the vertex V.\n
      output: the out-degree of a vertex.\n
    """

    return len(self.adjacencyList[v])


  def getDegree(self, v):
    """
      explanation: return the degree of a vertex.\n
      input: the vertex V.\n
      output: the degree of a vertex.\n
    """

    return self.getOutDegree(v) + self.getInDegree(v)
