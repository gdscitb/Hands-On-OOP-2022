# Hands On OOP

## Deskripsi Program
RockPaperScissor adalah sebuah program game "gunting-batu-kertas" antara 2 player.

### Penjelasan File
Terdiri atas 4 file dengan fungsinya sebagai berikut:
1. GameInformer.cs : menyimpan fungsi-fungsi yang berhubungan langsung dengan player.
2. Operator.cs : menyimpan fungsi-fungsi mekanisme umum game seperti membuat player dan memulai game.
3. Player.cs : menyimpan data player.
4. Main.cs : sebagai titik start.

### Aturan Game
1. Setiap player memiliki role masing-masing (Attack, Balance, Defense)
2. Setiap player yang menang akan mendapatkan peningkatan pada atribut & attack bonus dan akan terkena damage sesuai nilai defense musuh.
3. Setiap player yang kalah akan terkena damage sesuai attack musuh dan attack bonus akan direset.
4. Jika terjadi seri, maka tidak ada atribut yang berubah.
5. Ronde terus berlangsung hingga salah satu health dari player <= 0.

### Role
1. Gambler : menebak hasil pertandingan antar 2 bot.
2. Player : bermain sebagai salah satu player yang bertanding melawan bot.

## Design Pattern
1. Factory
    Definisi : membuat object tanpa memperlihatkan proses pembuatannya secara langsung pada client. 
    Penerapan : pembuatan object player.
    Alasan : untuk memudahkan client membuat object dengan jenis tertentu.
2. Interpreter 
    Definisi : membuat suatu operasi dalam suatu fungsi agar lebih mudah dipahami. 
    Penerapan : fungsi membuat player, membuat bot, dll
    Alasan : untuk memudahkan pembacaan kode.

## Cara Menjalankan Program
1. Pilih Role (Player atau Gambler).
### Gambler
2. Membuat tebakan player yang mana yang akan menang.
### Player
2. Memilih tipe player (Attack, Balance, Defense).
3. Memilih sign (Rock, Paper, Scissor) dalam setiap ronde.

## Bahasa yang Digunakan
C#

## Keunikan Program
1. Telah memenuhi seluruh persyaratan wajib maupun bonus.
2. Menggunakan encapsulation protected agar fungsi pada player tidak bisa dipakai oleh bot.