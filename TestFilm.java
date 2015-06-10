/**
 * Created by TOSHIBA on 6/9/2015.
 */
public class TestFilm {
    public static void main(String[] args) {

        Sutradara hanung = new Sutradara("Hanung Bramantyo",45,'L',"Jakarta");
        System.out.println("Semua data : " + hanung.toString());
        System.out.println("Nama Sutradara : " + hanung.getNamaSutradara());
        System.out.println("Umur Sutradara : " + hanung.getUmurSutradara());
        System.out.println("Jenis Kelamin : " + hanung.getJenisKelamin());
        System.out.println("Alamat Sutradara : " + hanung.getAlamatSutradara());
    }
}