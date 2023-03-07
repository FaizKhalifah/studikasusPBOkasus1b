public class Hewan {
    private String namaHewan;
    private String noPelanggan;
    private String warnaHewan;
    private String tahunKelahiran;
    private String jenisHewan;
    private int lastTreatment;

    public Hewan(){

    }

    public Hewan(String namaHewan, String noPelanggan, String warnaHewan, String tahunKelahiran,
                 String jenisHewan, int lastTreatment){
        this.namaHewan=namaHewan;
        this.noPelanggan=noPelanggan;
        this.warnaHewan=warnaHewan;
        this.tahunKelahiran=tahunKelahiran;
        this.jenisHewan=jenisHewan;
        this.lastTreatment=lastTreatment;
    }

    public void cekKesehatan(){
        if(this.lastTreatment<5){
            System.out.println("Hewan masih dalam perawatan normal");
        }
        else if  (this.lastTreatment<10) {
            System.out.println("Hewan perlu perawatan lebih intensif");
        }
        else if (this.lastTreatment<20) {
            System.out.println("Hewan dalam kondisi kritis");
        }
        else {
            System.out.println("Hewan perlu segera ditolong");
        }
    }

    public void cetakInfo(){
        System.out.println(this.namaHewan);
        System.out.println(this.noPelanggan);
        System.out.println(this.warnaHewan);
        System.out.println(this.tahunKelahiran);
        System.out.println(this.jenisHewan);
        System.out.println(this.lastTreatment);
    }

   public void treatmentKhusus(){
        if(this.lastTreatment>=15){
            this.lastTreatment=this.lastTreatment-15;
        }
        else {
            System.out.println("Hewan belum bisa mendapatkan treatment khusus");
        }
    }

    public void treatmentBiasa(){
        if(this.lastTreatment>=10){
            this.lastTreatment=this.lastTreatment-10;
        }
        else {
            System.out.println("Belum disarankan untuk dirawat");
        }
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNoPelanggan(String noPelanggan) {
        this.noPelanggan = noPelanggan;
    }

    public String getNoPelanggan() {
        return noPelanggan;
    }

    public void setWarnaHewan(String warnaHewan) {
        this.warnaHewan = warnaHewan;
    }

    public String getWarnaHewan() {
        return warnaHewan;
    }

    public void setTahunKelahiran(String tahunKelahiran) {
        this.tahunKelahiran = tahunKelahiran;
    }

    public String getTahunKelahiran() {
        return tahunKelahiran;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setLastTreatment(int lastTreatment) {
        this.lastTreatment = lastTreatment;
    }
}
