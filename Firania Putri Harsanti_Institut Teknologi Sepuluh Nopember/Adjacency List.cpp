#include <iostream>
#include <bits/stdc++.h>

using namespace std;

class Graph {
	private:
		int V, DFSWeight;
		vector<string> name;
		vector< list<int> > adjList;
		map<pair<int, int>, int> cost;
		vector<int> DFSRes, DijkstraRes;
	
	public:
		Graph(int N) {
			V = N;
			name.assign(V, "");
			list<int> l;
			adjList.assign(V, l);
			DFSRes.assign(V, 0);
			vector<int> vec (V, 0);
		}
		
		void addVertex(int index, string loc) {
			name[index] = loc;
		}
		
		void addEdge(int src, int dest, int weight) {
			adjList[src].push_back(dest);
			cost.insert({make_pair(src, dest), weight});
		}
		void printGraph() {
			cout << "REPRESENTASI ADJACENCY LIST" << endl;
			for (int i = 0; i < V; i++) {
				list<int>::iterator it;
				cout << name[i];
				for (it = adjList[i].begin(); it != adjList[i].end(); it++) {
					cout << " -> " << name[*it] << "[" << cost[make_pair(i, *it)] << "] ";
				}
				cout << endl;
			}
		}
		
		void DFS(int src, int dest) {
			cout << endl;
			cout << "========= DFS SHORTEST PATH ===========" << endl;
			DFSWeight = INT_MAX;
			vector<int> path;
			vector<bool> visited (V, false);
			spDFSTraversal(src, dest, path, visited, 0);
			
			cout << endl << "Shortest Path: ";
			for (int i = 0; i < DFSRes.size(); i++) {
				if (i == 0) cout << "[" << name[DFSRes[i]] << "]";
				else cout << " -> [" << name[DFSRes[i]]<< "]";
			}
			
			cout << endl << endl;
			cout << "Cost = " << DFSWeight << endl;
		}
		
		void spDFSTraversal(int src, int dest, vector<int> path, vector<bool> visited, int currWeight) {
			if (src == dest) {
				path.push_back(dest);
				if (currWeight < DFSWeight) {
					DFSWeight = currWeight;
					DFSRes = path;
				}
				
				cout << currWeight << ": ";
				for (int i = 0; i < path.size(); i++) {
					if (i == path.size() - 1) cout << path[i];
					else cout << path[i] << ", ";
				}
				cout << endl;
			}
			
			visited[src] = true;
			path.push_back(src);
			list<int>::iterator it;
			for (it = adjList[src].begin(); it != adjList[src].end(); it++) {
				if (!visited[*it]) {
					int tempWeight = currWeight;
					tempWeight += cost[make_pair(src, *it)];
					spDFSTraversal(*it, dest, path, visited, tempWeight);
				}
			}
		}
		
		int minDist(vector<int> dist, vector<bool> vis) {
			int min = INT_MAX;
			int min_index = INT_MAX;
			for (int i = 0; i < V; i++) {
				if (!vis[i] && dist[i] < min) {
					min = dist[i];
					min_index = i;
				}
			}
			
			return min_index;
		}
		
		void dijkstra(int src, int dest) {
			cout << "========= DIJKSTRA SHORTEST PATH ==========" << endl;
			
			vector<int> dist (V, INT_MAX);
			vector<bool> vis (V, false);
			vector<int> res (V, 0);
			
			dist[src] = 0;
			
			for (int itv = 0; itv < V; itv++) {
				int min = minDist(dist, vis);
				vis[min] = true;
				list<int>::iterator it;
				for (it = adjList[min].begin(); it != adjList[min].end(); it++) {
					if (cost[make_pair(min, *it)] && !vis[*it] && dist[min] + cost[make_pair(min, *it)] < dist[*it]) {
						dist[*it] = dist[min] + cost[make_pair(min, *it)];
						res[*it] = min;
						for (int i = 0; i < V; i++) {
							if(dist[i] < 10000)
								cout << dist[i] << " ";
							else
								cout << ". ";
						}
						cout << endl;
					}
				}
			}
			
			int i = res[dest];
			vector<int> r;
			r.push_back(dest);
			while(true) {
				r.push_back(i);
				if (i == src) 
					break;
				i = res[i];
			}
			
			reverse(r.begin(), r.end());
			
			cout << endl << "Shortest Path: ";
			for (int i = 0; i < r.size(); i++) {
				if (i == 0) cout << "[" << name[r[i]] << "]";
				else cout << " -> [" << name[r[i]]<< "]";
			}
			
			cout << endl << endl;
			cout << "Cost = " << dist[dest] << endl;
		}
		
