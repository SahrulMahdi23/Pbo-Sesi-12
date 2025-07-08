import javax.swing.*;
import java.awt.*;

public class KalkulatorSederhana extends JFrame {
    private JTextField textField;

    public KalkulatorSederhana() {
        setTitle("Kalkulator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // JTextField untuk menampilkan input
        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        // Panel untuk tombol-tombol
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5, 5, 5)); // 4 baris, 5 kolom

        // Daftar tombol
        String[] tombol = {
            "1", "2", "3", "4", "5",
            "7", "8", "9", "0", "+",
            ".", "*", "=", "/", "%",
            "Mod", "-", "C", "Exit"
        };

        for (String t : tombol) {
            JButton btn = new JButton(t);
            btn.addActionListener(e -> {
                if (t.equals("Exit")) {
                    System.exit(0);
                } else {
                    textField.setText(textField.getText() + t);
                }
            });
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KalkulatorSederhana();
    }
}
