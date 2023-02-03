Program ini merupakan program sederhana dari permainan Animal Kaiser, 2 orang pemain akan bertanding dengan kartunya masing-masing. Animal Kaiser terdiri atas 3 jenis kartu yaitu kartu Animal sebagai main card, kartu Strong sebagai buff card, dan kartu Miracle untuk taruhan akhir jika ada animal card yang kalah.

Dua Animal Card akan bertarung, masing-masing kartu memiliki statistik yang berbeda sesuai animalnya. Setiap animal memiliki strength dan health point. Dua kartu akan di adu dalam 1 ronde untuk memperoleh siapa stat total (setelah menggunakan strong card) akhir yang lebih tinggi dia akan menang dan melihat hasil taruhan di miracle card.

Program ini dijalankan dengan 1 kali compile.

- Inheritance
    Class Card - Super class
    Class animalCard - Sub class
    Class strongCard - Sub class
    Class miracleCard - Sub class

- Polimorfisme
    Program umum karena SuperClass direferensikan ke SubClass

- Mengimplementasikan (minimal 1) design pattern
    Penggunaan method

- Mengimplementasikan (minimal 1) prinsip SOLID
    Liskov Subtitution Principle, sebuah principle yang mengatur desain hirarki pewarisan. Aturan - aturan tersebut antara lain 

    Contravariant & Covariant,
    Contravariant adalah kondisi di mana parameter dari sebuah fungsi yang berada pada SubClass harus memiliki tipe dan jumlah yang sama dengan fungsi yang berada pada SuperClass-nya. Sedangkan Covariant, adalah kondisi pengembalian nilai dari fungsi yang berada pada SubClass dan SuperClass.

    Precondition & PostCondition,
    Precondition adalah tindakan yang harus ada sebelum sebuah proses dijalankan. Sedangkan postcondition sebaliknya, yaitu tindakan yang harus ada ketika sebuah proses selesai dijalankan.

    Invariant, adalah penjelasan dari kondisi suatu proses yang benar sebelum proses tersebut dimulai dan tetap benar setelahnya.

    Constraint, adalah pembatasan yang ditentukan oleh SuperClass terhadap perubahan keadaan sebuah obyek.
