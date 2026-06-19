package pbo;

public class Mhs {

    private double uts;
    private double uas;
    private double tugas;

    public Mhs(
            String nim,
            String nama,
            double uts,
            double uas,
            double tugas) {

        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }

    public double nilaiAkhir() {

        return (uts * 0.3)
                + (uas * 0.4)
                + (tugas * 0.3);
    }

    public String nilaiHuruf() {

        double na = nilaiAkhir();

        if (na >= 85)
            return "A";
        else if (na >= 70)
            return "B";
        else if (na >= 60)
            return "C";
        else if (na >= 50)
            return "D";
        else
            return "E";
    }

    public String predikat() {

        switch (nilaiHuruf()) {

            case "A":
                return "Istimewa";

            case "B":
                return "Baik";

            case "C":
                return "Cukup";

            case "D":
                return "Kurang";

            default:
                return "Gagal";
        }
    }
}