import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RevenueEntryUI {
    private JFrame frame;
    private JLabel lblAmount;
    private JTextField txtAmount;
    private JButton btnSubmit;

    public RevenueEntryUI() {
        frame = new JFrame("Nhập doanh thu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        lblAmount = new JLabel("Số tiền:");
        txtAmount = new JTextField(10);
        btnSubmit = new JButton("Xác nhận");

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amount = txtAmount.getText();
                // Xử lý doanh thu ở đây, ví dụ lưu vào cơ sở dữ liệu
                JOptionPane.showMessageDialog(frame, "Đã nhập doanh thu: " + amount);
                txtAmount.setText("");
            }
        });

        panel.add(lblAmount);
        panel.add(txtAmount);
        panel.add(btnSubmit);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RevenueEntryUI();
            }
        });
    }
}
