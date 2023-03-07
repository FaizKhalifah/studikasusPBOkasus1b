public class Main {
    public static void main(String[] args) {
    Hewan hewan1 = new Hewan();
    hewan1.setNamaHewan("Linggau");
    hewan1.setNoPelanggan("24543535345");
    hewan1.setWarnaHewan("Cokelat");
    hewan1.setTahunKelahiran("2018");
    hewan1.setJenisHewan("Kucing");
    hewan1.setLastTreatment(20);
    hewan1.cetakInfo();
        System.out.println();
    hewan1.cekKesehatan();
        System.out.println();
    hewan1.treatmentKhusus();
        System.out.println();
    hewan1.cetakInfo();
        System.out.println();

    Hewan hewan2 = new Hewan("Bodas","2342433242","putih","2020","kelinci",11);
    hewan2.cetakInfo();
        System.out.println();
    hewan2.cekKesehatan();
        System.out.println();
    hewan2.treatmentKhusus();
        System.out.println();
    hewan2.treatmentBiasa();
    hewan2.cetakInfo();
    }
}