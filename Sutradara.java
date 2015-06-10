/**
 * Created by TOSHIBA on 6/9/2015.
 */
public class Sutradara {

    private String namaSutradara;
    private int umurSutradara;
    private char jenisKelamin;
    private String alamatSutradara;

    public Sutradara(String namaSutradara, int umurSutradara, char jenisKelamin, String alamatSutradara) {
        this.namaSutradara = namaSutradara;
        this.umurSutradara = umurSutradara;
        this.jenisKelamin = jenisKelamin;
        this.alamatSutradara = alamatSutradara;
    }

    public String getNamaSutradara() {
        return namaSutradara;
    }

    public void setNamaSutradara(String namaSutradara) {
        this.namaSutradara = namaSutradara;
    }

    public int getUmurSutradara() {
        return umurSutradara;
    }

    public void setUmurSutradara(int umurSutradara) {
        this.umurSutradara = umurSutradara;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamatSutradara() {
        return alamatSutradara;
    }

    public void setAlamatSutradara(String alamatSutradara) {
        this.alamatSutradara = alamatSutradara;
    }

    @Override
    public String toString() {
        return "Sutradara{" +
                "namaSutradara='" + namaSutradara + '\'' +
                ", umurSutradara=" + umurSutradara +
                ", jenisKelamin=" + jenisKelamin +
                ", alamatSutradara='" + alamatSutradara + '\'' +
                '}';
    }
}