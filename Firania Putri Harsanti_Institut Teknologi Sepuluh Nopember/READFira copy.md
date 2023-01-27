## Penjelasan Program

## Deskripsi program

Terdapat dua jenis program dalam file ini yakni Adjacenct List dan Adjacency Matrix dan Adjacency List yang berfungsi untuk mencari rute tercepat dari titik start ke lokasi terakhir menggunakan Fungsi Shortest Path. Peta awal merupakan visualisasi graf salah satu daerah sekitar sebuah rumah di Kenjeran, Surabaya, yang akan dicari ruter tercepatnya oleh dua jenis kode dan tiga algoritma yang dapat dipilih.
 
Fungsi Shortest Path merupakan fungsi yang akan digunakan untuk mencari rute terpendek dari sebuah vertex ke vertex yang lain dalam graf. Pada dasarnya, fungsi ini akan menghitung jumlah bobot terkecil dari vertex-vertex yang perlu dilalui (traversal) dan akan mengembalikan konfigurasi jalan dengan bobot total yang paling efisien. Untuk proses traversalnya bisa digunakan 3 algoritma yang berbeda, antara lain Breadth-First Search (BFS), Depth-First Search (DFS), dan Dijkstra Algorithm. Karena keterbatasan waktu, saya akan menjelaskan algoritma yang menurut saya paling kompleks, untuk algoritma lainnya dapat dilihat implementasinya melalui fungsi-fungsi yang ada pada kode saya.

Algoritma Dijkstra merupakan algoritma shortest path yang paling efisien. Hal ini dibuktikan oleh cara kerja algoritma sendiri yang sangat mampu
menghindari proses yang redundan. Cara kerja algoritma Dijkstra adalah sebagai berikut.

1. Tandai semua node yang belum dikunjungi. Buat sebuah himpunan (set) yang menyimpan semua node yang belum dikunjungi yang disebut unvisited set.
2. Tetapkan (assign) ke setiap node nilai jarak tentatif: tetapkan sebagai 0 untuk node awal dan tak hingga untuk semua node yang lain. Selama algoritma berjalan, jarak tentatif dari sebuah node v adalah panjang dari jalan terpendek yang ditemukan sejauh waktu tersebut di antara node v dan node permulaan..
Semenjak pada awalnya tidak ada jalan yang diketahui dari vertex manapun daripada sumbernya sendiri (yang mana jarak tempuhnya nol), semua jarak tentatif yang lain diinisiasikan sebagai tak hingga. Lalu atur node awal sebagai node tinjauan.
3. Untuk node yang ditinjau, anggap semua node tetangga belum terkunjungi dan hitung jarak tentatif mereka berdasarkan node yang ditinjau. Bandingkan jarak tentatif yang baru dihitung dengan yang saat ini ditetapkan ke tetangga dan tetapkan jarak yang lebih kecil. Misalnya, jika node A saat ini ditandai dengan jarak 6, dan sisi yang menghubungkannya dengan tetangga B memiliki panjang 2, maka jarak ke B melalui A adalah 6 + 2 = 8. Jika B sebelumnya ditandai dengan jarak yang lebih besar dari 8, maka tetapkan 8. Jika tidak, nilai saat ini tetap disimpan.
4. Ketika kita sudah menetapkan semua tetangga yang belum terkunjungi dengan node yang ditinjau, tandai node yang sedang ditinjau sebagai “telah terkunjungi” (visited) dan hapus dari set node yang belum terkunjungi (unvisited set). Sebuah node yang telah dilabeli “telah terkunjungi” tidak akan dikunjungi lagi.
5. Jika node tujuan telah ditandai sebagai “telah terkunjungi” (ketika merencanakan rute antara dua node spesifik) atau jika nilai jarak tentatif terkecil dari node-node di dalam unvisited set adalah tak hingga (ketika merencanakan traversal total; terjadi ketika tidak ada koneksi antara node awal dengan node tersisa yang belum terkunjungi), maka berhenti. Algoritma selesai.
6. Jika tidak, pilih node belum terkunjungi yang ditandai dengan jarak tentatif terkecil, tetapkan sebagai node terbaru yang ditinjau lalu
ulangi langkah 3.

## Penjelasan design pattern yang dipilih

Structural adalah design pattern yang saya pilih. Software design pattern ini dipergunakan untuk mengatur class dan object yang berbeda untuk membentuk struktur yang lebih besar serta menyediakan fungsionalitas baru. Salah satu pola design pattern ini adalah bridge, dimana bridge adalah structural design pattern yang memungkinkan Anda membagi class berukuran besar atau sekumpulan class yang terkait menjadi dua hierarki terpisah (abstraksi dan implementasi) yang dapat dikembangkan secara independen antara satu dengan lain.

## Letak implementasi design pattern tersebut

Dalam program Adjacency List, class Graph dibagi menjadi private dan public, dimana hierarki yang lebih kecil adalah private yang merupakan abstraksi, sedangkan hierarki lebih besar adalah public yang merupakan implementasi. Sehingga, kedua hal ini dapat membentuk struktur yang lebih besar serta menyediakan fungsionalitas baru.

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
		} dst. 
		
## Alasan pemilihan design pattern tersebut
Karena structural design pattern berorientasi pada fungsionalitas baru, dimana salah satu polanya adalah bridge yang memungkinkan saya untuk menyusun kode secara hierarki dan memiliki fungsi abstraksi dan implementasi yang dapat dikembangkan secara independen antara satu dengan lain.


## Cara menjalankan program
Cara menjalankan program Adjacency List adalah sebagai berikut:
1. Compile and run program tersebut
2. Akan terlihat hasil kompilasi berbentuk adjacency list
2. Masukkan algoritma yang diinginkan berdasarkan nomor kode, tekan enter
4. Masukkan titik start dan titik akhir sesuai nomor kode, tekan enter
5. Akan timbul hasil kompilasi final berupa shortest path berdasarkan algoritma yang dipilih.

Cara menjalankan program Adjacency Matrix adalah sebagai berikut:
1. Compile and run program tersebut
2. Akan terlihat hasil kompilasi berbentuk adjacency matrix
2. Masukkan algoritma yang diinginkan berdasarkan nomor kode, tekan enter
4. Masukkan titik start dan titik akhir sesuai nomor kode, tekan enter
5. Akan timbul hasil kompilasi final berupa shortest path berdasarkan algoritma yang dipilih

## Versi bahasa dan dependency (jika ada) yang digunakan
Tidak ada. 

## Konsep-konsep lain yang kalian gunakan dan keunikan program (jika ada)
Ya, itu tadi :D
