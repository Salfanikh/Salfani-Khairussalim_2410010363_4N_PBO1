package uas_pbo1;

public class Permainan {
    private String namaSistem;

    public Permainan(String namaSistem) {
        this.namaSistem = namaSistem;
    }

    public String getNamaSistem() {
        return namaSistem;
    }

    public void setNamaSistem(String namaSistem) {
        this.namaSistem = namaSistem;
    }

    public void tampilkanEdukasi() {
        System.out.println("Menganalisa Sistem: " + namaSistem);
    }
}
