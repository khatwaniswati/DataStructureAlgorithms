package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphBfsDfs {

	public LinkedList<Integer> adj[];

	public GraphBfsDfs(int v) {
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of vertices and edges:");
		int v = sc.nextInt();
		int e = sc.nextInt();

		GraphBfsDfs graph = new GraphBfsDfs(v);
		System.out.println("Enter edges:");
		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int dest = sc.nextInt();
			graph.addEdge(source, dest);
		}

		System.out.println("Enter Source and Dest:");
		int src = sc.nextInt();
		int des = sc.nextInt();
		sc.close();
		int res = graph.bfs(src, des);
		System.out.println("Dist of BFS:"+res);
		
		boolean[] visited = new boolean[v];
		boolean exist = graph.dfs(src, des,visited);
		System.out.println("DFS exists:"+exist);
	}

	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}

	public int bfs(int source, int dest) {
		boolean[] visited = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();

		q.add(source);
		parent[source] = -1;
		visited[source] = true;

		while (!q.isEmpty()) {
			int cur = q.poll();
			if (cur == dest)
				break;

			for (int neighbour : adj[cur]) {
				if (!visited[neighbour]) {
					q.add(neighbour);
					parent[neighbour] = cur;
					visited[neighbour] = true;
				}
			}
		}

		int distance = 0;
		int cur = dest;
		while (parent[cur] != -1) {
			System.out.print(cur + " -> ");
			distance++;
			cur = parent[cur];
		}
		System.out.println();
		return distance;
	}

	public boolean dfs(int source, int dest, boolean[] visited) {
		if (source == dest)
			return true;

		for (int neighbour : adj[source]) {
			if (!visited[neighbour]) {
				visited[neighbour] = true;
				boolean isConnected = dfs(neighbour, dest, visited);
				if (isConnected)
					return true;
			}
		}
		return false;
	}
}

/**
5 6
 
0 1
1 2
2 3
3 4
0 4
2 4

0 3
 */
