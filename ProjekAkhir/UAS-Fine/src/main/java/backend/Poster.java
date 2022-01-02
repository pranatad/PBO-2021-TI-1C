/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Administrator
 */
public class Poster extends TambahPoster {

    private Movie movie = new Movie();

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setSewa(Penyewaan sewa) {
        this.sewa = sewa;
    }
    private Penyewaan sewa = new Penyewaan();
    private boolean pakaiposter = false;

    public Poster() {
        this.hargaposter = 20000;
    }

    @Override
    public void tambahPoster() {
        this.pakaiposter = true;

    }
    public void tambahPoster(int harga) {
        this.hargaposter = 0;
    }

    @Override
    public int totalPembayaran() {
        if(!pakaiposter){
            this.hargaposter = 0;
        }
        return (sewa.getLamasewa() * movie.getHarga()) + this.hargaposter;
    }

}
