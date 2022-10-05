
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class RetailPriceCalculator extends JFrame{
    private JPanel panel;
    private JLabel wholesaleLabel;
    private JTextField wholesaleTxt;
    private JLabel markupLabel;
    private JTextField markupTxt;
    private JButton button;
    
    public RetailPriceCalculator(String title){
        setTitle(title);
        setSize(360,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        wholesaleLabel = new JLabel("Enter the item's wholesale cost: ");
        wholesaleTxt = new JTextField(10);
        markupLabel = new JLabel("Enter the item's markup percentage: ");
        markupTxt = new JTextField(10);
        button = new JButton("Display Retail Price");
        
        button.addActionListener(new ButtonListener());
        
        panel.add(wholesaleLabel);
        panel.add(wholesaleTxt);
        panel.add(markupLabel);
        panel.add(markupTxt);
        panel.add(button);
        add(panel);
        
        setVisible(true);
    }
    
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            DecimalFormat df = new DecimalFormat("$0.00");
            String wholesaleInput = wholesaleTxt.getText();
            String markupInput = markupTxt.getText();
            double markupPercentage = Double.parseDouble(markupInput) * 0.01;
            double markup = Double.parseDouble(wholesaleInput) * markupPercentage;
            double retail = Double.parseDouble(wholesaleInput) + markup;
            String output = "Retail price is " + df.format(retail);
            JOptionPane.showMessageDialog(null, output);
        }
    }
}
