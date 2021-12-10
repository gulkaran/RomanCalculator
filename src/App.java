// Gulkaran Singh
// Roman Numeral Calculator using Roman Numeral Conversions and Java Swing/JFrame
// 2021.12.09

// Import Statements
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    // JFrame Components
    private short total = 0;
    private String operation = "";
    private boolean romanMode = false;
    private boolean binaryMode = false;
    private JPanel application;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a9Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a6Button;
    private JButton a0Button;
    private JButton buttonEqls;
    private JButton buttonMultiply;
    private JButton buttonPlus;
    private JButton buttonSbtr;
    private JButton buttonDivision;
    private JButton buttonClear;
    private JTextPane answerField;
    private JTextPane answerNoReset;
    private JButton buttonBackspace;
    private JButton buttonRomanMode;
    private JLabel mode;
    private JButton buttonBinary;
    private JButton buttonEnter;

    // Action Listeners For Components
    public App() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /* For each button we need to return the value associated with the button which is
                the name of the button. To add multiple values to the answerField we take what's already there
                and concatenate to it by the value of the button. */

                /* The topText is the text that shows our entire operations which isn't reset when we use an operation */
                String text = answerField.getText() + a0Button.getText();
                String topText = answerField.getText() + a0Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 1
                String text = answerField.getText() + a1Button.getText();
                String topText = answerNoReset.getText() + a1Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 2
                String text = answerField.getText() + a2Button.getText();
                String topText = answerNoReset.getText() + a2Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 3
                String text = answerField.getText() + a3Button.getText();
                String topText = answerNoReset.getText() + a3Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 4
                String text = answerField.getText() + a4Button.getText();
                String topText = answerNoReset.getText() + a4Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 5
                String text = answerField.getText() + a5Button.getText();
                String topText = answerNoReset.getText() + a5Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 6
                String text = answerField.getText() + a6Button.getText();
                String topText = answerNoReset.getText() + a6Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 7
                String text = answerField.getText() + a7Button.getText();
                String topText = answerNoReset.getText() + a7Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 8
                String text = answerField.getText() + a8Button.getText();
                String topText = answerNoReset.getText() + a8Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button 9
                String text = answerField.getText() + a9Button.getText();
                String topText = answerNoReset.getText() + a9Button.getText();
                answerField.setText(text);
                answerNoReset.setText(topText);
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button AC - clears all selection

                // resets both the answerField and top field to empty strings and resets our total accumulator
                answerField.setText("");
                answerNoReset.setText("");
                total = 0;

            }
        });

        buttonBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button backspace - removes the last entered input
                String current = answerField.getText();
                String result = "";

                // loop through the length of our current answerField string - 1
                // this way it excludes the last letter and concatenate to a new result String
                for (int i = 0; i < current.length()-1; i++)
                    result += current.charAt(i);


                // removing the last letter from the top field as well
                String current2 = answerNoReset.getText();
                String result2 = "";
                System.out.println(current2);
                for (int i = 0; i < current2.length()-1; i++)
                    result2 += current2.charAt(i);

                answerField.setText(result);
                answerNoReset.setText(result2);
            }
        });

        buttonRomanMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button romanMode - sets the romanMode boolean true or false which ultimately turns on or off the roman conversion

                // if the roman mode is turned off, set it to on and show the letter 'R' to indicate its on
                if (!romanMode) {
                    // turns off the binaryMode if it was on previously
                    binaryMode = false;
                    mode.setText("");
                    mode.setText("R");
                    romanMode = true;
                } else {
                    // if its already true, then turn it to false and show nothing to indicate the mode is off
                    romanMode = false;
                    mode.setText("");
                }
            }
        });

        buttonBinary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // if the binary mode is off, it displays the letter 'B' and sets its corresponding boolean to true
                if (!binaryMode) {
                    // turns off the romanMode if it was on previously
                    romanMode = false;
                    mode.setText("");
                    mode.setText("B");
                    binaryMode = true;

                } else {
                    binaryMode = false;
                    mode.setText("");
                }
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // if this isn't the first operation, run the following method to account for multiple operations
                // e.g 10-5+2 --> when we press + and want to enter 2, we need to first account for the subtraction
                if (!operation.equals("")) {
                    total = checkOperation(total, operation);

                } else {
                    // otherwise, we add the value to the total
                    short x = Short.parseShort(answerField.getText());
                    total += x;
                }

                // putting the text onto the text fields
                String text = answerNoReset.getText() + buttonPlus.getName();
                answerNoReset.setText(text);

                answerField.setText("");
                operation = "+";

            }
        });

        buttonSbtr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // subtraction

                if (!operation.equals("")) {
                    total = checkOperation(total, operation);

                } else {
                    short x = Short.parseShort(answerField.getText());
                    total += x;
                }

                String text =  answerNoReset.getText() + buttonSbtr.getName();
                answerNoReset.setText(text);

                answerField.setText("");
                operation = "-";

            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // multiplication

                if (!operation.equals("")) {
                    total = checkOperation(total, operation);

                } else {
                    short x = Short.parseShort(answerField.getText());
                    total += x;
                }

                String text =  answerNoReset.getText() + buttonMultiply.getName();
                answerNoReset.setText(text);

                answerField.setText("");
                operation = "*";

            }
        });

        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // division

                if (!operation.equals("")) {
                    total = checkOperation(total, operation);

                } else {
                    short x = Short.parseShort(answerField.getText());
                    total += x;
                }

                String text =  answerNoReset.getText() + buttonDivision.getName();
                answerNoReset.setText(text);

                answerField.setText("");
                operation = "/";
            }
        });


        buttonEqls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // button equals - accounting for the last operation in the expression as the previous ones have
                // been accounted for using our checkOperation method

                if (operation.equals("+")) {

                    // if the last operation is addition, we simply add the last inputted number onto our total
                    short x = Short.parseShort(answerField.getText());
                    total += x;

                    // checking if the roman conversion mode is on or off and displaying the correct text
                    if (romanMode)
                        answerField.setText(Roman.convertToString(total));
                    else if (binaryMode)
                        answerField.setText(Integer.toBinaryString(total));
                    else
                        answerField.setText(Short.toString(total));

                } else if (operation.equals("-")) {
                    // if the last operation is subtraction, we subtract the last inputted num from total
                    short x = Short.parseShort(answerField.getText());
                    total -= x;

                    // checking for mode
                    if (romanMode)
                        answerField.setText(Roman.convertToString(total));
                    else if (binaryMode)
                        answerField.setText(Integer.toBinaryString(total));
                    else
                        answerField.setText(Short.toString(total));

                } else if (operation.equals("*")) {

                    // if the last operation is multiplication, we multiply the last inputted num from total
                    short x = Short.parseShort(answerField.getText());
                    total *= x;

                    // checking for mode
                    if (romanMode)
                        answerField.setText(Roman.convertToString(total));
                    else if (binaryMode)
                        answerField.setText(Integer.toBinaryString(total));
                    else
                        answerField.setText(Short.toString(total));

                } else if (operation.equals("/")) {
                    // if the last operation is division, we divide the last inputted num from total
                    short x = Short.parseShort(answerField.getText());
                    total /= x;

                    // checking for mode
                    if (romanMode)
                        answerField.setText(Roman.convertToString(total));
                    else if (binaryMode)
                        answerField.setText(Integer.toBinaryString(total));
                    else
                        answerField.setText(Short.toString(total));
                }

                // resetting total
                total = 0;
            }
        });

    }

    private short checkOperation(short sum, String op) {

        // passing in a sum variable (total), and our operation string

        // based on the previous sign, we will do the according operation to account for multiple operations
        // e.g 8 + 5 - 3 --> when we hit the '-' sign, we check for the previous operation which was addition and do the according operation
        if (op.equals("-")) {
            short x = Short.parseShort(answerField.getText());
            sum -= x;
        } else if (op.equals("+")) {
            short x = Short.parseShort(answerField.getText());
            sum += x;
        } else if (op.equals("*")) {
            short x = Short.parseShort(answerField.getText());
            sum *= x;
        } else if (op.equals("/")) {
            short x = Short.parseShort(answerField.getText());
            sum /= x;
        }

        return sum;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Roman Calculator");
        frame.setContentPane(new App().application);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
//        frame.setResizable(false);
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("imgs/calculator.png");
        frame.setIconImage(icon.getImage());

    }
}


