
//kelas Main untuk menguji program
class Main {

    public static void main(String[] args) {
        //membuat objek dari kelas Student
        Student s = new Student("12345678", "Computer Science", 3.5, "Dudung", "Jl. Jalan 123", "081234567890");

        //membuat objek dari kelas Lecturer
        Lecturer l = new Lecturer("23456789", "Software Engineering", "Male", "Jajang", "Jl. Apa aja 456", "082345678901");

        //menggunakan polimorfisme dengan membuat array Person dan menambahkan objek s dan l ke dalam array tersebut
        Person[] people = new Person[2];
        people[0] = s;
        people[1] = l;

        System.out.println();
        //menampilkan informasi dari semua objek di dalam array people
        for (Person p : people) {
            p.showInfo();
            System.out.println();
        }
    }
}
