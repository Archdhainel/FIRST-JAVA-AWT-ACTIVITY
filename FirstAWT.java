/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstawt;
import java.awt.*;

public class FirstAWT {

   
    public static void main(String[] args) {
        Frame frame = new Frame();
        
        Label label1 = new Label();
        
        TextField txtfield1 = new TextField();
        
        Label label2 = new Label();
        
        TextField txtfield2 = new TextField();
        
        frame.setSize(500,250);
        frame.setVisible(true);
        frame.setTitle("My First Java AWT");
        frame.setLayout(new FlowLayout());
        
        label1.setText("Username");
        label2.setText("Password");
        
        txtfield1.setPreferredSize(new Dimension(100,30));
        txtfield2.setPreferredSize(new Dimension(100,30));
  
        frame.add(label1);
        frame.add(label2);
        frame.add(txtfield1);
        
            }
    
}
