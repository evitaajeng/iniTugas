/**
 * Created by TOSHIBA on 6/9/2015.
 */
public class Film {

    //attribut
    private String namaFilm;
    private String jenisFilm;
    private double hargaFilm;
    private Sutradara sutradara;

    public Film(String namaFilm, String jenisFilm, double hargaFilm, Sutradara sutradara) {
        this.namaFilm = namaFilm;
        this.jenisFilm = jenisFilm;
        this.hargaFilm = hargaFilm;
        this.sutradara = sutradara;
    }

    public Film(String namaFilm, String jenisFilm) {
        this.namaFilm = namaFilm;
        this.jenisFilm = jenisFilm;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public String getJenisFilm() {
        return jenisFilm;
    }

    public void setJenisFilm(String jenisFilm) {
        this.jenisFilm = jenisFilm;
    }

    public Film(double hargaFilm) {
        this.hargaFilm = hargaFilm;
    }

    public double getHargaFilm() {
        return hargaFilm;
    }

    public void setHargaFilm(double hargaFilm) {
        this.hargaFilm = hargaFilm;
    }

    @Override
    public String toString() {
        return "Film{" +
                "namaFilm='" + namaFilm + '\'' +
                ", jenisFilm='" + jenisFilm + '\'' +
                ", hargaFilm=" + hargaFilm +
                '}';
    }
}
