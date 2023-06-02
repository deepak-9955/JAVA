import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    private JLabel heading;
    Font font = new Font("",Font.BOLD,30);

    private JPanel mainPanel;
    private JLabel nameLable,passwordLable;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1,button2;
    MyWindow(){
        super.setTitle("This is my first form.");
        super.setSize(600,400);
        super.setLocation(20,50);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
        super.setVisible(true);
        System.out.println("This is constructor");
    }
    public void createGUI(){
        this.setLayout(new BorderLayout());

        heading=new JLabel("My First Form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);

        this.add(heading,BorderLayout.NORTH);

        ////////working with Jpanel.....////////

        mainPanel=new JPanel();

        /////setting layout main panel
        mainPanel.setLayout(new GridLayout(3,2));

        nameLable=new JLabel("Enter your name : ");
        nameLable.setFont(font);

        passwordLable=new JLabel("Enter password : ");
        passwordLable.setFont(font);

        nameTextField=new JTextField();
        nameTextField.setFont(font);

        passwordField=new JPasswordField();
        passwordField.setFont(font);

        button1=new JButton("Submit");
        button1.setFont(font);

        button2=new JButton("Reset");
        button2.setFont(font);

        mainPanel.add(nameLable);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLable);
        mainPanel.add(passwordField);
        mainPanel.add(button1);
        mainPanel.add(button2);
        this.add(mainPanel,BorderLayout.CENTER);

    }
}
