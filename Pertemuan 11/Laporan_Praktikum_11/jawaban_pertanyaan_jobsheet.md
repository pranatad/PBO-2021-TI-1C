# Jawaban Pertanyaan Jobsheet 11

### Nama : Pranata Dito Fitriyansyah

### Kelas : 2C

### No. Absen : 17

## Pertanyaan Percobaan 1 :

1. Class apa sajakah yang merupakan turunan dari class Employee?
2. Class apa sajakah yang implements ke interface Payable?
3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class
InternshipEmploye) ?
4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objekpEmp (merupakan objek dari class
PermanentEmployee) dan objek eBill (merupakan objek dari class
ElectricityBill) ?
5. Coba tambahkan sintaks:
        p = iEmp;
        e = eBill;
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang
menyebabkan error?
6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!

## Jawaban :
1. InternshipEmployee dan Permanent Employee
2. PermanentEmployee dan ElectricityBill
3. Dikarenakan class pEmp dan iEmp meng-extends class e (Employee)
4. Dikarenakan class pEmp dan eBill meng-implemen class p (Payable)
5. 
        
        p = iEmp; 
Error dikarenakan class iEmp(InternshipEmployee) tidak mengimplemen class p(Payable)
        
        e = eBill;
Error dikarenakan class eBill(ElectricityBill) tidak mengextends class e(Employee)
6. Polimorfisme yaitu konsep di dalam pbo yang dimana sebuah beberapa class memiliki method yang sama

## Pertanyaan Percobaan 2 :
1. Perhatikan class Tester2 di atas, mengapa pemanggilan
e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?
2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak?
3. Jadi apakah yang dimaksud dari virtual methodinvocation? Mengapa disebut virtual?

## Jawaban :
1. Dikarenakan pEmp memiliki parameter Dedik(String) dan 500(int), dan mengapa bisa keluar output yang sama, dikarenakan class pEmp mengextends class Exployee dan diatas sout juga terdapat e = pEmp;
2. Dikarenakan objek pEmp dideklarasikan dari class PermanentEmployee yang mengextends class Employee
3. Dikarenakan diantara method yang dikenali
oleh compiler dan method yang dijalankan oleh JVM berbeda

## Pertanyaan Percobaan 3 :
1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ?
2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ?
3. Perhatikan baris ke-10, mengapa terjadi error?

## Jawaban :
1. Dikarenakan pEmp dan iEmp merupakan turunan dari class e(Employee)
2. Dikarenakan pEmp dan eBill mengimplements class p (Payable)
3. Terjadi error dikarenakan class eBill(ELectricityBill) tidak mengextends class Employee, jika di class ElectricityBill ditambahkan extends Employee, maka tidak error

Modifikasi Class ElectricityBill
<img src="percobaan3 (1).png">

Class tester 3
<img src="percobaan3 (2).png">

## Pertanyaan Percobaan 4 :
1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable?Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee?
2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?
3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp); Mengapa terjadi error?
4. Perhatikan class Owner, diperlukan untuk apakah sintaks p
instanceof ElectricityBill pada baris ke-6 ?
5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill ?

## Jawaban :
1. Dikarenakan eBill dan pEmp mengeimplements class Payable dan method pay yang dimiliki class Payable juga dipanggil oleh class Owner
2. Agar owner bisa memanggil method pay yang di dalamnynya sudah diimpelen kan oleh class ElectricityBill dan PermanentEmployee
3. Error dikarenakan class iEmp(InternshipEmployee) tidak mengimplements class Payable, namun jika di dalam class InternshipEmployee dimodif impelents Payable, maka tidak akan terdaji error;

        public class InternshipEmployee extends Employee implements Payable{
4. Diguanakan untuk mengecek apakah objek pay Payable p itu merupakan hasil instansiasi dari kelas ElectricityBill
5. Dikarenakan objek eb mengimplements class Payable