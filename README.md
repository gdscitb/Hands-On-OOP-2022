## Deskripsi Program
Program saya yang berjudul "Monster Wave" merupakan sebuah program game dimana kita dihadang oleh monster yang terus bertubi tubi menyerang kita.Di program ini, user dapat menginput "A" (Singkatan untuk Attack) nantinya program akan melakukan "serangan" ke monster dan mengurangi nyawanya serta input "D" untuk menaikan pertahananan  kita (Defense). Tetapi ada plot twist yaitu monster dapat menahan serangan kita dan adanya kemungkinan semua serangan kita tertangkis dan nyawa monster tidak akan berkurang, sama halnya dengan kita menangkis serangan monster.Ketika monster berhasil dikalahkan, user akan mendapatkan XP(Experience point) yang nantinya dapat digunakan untuk menaikan stats kita bisa berupa Attack atau Defense ketika user menyentuh titik XP maksimal dan meraih level up.Monster akan terus datang bertubi tubi dan nyawanya akan bertambah terus serta stats mereka akan naik jika kita juga level up, jadi seperti genre game "rogue-like".

## Design Pattern yang dipilih
Dalam program ini, untuk design pattern saya memilih Behavioral Patterns karena pattern ini cara paling paling efektik untuk komunikasi antara tiap class / object yang akan terjadi secara terus menerus

## Letak Implementasi
Banyak implementasi dari pattern ini seperti ketika user menginput A, maka program dari class Battle akan memanggil class player dan mengambil method Attack() yang berisi untuk mengurangi darah lawan sesuai interval dari 1 hingga attack maksimal dari stats suatu player / monster.Sama halnya juga ketika menaikan Defense user (input "D") dan ketika naik level program meminta user menginput baik A atau D sesuai stats yang ingin dinaikan (disini program akan memanggil class player dan mengambil method sesuai yang diminta)

## Alasan memilih design pattern tersebut
Tentu saja dengan memilih pattern ini, saya dapat mengurangi kerumitan komunikasi atau pemanggilan antara object object yang sudah saya buat.Tak hanya mengurangi kerumitan, tetapi membuat program saya lebih efisien dan flexibel.

## Cara menjalankan program
Program ini dijalankan cukup mudah karena sudah banyak informasi yang terpampang dalam console nya.User ketika run program untuk pertama kalinya akan ditampilan HP user, HP monster, Stats (Attack Defense) serta XP dan level.User dapat menginput "A" maupun "D" sesuai keinginan atau strategi sendiri, lalu monster akan giliran menyerang anda.Scale penyerangan ini berdasarkan interval bergantung pada stats anda(jika Attack anda 4, maka attack antara 1-4.Jika defense 10, maka kemungkinan tangkisan damage sebesar 1 hingga 10).Lalu jika anda berhasil mengalahkan monster, yaitu ketika menyentuk HP monster sebesar 0, maka anda akan menang dan mendapatkan HP tambahan sebesar 20 dan segelintir XP(random dari 30-70).Jika XP anda menyentuh cap XP , maka anda akan naik level dan bisa menaikan stats user sesuai yang diinginkan serta mendapatkan bonus HP sebesar 50.Namun ingat, ketika anda makin kuat, monster pun juga makin kuat.

## Versi Bahasa
C Sharp (C# 9) Target Framework .NET 5.0



