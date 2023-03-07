public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        Hewan [] kumpulanHewan = new Hewan[a];
        input.nextLine();
        for (int i =0; i<a;i++ ){
            String nama = input.nextLine();
            String id = input.nextLine();
            String warna = input.nextLine();
            String tahun = input.nextLine();
            String jenis = input.nextLine();
            int lastTreatment = input.nextInt();
            input.nextLine();
            kumpulanHewan[i] = new Hewan(nama,id,warna,tahun,jenis,lastTreatment);
            kumpulanHewan[i].cetakInfo();
            kumpulanHewan[i].kasihMakan();
        }
    }
}
