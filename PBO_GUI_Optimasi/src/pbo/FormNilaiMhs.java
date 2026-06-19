package pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FormNilaiMhs extends JFrame {

    private JTextField nimField;
    private JTextField namaField;
    private JTextField utsField;
    private JTextField uasField;
    private JTextField tugasField;

    private JTextArea hasilArea;

    public FormNilaiMhs() {

        setTitle("Form Nilai Mahasiswa");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(7, 2));

        add(new JLabel("NIM"));
        nimField = new JTextField();
        add(nimField);

        add(new JLabel("Nama"));
        namaField = new JTextField();
        add(namaField);

        add(new JLabel("Nilai UTS"));
        utsField = new JTextField();
        add(utsField);

        add(new JLabel("Nilai UAS"));
        uasField = new JTextField();
        add(uasField);

        add(new JLabel("Nilai Tugas"));
        tugasField = new JTextField();
        add(tugasField);

        JButton prosesBtn =
                new JButton("Proses");

        prosesBtn.addActionListener(
                this::prosesNilai);

        add(prosesBtn);

        hasilArea = new JTextArea();
        add(new JScrollPane(hasilArea));

        setVisible(true);
    }

    private void prosesNilai(
            ActionEvent evt) {

        try {

            Mhs mhs = new Mhs(

                    nimField.getText(),
                    namaField.getText(),

                    Double.parseDouble(
                            utsField.getText()),

                    Double.parseDouble(
                            uasField.getText()),

                    Double.parseDouble(
                            tugasField.getText())
            );

            hasilArea.setText(
                    "Nilai Akhir : "
                            + mhs.nilaiAkhir()
                            + "\nHuruf : "
                            + mhs.nilaiHuruf()
                            + "\nPredikat : "
                            + mhs.predikat()
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Input tidak valid"
            );
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                FormNilaiMhs::new
        );
    }
}