		void BFS(int src, int dest) {
			cout << endl;
			cout << "============= BFS SHORTEST PATH =============" << endl;
			vector<int> visit (V, 0);
			vector<int> dist (V, INT_MAX);
			vector<int> domain (V, 0);
			queue<int> q;
			
			dist[src] = 0;
			q.push(src);
			visit[src] = true;
			
			while (!q.empty()) {
				int curr = q.front();
				list<int>::iterator it;
				for (it = adjList[curr].begin(); it != adjList[curr].end(); it++) {
					if (cost[make_pair(curr, *it)] + dist[curr] < dist[*it]) {
						dist[*it] = cost[make_pair(curr, *it)] + dist[curr];
						domain[*it] = curr;
						q.push(*it);
						for (int i = 0; i < V; i++) {
							if (dist[i] < 10000)
								cout << dist[i] << " ";
							else
								cout << ". ";
						}
						cout << endl;
					}
				}
				q.pop();
			}
			cout << "Domain: ";
			for (int i = 0; i < V; i++) {
				cout << domain[i] << " ";
			}
			cout << endl;
			
			vector<int> result;
			int i = dest;
			while(true) {
				result.push_back(i);
				if (i == src)
					break;
				i = domain[i];
			}
			
			cout << endl << "Shortest Path: ";
			for (int i = result.size() - 1; i >= 0; i--) {
				if (i == result.size() - 1) cout << "[" << name[result[i]] << "]";
				else cout << " -> [" << name[result[i]] << "]";
			}
			
			cout << endl << endl;
			cout << "Cost = " << dist[dest] << endl;
		}
};

int main() {
	Graph g(22);
	
	g.addVertex(0, "Rumah");
	g.addVertex(1, "Portal");
	g.addVertex(2, "Lap. Basket");
	g.addVertex(3, "Gapura Tempurejo");
	g.addVertex(4, "Superindo Kenjeran");
	g.addVertex(5, "Ming Toko Bangunan");
	g.addVertex(6, "Indomaret 1");
	g.addVertex(7, "Bon Ami Toko Roti");
	g.addVertex(8, "Suzuki Kenjeran");
	g.addVertex(9, "Jembatan");
	g.addVertex(10, "Pasar Tempurejo");
	g.addVertex(11, "Masjid");
	g.addVertex(12, "Indomaret 2");
	g.addVertex(13, "Wordnesia");
	g.addVertex(14, "Toyota Kenjeran");
	g.addVertex(15, "Shell Kenjeran");
	g.addVertex(16, "Galeri Foto Studio 77");
	g.addVertex(17, "Pom Bensin");
	g.addVertex(18, "Jl. Wiratno");
	g.addVertex(19, "Ken Park");
	g.addVertex(20, "Alfamart");
	g.addVertex(21, "Pujasera"); 
	
	g.addEdge(0, 1, 1);
    g.addEdge(0, 2, 1);
    g.addEdge(0, 3, 5);

    g.addEdge(1, 0, 1);
    g.addEdge(1, 4, 3);
    g.addEdge(1, 5, 3);
    g.addEdge(1, 6, 4);

    g.addEdge(2, 4, 2);
    g.addEdge(2, 7, 3);
    g.addEdge(2, 8, 3);
    g.addEdge(2, 9, 4);

    g.addEdge(3, 10, 2);
    g.addEdge(3, 11, 4);

    g.addEdge(4, 1, 3);
    g.addEdge(4, 2, 2);
    g.addEdge(4, 5, 1);
    g.addEdge(4, 12, 4);

    g.addEdge(5, 1, 3);
    g.addEdge(5, 4, 1);
    g.addEdge(5, 6, 2);

    g.addEdge(6, 1, 4);
    g.addEdge(6, 5, 2);

    g.addEdge(7, 2, 3);

    g.addEdge(8, 13, 6);
    g.addEdge(8, 14, 5);
    g.addEdge(8, 15, 5);
    g.addEdge(8, 16, 4);

    g.addEdge(9, 2, 4);
    g.addEdge(9, 17, 1);
    
    g.addEdge(10, 3, 2);

    g.addEdge(11, 19, 5);
    g.addEdge(11, 3, 4);

    g.addEdge(12, 18, 1);

    g.addEdge(14, 15, 1);

    g.addEdge(15, 16, 2);

    g.addEdge(16, 17, 2);
    g.addEdge(16, 15, 2);
	
	g.addEdge(17, 9, 1);
	g.addEdge(17, 12, 1);

    g.addEdge(18, 19, 2);
    g.addEdge(18, 20, 2);
    
    g.addEdge(20, 18, 2);
    g.addEdge(20, 21, 1);
    
    g.printGraph();
    
    int userInput, start, end;
    cout << "Masukkan metode yang diinginkan (1. DFS; 2. Dijkstra; 3. BFS): ";
    cin >> userInput;
    cout << "List Peta:" << endl;
    cout << "0. Rumah\n1. Portal\n2.Lap. Basket\n3. Gapura Tempurejo\n4. Superindo Kenjera\n5. Ming Toko Bangunan\n";
    cout << "6. Indomaret 1\n7. Bon Ami Toko Roti\n8. Suzuki Kenjeran\n9. Jembatan\n10. Pasar Tempurejo\n";
    cout << "11. Masjid\n12. Indomaret 2\n13. Wordnesia\n14. Toyota Kenjeran\n15. Shell Kenjeran\n";
    cout << "16. Galeri Foto Studio 77\n17. Pom Bensin\n18. Jalan Wiratno\n19. Ken Park\n20. Alfamart\n21. Pujasera\n";
    cout << "Masukkan titik start: ";
    cin >> start;
    cout << "Masukkan titik akhir: ";
    cin >> end;
    switch (userInput) {
    	case 1:
    		g.DFS(start, end);
    		break;
    	case 2:
    		g.dijkstra(start, end);
    		break;
    	case 3:
    		g.BFS(start, end);
    		break;
	}
	return 0;
}
