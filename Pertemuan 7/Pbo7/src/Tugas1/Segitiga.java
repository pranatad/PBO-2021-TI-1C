/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Pranata
 */
public class Segitiga {

    public int sudut;
    public int keliling;
    public double keliling1;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Sudut Total : " + sudut);
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Sudut Total : " + sudut);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling Total : " + keliling);
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        keliling1 = sisiA + sisiB;
        System.out.println("Keliling : " + keliling1);
        return keliling1;
    }
}
