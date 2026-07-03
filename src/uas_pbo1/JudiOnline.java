package uas_pbo1;

public class JudiOnline extends Permainan {
    private double persentaseMenang;

    public JudiOnline(String namaSistem, double persentaseMenang) {
        super(namaSistem);
        this.persentaseMenang = persentaseMenang;
    }

    public double getPersentaseMenang() {
        return persentaseMenang;
    }

    public void setPersentaseMenang(double persentaseMenang) {
        this.persentaseMenang = persentaseMenang;
    }

    @Override
    public void tampilkanEdukasi() {
        super.tampilkanEdukasi();
        System.out.println("Fakta: Persentase kemenangan awal disetel cuma " + (persentaseMenang * 100) + "%");
        System.out.println("Peringatan: Sistem bakal nyedot saldo pelan-pelan!");
    }

    public void bongkarTrik(int jumlahSpin) {
        String[] riwayat = new String[jumlahSpin];
        int menang = 0;
        int kalah = 0;

        System.out.println("\n--- MULAI SIMULASI ---");

        for (int i = 0; i < jumlahSpin; i++) {
            double acak = Math.random();

            if (acak < this.persentaseMenang) {
                riwayat[i] = "Spin " + (i + 1) + " -> MENANG (Cuma pancingan)";
                menang++;
                // sistem curang: peluang menang diturunin drastis setelah dikasih menang sekali
                this.persentaseMenang = this.persentaseMenang * 0.5; 
            } else {
                riwayat[i] = "Spin " + (i + 1) + " -> KALAH (Sistem nyedot uang)";
                kalah++;
            }
        }

        System.out.println("\n--- BUKTI LOG ---");
        for (String log : riwayat) {
            System.out.println(log);
        }

        System.out.println("\n--- HASIL AKHIR ---");
        System.out.println("Menang : " + menang + " kali");
        System.out.println("Kalah  : " + kalah + " kali");
    }
}
