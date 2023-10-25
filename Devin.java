import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetDisplayApp extends JFrame {
    private JLabel displayLabel;

    public PetDisplayApp() {
        setTitle("Pet Display App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        JRadioButton birdButton = new JRadioButton("Bird");
        JRadioButton catButton = new JRadioButton("Cat");
        JRadioButton dogButton = new JRadioButton("Dog");
        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        JRadioButton pigButton = new JRadioButton("Pig");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Create a label to display the selected pet
        displayLabel = new JLabel("Select a pet");

        // Create a button to trigger the display
        JButton displayButton = new JButton("Display Pet");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displaySelectedPet();
            }
        });

        // Set layout manager
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
        add(displayButton);
        add(displayLabel);

        setVisible(true);
    }

    private void displaySelectedPet() {
        // Determine which radio button is selected
        String selectedPet = "";
        if (displayLabel.getText().equals("Select a pet")) {
            selectedPet = "Select a pet";
        } else if (displayLabel.getText().equals("Bird")) {
            selectedPet = "Bird";
        } else if (displayLabel.getText().equals("Cat")) {
            selectedPet = "Cat";
        } else if (displayLabel.getText().equals("Dog")) {
            selectedPet = "Dog";
        } else if (displayLabel.getText().equals("Rabbit")) {
            selectedPet = "Rabbit";
        } else if (displayLabel.getText().equals("Pig")) {
            selectedPet = "Pig";
        }

        // Display the selected pet
        JOptionPane.showMessageDialog(this, "You selected: " + selectedPet);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PetDisplayApp();
            }
        });
    }
}
