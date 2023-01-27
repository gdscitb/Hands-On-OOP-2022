# Hands On OOP
Hi, jadi disini saya bikin game ping pong menggunakan oop dengan bahasa C++ 

# Deskripsi program
Program ini adalah program sederhana mengimplementasian oop berbentuk game pong yang menggunakan C++ dan SMFL

# Requirements
- C++14
- SFML (x32 version)

# Cara menjalankan program di Visual Studio

Buka project, trs ke **"Project -> Properties..."**:
- Pilih **"All configurations"** di **"Configuration"** section;
- Di **"C/C++ -> General -> Additional include directories"** section pilih "include" directory dar library SFML;
- Di **"Linker -> General -> Additional library directories"** section pilih "lib" directory dari library SFML;
- Pilih **Debug** di **Configuration** section;
- Lalu **"Linker -> Input -> Additional dependencies"** section pilih string:
```bash
sfml-graphics-d.lib;sfml-window-d.lib;sfml-system-d.lib;sfml-network-d.lib;sfml-audio-d.lib;
```