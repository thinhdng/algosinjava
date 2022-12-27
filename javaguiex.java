import java.awt.*;
import javax.swing.*;
class javaguiex{
     public static void main(String[] args) {
        //creating a GUI frame 500 x 500 that exit on close 
        JFrame frame = new JFrame("fake frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        
        //Create a menu bar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m12 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m12);

        //Creating the panel at the bottom and adding the components
        JPanel panel = new JPanel(); //panel is not visible in output
        JLabel label = new JLabel("Enter text");
        JTextField tf = new JTextField(10); //limits to 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // components added using flow layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        //Text area at the center
        JTextArea ta = new JTextArea();

        //Adding components to the frame 
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}