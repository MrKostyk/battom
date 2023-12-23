import javax.swing.*;

public class ButtonTransformText extends JFrame {
    private final JTextField textField;

    public ButtonTransformText() {
        setTitle("Text Transformation");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        textField = new JTextField();
        add(textField, "Center");


        JButton toUpperCaseButton = new JButton("To Uppercase");
        toUpperCaseButton.addActionListener(e -> {
            String text = textField.getText();
            textField.setText(text.toUpperCase());
        });
        add(toUpperCaseButton, "North");


        JButton toLowerCaseButton = new JButton("To Lowercase");
        toLowerCaseButton.addActionListener(e -> {
            String text = textField.getText();
            textField.setText(text.toLowerCase());
        });
        add(toLowerCaseButton, "South");


        JButton showImageButton = new JButton("Show Image");
        showImageButton.addActionListener(e -> JOptionPane.showMessageDialog(ButtonTransformText.this, textField.getText()));
        add(showImageButton, "East");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ButtonTransformText().setVisible(true));
    }
}
