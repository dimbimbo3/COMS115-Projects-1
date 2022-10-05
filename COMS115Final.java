/*
 * Skeleton JFrame implementation for the COMS115 final
*/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class COMS115Final extends JFrame{
  private static final String TITLE = "COMS115 Final";
  private final JPanel panel;
  private final JLabel fileLbl;
  private final JLabel passwordLbl;
  private final JTextField passwordTxt;
  private final JTextArea decryptedTxt;
  private final JButton fileBtn;
  private final JButton decryptBtn;
  private String selectedFile;//The selected file from the JFileChooser
  
  //C-tor
  public COMS115Final(){
    setTitle(TITLE);
    setSize(550, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel = new JPanel();
    fileLbl = new JLabel("Select the encrypted file:", JLabel.RIGHT);
    fileLbl.setPreferredSize(new Dimension(225, 20));

    fileBtn = new JButton("Select File...");
    fileBtn.setPreferredSize(new Dimension(150, 20));
    fileBtn.addActionListener(new FileListener());

    passwordLbl = new JLabel("Enter the decryption password:", JLabel.RIGHT);
    passwordLbl.setPreferredSize(new Dimension(225, 20));

    passwordTxt = new JTextField();
    passwordTxt.setPreferredSize(new Dimension(150, 20));

    decryptedTxt = new JTextArea(5,40);
    decryptedTxt.setEditable(false);
    decryptedTxt.setLineWrap(true);
    decryptedTxt.setBorder(BorderFactory.createTitledBorder("Decrypted Text"));
            
    decryptBtn = new JButton("Decrypt");
    decryptBtn.setMnemonic(KeyEvent.VK_D);
    decryptBtn.addActionListener(new DecryptListener());
    
    panel.add(fileLbl);
    panel.add(fileBtn);
    panel.add(passwordLbl);
    panel.add(passwordTxt);
    panel.add(decryptedTxt);
    panel.add(decryptBtn);
    add(panel);
    setVisible(true);
  }//C-Tor
  
  /**
   * Main entry point
   */
  public static void main(String[] args) {
    new COMS115Final();
  }//main
  
  //FileListener
  private class FileListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JFileChooser fileChooser = new JFileChooser();
            int status = fileChooser.showOpenDialog(null);
            if(status == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                selectedFile = getFileContents(file.getPath());
                decryptedTxt.setText(selectedFile);
            }//if
        }//actionPerformed
  }//FileListener
  
  //getFileContents
  String getFileContents(String file){
      String contents = "";
      
      try{
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            while(dis.available() > 0){
                contents += dis.readChar();
            }//while
            dis.close();
      }//try
      catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "IOException: " + ioe);
      }//catch
      
      return contents;
  }//getFileContents
  
  //DecryptListener
  private class DecryptListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(!passwordTxt.getText().isEmpty()){
                String pass = passwordTxt.getText();
                String decrypted = "";
                int pBounds = 0;//counter for password character index
                
                for(int i = 0; i < selectedFile.length();i++){
                    if(pBounds == pass.length())
                        pBounds = 0;//prevents password index from going out of bounds
                    decrypted += (char)(selectedFile.charAt(i) - pass.charAt(pBounds));
                    pBounds++;
                }//for

                decryptedTxt.setText(decrypted);
            }//if
            else{
                JOptionPane.showMessageDialog(null, "No password has been entered...");
            }//else
        }//actionPerformed
    }//DecryptListener
}//class
