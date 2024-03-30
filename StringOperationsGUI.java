 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 public class StringOperationsGUI extends JFrame implements ActionListener {
 private JTextField inputField, outputField;
 private JButton upperCaseButton, lowerCaseButton, convertCaseButton,
 beginWithCapsButton,
 reverseButton, countVowelsButton, countLettersButton, countWordsButton,
 resetButton;
 public StringOperationsGUI() {
 setTitle("String Operations");
 setSize(400, 400);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setResizable(false);
 getContentPane().setBackground(new Color(255, 204, 153)); // Light orange background
 JPanel panel = new JPanel();
 panel.setLayout(new GridBagLayout());
 GridBagConstraints gbc = new GridBagConstraints();
 gbc.gridx = 0;
 gbc.gridy = 0;
 gbc.anchor = GridBagConstraints.LINE_END;
 panel.add(new JLabel("Input String: "), gbc);
 gbc.gridy++;
 panel.add(new JLabel("Output String: "), gbc);
 gbc.gridy = 0;
 gbc.gridx = 1;
 gbc.weightx = 1;
 gbc.fill = GridBagConstraints.HORIZONTAL;
 gbc.anchor = GridBagConstraints.LINE_START;
 inputField = new JTextField(15);
panel.add(inputField, gbc);
 gbc.gridy++;
 outputField = new JTextField(15);
 outputField.setEditable(false);
 panel.add(outputField, gbc);
 gbc.gridy++;
 gbc.gridx = 0;
 gbc.gridwidth = 2;
 gbc.fill = GridBagConstraints.HORIZONTAL;
 gbc.insets = new Insets(10, 0, 0, 0); // Add some space between input/output and buttons
 upperCaseButton = new JButton("Uppercase");
 lowerCaseButton = new JButton("Lowercase");
 convertCaseButton = new JButton("Convert Case");
 beginWithCapsButton = new JButton("Begin with Caps");
 reverseButton = new JButton("Reverse");
 countVowelsButton = new JButton("Count Vowels");
 countLettersButton = new JButton("Count Letters");
 countWordsButton = new JButton("Count Words");
 resetButton = new JButton("Reset");
 upperCaseButton.addActionListener(this);
 lowerCaseButton.addActionListener(this);
 convertCaseButton.addActionListener(this);
 beginWithCapsButton.addActionListener(this);
 reverseButton.addActionListener(this);
 countVowelsButton.addActionListener(this);
 countLettersButton.addActionListener(this);
 countWordsButton.addActionListener(this);
 resetButton.addActionListener(this);
 // Set button background color
 resetButton.setBackground(new Color(65, 105, 225)); // Royal Blue
 // Adjust button size
 Dimension buttonSize = new Dimension(120, 25);
 upperCaseButton.setPreferredSize(buttonSize);
 lowerCaseButton.setPreferredSize(buttonSize);
 convertCaseButton.setPreferredSize(buttonSize);
 beginWithCapsButton.setPreferredSize(buttonSize);
 reverseButton.setPreferredSize(buttonSize);
 countVowelsButton.setPreferredSize(buttonSize);
 countLettersButton.setPreferredSize(buttonSize);
 countWordsButton.setPreferredSize(buttonSize);
 resetButton.setPreferredSize(buttonSize);
 panel.add(upperCaseButton, gbc);
gbc.gridy++;
 panel.add(lowerCaseButton, gbc);
 gbc.gridy++;
 panel.add(convertCaseButton, gbc);
 gbc.gridy++;
 panel.add(beginWithCapsButton, gbc);
 gbc.gridy++;
 panel.add(reverseButton, gbc);
 gbc.gridy++;
 panel.add(countVowelsButton, gbc);
 gbc.gridy++;
 panel.add(countLettersButton, gbc);
 gbc.gridy++;
 panel.add(countWordsButton, gbc);
 gbc.gridy++;
 panel.add(resetButton, gbc);
 panel.setBackground(new Color(255, 204, 153));
 add(panel);
 setVisible(true);
 }
 public static void main(String[] args) {
 new StringOperationsGUI();
 }
 @Override
 public void actionPerformed(ActionEvent e) {
 String input = inputField.getText();
 String actionCommand = e.getActionCommand();
 String output = "";
 switch (actionCommand) {
 case "Uppercase":
 output = input.toUpperCase();
 break;
 case "Lowercase":
 output = input.toLowerCase();
 break;
 case "Convert Case":
 output = convertCase(input);
 break;
 case "Begin with Caps":
 output = beginWithCaps(input);
 break;
 case "Reverse":
 output = new StringBuilder(input).reverse().toString();
 break;
 case "Count Vowels":
 output = String.valueOf(countVowels(input));
break;
 case "Count Letters":
 output = String.valueOf(countLetters(input));
 break;
 case "Count Words":
 output = String.valueOf(countWords(input));
 break;
 case "Reset":
 inputField.setText("");
 outputField.setText("");
 return;
 }
 outputField.setText(output);
 }
 private String convertCase(String input) {
 StringBuilder result = new StringBuilder();
 for (char c : input.toCharArray()) {
 if (Character.isUpperCase(c)) {
 result.append(Character.toLowerCase(c));
 } else if (Character.isLowerCase(c)) {
 result.append(Character.toUpperCase(c));
 } else {
 result.append(c);
 }
 }
 return result.toString();
 }
 private String beginWithCaps(String input) {
 StringBuilder result = new StringBuilder();
 boolean newWord = true;
 for (char c : input.toCharArray()) {
 if (newWord && Character.isLetter(c)) {
 result.append(Character.toUpperCase(c));
 newWord = false;
 } else {
 result.append(c);
 }
 if (Character.isWhitespace(c)) {
 newWord = true;
 }
 }
 return result.toString();
 }
 private int countVowels(String input) {
 int count = 0;
 for (char c : input.toCharArray()) {
 if ("aeiouAEIOU".indexOf(c) !=-1) {
count++;
 }
 }
 return count;
 }
 private int countLetters(String input) {
 int count = 0;
 for (char c : input.toCharArray()) {
 if (Character.isLetter(c)) {
 count++;
 }
 }
 return count;
 }
 private int countWords(String input) {
 String[] words = input.split("\\s+");
 return words.length;
 }
} 