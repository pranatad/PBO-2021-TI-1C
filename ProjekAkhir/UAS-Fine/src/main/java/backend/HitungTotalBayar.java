/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Administrator
 */
public class HitungTotalBayar extends Poster implements IBayar {
    private Movie movie = new Movie();
    private Penyewaan sewa = new Penyewaan();

    public Movie getMovie() {
        return movie;
    }

    @Override
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Penyewaan getSewa() {
        return sewa;
    }

    public void setSewa(Penyewaan sewa) {
        this.sewa = sewa;
    }

    @Override
    public int totalPembayaran() {
        return sewa.getLamasewa() * movie.getHarga();
    }
    
    public void tambahPoster(int harga) {
        this.hargaposter = 0;

    }
}
