# Jawaban Pertanyaan Jobsheet 7

### Nama : Pranata Dito Fitriyansyah

### Kelas : 2C

### No. Absen : 17

## > Pertanyaan dan Jawaban Latihan 4.1 4.2

        public class PerkalianKu {

    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }

4.1 Dari source coding diatas terletak dimanakah overloading?

Jawab : Terdapat pada 2 method void perkalian, yang satu memiliki 2 parameter dengan tipe int dan yang kedua memiliki 3 parameter dengan tipe yang sama yaitu int

4.2 Jika terdapat overloading ada berapa jumlah parameter yang berbeda?

Jawab : Yang satu memiliki 2 paramter dan yang kedua memiliki 3 paramter, 2 method ini memiliki tipe parameter yang sama yaitu int

## > Pertanyaan dan Jawaban Latihan 4.3 4.4

        public class PerkalianKu {

    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }

4.3 Dari source coding diatas terletak dimanakah overloading?

Jawab : Terdapat pada 2 method yaitu perkalian, sama sama memiliki 2 parameter, namun berbeda tipe

4.4 Jika terdapat overloading ada berapa tipe parameter yang berbeda?

Jawab : Perbedaannya yaitu jika method yang atas memiliki 2 parameter bertipe int, sedangkan method yang bawah memiliki 2 parameter bertipe double

## > Pertanyaan dan Jawaban Latihan 4.5 4.6

        public class Ikan {

    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
        public class Piranha extends Ikan {

    @Override
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }

    public class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swim();
        b.swim();
    }

4.5 Dari source coding diatas terletak dimanakah overriding?

Jawab : Terdapat pada method swim pada Class Piranha

4.6 Jabarkanlah apabila sourcoding diatas jika terdapat overriding?

Jawab : Di dalam kelas Ikan terdapat method swim dengan output Ikan Bisa berenang, kemudian di dalam kelas Piranha juga terdapat method swim dengan output piranha bisa makan daging, alhasil terdapat method yang sama yang akhirnya menghasilkan overriding
