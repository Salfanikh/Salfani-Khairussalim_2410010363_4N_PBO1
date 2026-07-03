# 🎰 Proyek Akhir Pemrograman Berbasis Objek 1
## Simulasi Edukasi Algoritma Judi Online (Slot) Menggunakan Java

> **Mata Kuliah:** Pemrograman Berbasis Objek 1  
> **Bahasa Pemrograman:** Java  
> **Jenis Proyek:** Simulasi Edukasi

---

# 📖 Deskripsi Proyek

Proyek ini merupakan aplikasi simulasi yang dibuat sebagai tugas akhir mata kuliah **Pemrograman Berbasis Objek 1**.

Aplikasi bertujuan memberikan edukasi mengenai cara kerja algoritma pada sistem judi online, khususnya permainan **slot**, dengan memperlihatkan bagaimana mekanisme *"Bandar Selalu Menang"* bekerja.

Pengguna dapat memasukkan jumlah **spin (putaran)**, kemudian program akan mensimulasikan proses permainan menggunakan algoritma yang sengaja memanipulasi peluang kemenangan (**RTP palsu**) sehingga peluang pemain menang semakin kecil seiring berjalannya permainan.

Selain hasil simulasi, aplikasi juga menampilkan riwayat permainan sehingga pengguna dapat memahami bahwa kemenangan awal sering digunakan sebagai umpan sebelum peluang kemenangan diturunkan secara bertahap.

---

# 🎯 Tujuan Proyek

- Mengimplementasikan konsep-konsep Pemrograman Berbasis Objek (OOP) dalam Java.
- Memberikan simulasi mengenai mekanisme algoritma yang digunakan pada judi online.
- Menjadi media edukasi mengenai bahaya judi online melalui pendekatan pemrograman.

---

# 🛠 Konsep OOP yang Diimplementasikan

## 1. Class

Class merupakan blueprint atau cetakan untuk membuat objek.

Pada proyek ini terdapat tiga class utama:

- `Permainan`
- `JudiOnline`
- `EdukasiJudol`

```java
public class Permainan {
    ...
}

public class JudiOnline extends Permainan {
    ...
}

public class EdukasiJudol {
    ...
}
```

---

## 2. Object

Object adalah instance dari sebuah class.

Contoh pembuatan object:

```java
JudiOnline slot = new JudiOnline("Mesin Slot Settingan", 0.15);
```

---

## 3. Atribut

Atribut merupakan variabel yang dimiliki oleh suatu class.

Contoh:

```java
private String namaSistem;
private double persentaseMenang;
```

---

## 4. Constructor

Constructor dijalankan ketika object pertama kali dibuat.

```java
public Permainan(String namaSistem) {
    this.namaSistem = namaSistem;
}

public JudiOnline(String namaSistem, double persentaseMenang) {
    super(namaSistem);
    this.persentaseMenang = persentaseMenang;
}
```

---

## 5. Mutator (Setter)

Method setter digunakan untuk mengubah nilai atribut.

```java
public void setNamaSistem(String namaSistem) {
    this.namaSistem = namaSistem;
}

public void setPersentaseMenang(double persentaseMenang) {
    this.persentaseMenang = persentaseMenang;
}
```

---

## 6. Accessor (Getter)

Method getter digunakan untuk mengambil nilai atribut.

```java
public String getNamaSistem() {
    return namaSistem;
}

public double getPersentaseMenang() {
    return persentaseMenang;
}
```

---

## 7. Encapsulation

Encapsulation diterapkan dengan menjadikan atribut bersifat `private`, sehingga hanya dapat diakses melalui getter dan setter.

```java
private String namaSistem;
private double persentaseMenang;
```

---

## 8. Inheritance

Inheritance memungkinkan sebuah class mewarisi atribut dan method dari class lain.

```java
public class JudiOnline extends Permainan {
    ...
}
```

---

## 9. Polymorphism (Method Overriding)

Polymorphism diterapkan menggunakan **method overriding**, yaitu method pada class turunan menimpa method milik class induk.

