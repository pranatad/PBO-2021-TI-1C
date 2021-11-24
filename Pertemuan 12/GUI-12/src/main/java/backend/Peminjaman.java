/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
import java.util.Date;

/**
 *
 * @author Pranata
 */
public class Peminjaman {

    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    Date tanggalPinjam = new Date();
    Date tanggalKembali = new Date();

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman() {

    }

    public Peminjaman(Anggota anggota, Buku buku, Date tanggalPinjam, Date tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman pinjam = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "     p.idpeminjaman AS idpeminjaman, "
                + "     p.tanggalpinjam AS tanggalpinjam, "
                + "     p.tanggalkembali AS tanggalkembali, "
                + "     b.idbuku AS idbuku, "
                + "     b.judul AS judul, "
                + "     b.penerbit AS penerbit, "
                + "     b.penulis AS penulis, "
                + "     a.idanggota AS idanggota, "
                + "     a.nama AS nama, "
                + "     a.alamat AS alamat, "
                + "     a.telepon AS telepon, "
                + "     FROM peminjaman p "
                + "     LEFT JOIN buku b ON p.idbuku = b.idbuku "
                + "     LEFT JOIN anggota ON p.idanggota = b.idanggota "
                + "     WHERE p.idpeminjaman = '" + id + "'");
        try {
            while (rs.next()) {
                pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getAnggota().setNama(rs.getString("nama"));
                pinjam.getAnggota().setAlamat(rs.getString("alamat"));
                pinjam.getAnggota().setTelepon(rs.getString("telepon"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.getBuku().setJudul(rs.getString("judul"));
                pinjam.getBuku().setPenerbit(rs.getString("penerbit"));
                pinjam.getBuku().setPenulis(rs.getString("penulis"));
                pinjam.setTanggalKembali(rs.getDate("tanggalkembali"));
                pinjam.setTanggalPinjam(rs.getDate("tanggalpinjam"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> Pinjaman = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "     p.idpeminjaman AS idpeminjaman, "
                + "     p.tanggalpinjam AS tanggalpinjam, "
                + "     p.tanggalkembali AS tanggalkembali, "
                + "     b.idbuku AS idbuku, "
                + "     b.judul AS judul, "
                + "     b.penerbit AS penerbit, "
                + "     b.penulis AS penulis, "
                + "     a.idanggota AS idanggota, "
                + "     a.nama AS nama, "
                + "     a.alamat AS alamat, "
                + "     a.telepon AS telepon, "
                + "     FROM peminjaman p "
                + "     LEFT JOIN buku b ON p.idbuku = b.idbuku "
                + "     LEFT JOIN anggota ON p.idanggota = b.idanggota ");
        try {
            while (rs.next()) {
                Peminjaman pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getAnggota().setNama(rs.getString("nama"));
                pinjam.getAnggota().setAlamat(rs.getString("alamat"));
                pinjam.getAnggota().setTelepon(rs.getString("telepon"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.getBuku().setJudul(rs.getString("judul"));
                pinjam.getBuku().setPenerbit(rs.getString("penerbit"));
                pinjam.getBuku().setPenulis(rs.getString("penulis"));
                pinjam.setTanggalKembali(rs.getDate("tanggalkembali"));
                pinjam.setTanggalPinjam(rs.getDate("tanggalpinjam"));

                Pinjaman.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pinjaman;
    }

    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> Pinjaman = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "     p.idpeminjaman AS idpeminjaman, "
                + "     p.tanggalpinjam AS tanggalpinjam, "
                + "     p.tanggalkembali AS tanggalkembali, "
                + "     b.idbuku AS idbuku, "
                + "     b.judul AS judul, "
                + "     b.penerbit AS penerbit, "
                + "     b.penulis AS penulis, "
                + "     a.idanggota AS idanggota, "
                + "     a.nama AS nama, "
                + "     a.alamat AS alamat, "
                + "     a.telepon AS telepon, "
                + "     FROM peminjaman p "
                + "     LEFT JOIN buku b ON p.idbuku = b.idbuku "
                + "     LEFT JOIN anggota ON p.idanggota = b.idanggota "
                + "     WHERE a.nama LIKE '%" + keyword + "%' "
                + "         OR b.judul LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Peminjaman pinjam = new Peminjaman();
                pinjam.setIdpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.getAnggota().setIdanggota(rs.getInt("idanggota"));
                pinjam.getAnggota().setNama(rs.getString("nama"));
                pinjam.getAnggota().setAlamat(rs.getString("alamat"));
                pinjam.getAnggota().setTelepon(rs.getString("telepon"));
                pinjam.getBuku().setIdbuku(rs.getInt("idbuku"));
                pinjam.getBuku().setJudul(rs.getString("judul"));
                pinjam.getBuku().setPenerbit(rs.getString("penerbit"));
                pinjam.getBuku().setPenulis(rs.getString("penulis"));
                pinjam.setTanggalKembali(rs.getDate("tanggalkembali"));
                pinjam.setTanggalPinjam(rs.getDate("tanggalpinjam"));

                Pinjaman.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pinjaman;
    }

    public void save() {
        if (getById(idpeminjaman).getIdpeminjaman() == 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES ("
                    + "         '" + this.getAnggota().getIdanggota() + "', "
                    + "         '" + this.getBuku().getIdbuku() + "', "
                    + "         '" + this.tanggalPinjam + "', "
                    + "         '" + this.tanggalKembali + "', "
                    + "         )";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                    + "     idnggota =    '" + this.getAnggota().getIdanggota() + "', "
                    + "     idbuku =    '" + this.getBuku().getIdbuku() + "', "
                    + "     tanggalpinjam =    '" + this.tanggalPinjam + "', "
                    + "     tanggalkembali =    '" + this.tanggalKembali + "', "
                    + "     WHERE idpeminjaman =  '" + this.idpeminjaman + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }
}
