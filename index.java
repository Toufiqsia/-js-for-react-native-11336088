import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreationWeek extends JFrame implements ActionListener {
    private JTextField dayInput;
    private JTextArea resultArea;
    private JButton showButton;

    public CreationWeek() {
        setTitle("Creation Week");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel promptLabel = new JLabel("Enter the day of the creation week (1-7): ");
        promptLabel.setBounds(10, 10, 300, 30);
        add(promptLabel);

        dayInput = new JTextField();
        dayInput.setBounds(10, 50, 100, 30);
        add(dayInput);

        showButton = new JButton("Show");
        showButton.setBounds(120, 50, 100, 30);
        add(showButton);
        showButton.addActionListener(this);

        resultArea = new JTextArea();
        resultArea.setBounds(10, 90, 360, 160);
        resultArea.setEditable(false);
        add(resultArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dayText = dayInput.getText();
        int day;
        try {
            day = Integer.parseInt(dayText);
        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid input. Please enter a number between 1 and 7.");
            return;
        }

        switch (day) {
            case 1:
                resultArea.setText("Day 1: God created light, separated light from darkness, " +
                        "called light 'Day' and darkness 'Night'. (Genesis 1:3-5)");
                break;
            case 2:
                resultArea.setText("Day 2: God created the sky to separate the waters. (Genesis 1:6-8)");
                break;
            case 3:
                resultArea.setText("Day 3: God gathered the waters, let dry ground appear, " +
                        "called dry ground 'Land' and gathered waters 'Seas', and created vegetation. (Genesis 1:9-13)");
                break;
            case 4:
                resultArea.setText("Day 4: God created the sun, moon, and stars to separate day from night " +
                        "and serve as signs for sacred times, days, and years. (Genesis 1:14-19)");
                break;
            case 5:
                resultArea.setText("Day 5: God created sea creatures and birds. (Genesis 1:20-23)");
                break;
            case 6:
                resultArea.setText("Day 6: God created land animals, mankind in His image, and " +
                        "gave mankind dominion over the earth. (Genesis 1:24-31)");
                break;
            case 7:
                resultArea.setText("Day 7: God rested, blessed the seventh day, and made it holy. (Genesis 2:1-3)");
                break;
            default:
                resultArea.setText("Invalid input. Please enter a number between 1 and 7.");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CreationWeek app = new CreationWeek();
            app.setVisible(true);
        });
    }
}
