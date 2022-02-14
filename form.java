import javax.swing.*;
import java.awt.*;

public class form {
    public static void main(String[] args) {
        //OBject part
        JFrame frame=new JFrame();
        Container c=frame.getContentPane();        
        JLabel label =new JLabel();
        JLabel label1 =new JLabel();
        JLabel label3= new JLabel();
        JLabel label4= new JLabel();
        JLabel label5= new JLabel();
        JLabel label6= new JLabel();
        JLabel label2 =new JLabel("GST-no");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JTextField t4=new JTextField();
        JTextField t5=new JTextField();
        JPasswordField pass=new JPasswordField();
        JButton button=new JButton();
        Cursor cur =new Cursor(Cursor.HAND_CURSOR);//to get cursor
        Font font =new Font("Arial",Font.BOLD,18);
        //Frame Part 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(100, 100, 1000, 450);
        frame.setTitle("E-Commerce Tax filling");
        frame.setBackground(Color.BLUE);
        //Label Part
        label.setText("E-Commerce Tax filling Form");
        label.setBounds(400, 50, 190, 40);
        label1.setText("User-name");
        label1.setBounds(100, 100, 150, 40);
        label2.setBounds(100, 150, 120, 40);
        label3.setText("Mobile");
        label3.setBounds(550,100, 150, 40);
        label4.setText("E-mail");
        label4.setBounds(550,150, 150, 40);
        label5.setText("Amount");
        label5.setBounds(345,250, 150, 40);
        label6.setText("Password");
        label6.setBounds(345,280, 150, 40);
      
        //Text Area
        t1.setFont(font);
        t1.setText("Suraj kumar");
        t1.setEditable(true);
        t1.setBounds(180, 100, 250, 30);
        t1.setBackground(Color.decode("#FF7F50"));
        t2.setFont(font);
        t2.setText("fill GST NO");
        t2.setEditable(true);
        t2.setBounds(180, 150, 250, 30);
        t2.setBackground(Color.decode("#FF7F50"));
        t3.setFont(font);
        t3.setText("mobile no");
        t3.setEditable(true);
        t3.setBounds(680, 100, 250, 30);
        t3.setBackground(Color.decode("#FF7F50"));
        t4.setFont(font);
        t4.setText("email-ID");
        t4.setEditable(true);
        t4.setBounds(680, 150, 250, 30);
        t4.setBackground(Color.decode("#FF7F50")); 
        t5.setFont(font);
        t5.setText("Amount");
        t5.setEditable(true);
        t5.setBounds(400, 250, 250, 30);
        t5.setBackground(Color.decode("#FF7F50"));
        //////PASSWORD AREA
        pass.setEchoChar((char)1);
        pass.setText("enter your password");
        pass.setBounds(410,280, 150, 40);
        pass.setBackground(Color.decode("#FF7F50"));
        ////////////////BUTTON ////////////////////////////////
        // button.setSize(100,30);
        // button.setSize(icon.getIconWidth(),icon.getIconHeight());
        // button.setLocation(100,100);
        button.setFont(font);
        button.setText("Submit");
        button.setForeground(Color.GREEN);
        button.setBackground(Color.RED);
        button.setEnabled(true);
        button.setVisible(true);
        button.setBounds(410,330, 150, 40);
        button.setCursor(cur);
        
        //CONTAINER PART
        c.setBackground(Color.decode("#FF7F50"));
        c.setLayout(null);
        c.add(label);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);
        c.add(label6);
        c.add(t1);
        c.add(t2);
        c.add(t3);
        c.add(t4);
        c.add(t5);
        c.add(pass);
        c.add(button);


       
        
    }
    
}