```java
@Override
public void tampilkanEdukasi() {
    super.tampilkanEdukasi();
    System.out.println("Fakta: Persentase kemenangan awal disetel cuma " + (persentaseMenang * 100) + "%");
}
```

---

## 10. Seleksi (If-Else)

Digunakan untuk menentukan apakah pemain menang atau kalah berdasarkan probabilitas.

```java
if (acak < this.persentaseMenang) {
    riwayat[i] = "Spin " + (i + 1) + " -> MENANG (Cuma pancingan)";
    menang++;
    this.persentaseMenang = this.persentaseMenang * 0.5;
} else {
    riwayat[i] = "Spin " + (i + 1) + " -> KALAH (Sistem nyedot uang)";
    kalah++;
}
```

---

## 11. Perulangan (Loop)

Menggunakan `for` untuk melakukan simulasi sebanyak jumlah spin dan mencetak seluruh riwayat permainan.

```java
for (int i = 0; i < jumlahSpin; i++) {
    ...
}

for (String log : riwayat) {
    System.out.println(log);
}
```

---

## 12. Input Output (IO Sederhana)

Menggunakan `Scanner` sebagai input dan `System.out.print()` untuk output.

```java
Scanner input = new Scanner(System.in);

System.out.print("Mau coba berapa spin? (masukkan angka): ");

int spin = input.nextInt();
```

---

## 13. Array

Array digunakan untuk menyimpan seluruh riwayat hasil permainan.

```java
String[] riwayat = new String[jumlahSpin];
```

---

## 14. Error Handling

Menggunakan `try-catch-finally` agar program tidak berhenti ketika pengguna memasukkan input yang salah.

```java
try {

    int spin = input.nextInt();

} catch (InputMismatchException e) {

    System.out.println("\nError: Masukin angka yang bener dong, jangan huruf!");

} catch (Exception e) {

    System.out.println("\nError sistem: " + e.getMessage());

} finally {

    input.close();

}
```

---

# 📋 Fitur Program

- Simulasi mesin slot.
- Input jumlah spin dari pengguna.
- Simulasi peluang kemenangan (RTP).
- Manipulasi peluang kemenangan setelah pemain menang.
- Menampilkan riwayat setiap spin.
- Menghitung total menang dan kalah.
- Menampilkan pesan edukasi mengenai bahaya judi online.
- Validasi input menggunakan Exception Handling.

---

# 📊 Penilaian Proyek

| No | Materi | Nilai |
|:--:|-----------------|:----:|
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Atribut | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | Input Output Sederhana | 10 |
| 13 | Array | 15 |
| 14 | Error Handling | 15 |
| | **TOTAL** | **100** |

---

# 📂 Struktur Program

```
src/
│
├── Permainan.java
├── JudiOnline.java
└── EdukasiJudol.java
```

---

# ▶️ Cara Menjalankan Program

1. Buka project menggunakan IDE Java (NetBeans, IntelliJ IDEA, atau Eclipse).
2. Jalankan class **EdukasiJudol.java**.
3. Masukkan jumlah spin yang ingin disimulasikan.
4. Program akan menampilkan hasil simulasi beserta riwayat permainan.
5. Amati bagaimana peluang kemenangan berubah sebagai bentuk edukasi mengenai sistem judi online.

---

# 👨‍💻 Pembuat

| Keterangan | Isi |
|------------|------------------------|
| **Nama** | Salfani Khairussalim |
| **NPM** | 2410010363 |
| **Kelas** | 4N REG PAGI BJM |
| **Mata Kuliah** | Pemrograman Berbasis Objek 1 |

---

## ⚠️ Disclaimer

Program ini dibuat **semata-mata untuk tujuan edukasi dan pembelajaran konsep Pemrograman Berbasis Objek (OOP)**.

Simulasi yang ditampilkan tidak mewakili algoritma sebenarnya dari platform perjudian mana pun dan tidak dimaksudkan untuk mendukung, mempromosikan, atau mengajarkan praktik perjudian. Tujuan utama proyek ini adalah meningkatkan pemahaman mengenai konsep OOP sekaligus memberikan edukasi tentang risiko dan dampak negatif judi online.
