import javax.swing.*;

public class CustomerFormGUI {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Customer Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Tạo các JLabel và JTextField cho từng trường thông tin
        JLabel nameLabel = new JLabel("Họ và tên:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Tuổi:");
        JTextField ageField = new JTextField();

        JLabel addressLabel = new JLabel("Địa chỉ:");
        JTextField addressField = new JTextField();

        JLabel phoneLabel = new JLabel("Số điện thoại:");
        JTextField phoneField = new JTextField();

        // Thêm các thành phần vào JFrame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(phoneLabel);
        frame.add(phoneField);

        // Tạo nút Submit
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String fullName = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String address = addressField.getText();
            String phoneNumber = phoneField.getText();

            // Xử lý thông tin khách hàng ở đây (ví dụ: in ra console)
            System.out.println("Thông tin khách hàng:");
            System.out.println("Họ và tên: " + fullName);
            System.out.println("Tuổi: " + age);
            System.out.println("Địa chỉ: " + address);
            System.out.println("Số điện thoại: " + phoneNumber);
        });
        frame.add(submitButton);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}