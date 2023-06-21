import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton Start,Back;
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " TO Online Assessment");
        heading.setBounds(200, 20, 700, 30);
        heading.setFont(new Font("sans-serif", Font.BOLD, 20));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules= new JLabel();
        rules.setBounds(20, 10, 800, 500);
        rules.setFont(new Font("sans-serif", Font.PLAIN, 16));
        rules.setForeground(new Color(119, 119, 122));
        rules.setText(
                "<html>"+
                         "<h2><b>A. General information: </b></h2>"+
                            " &nbsp; &nbsp; 1. The examination will comprise of Objective type Multiple Choice Questions (MCQs)." + "<br>" +
                            " &nbsp; &nbsp; 2. All questions are compulsory and each carries One mark." + "<br>" +
                            " &nbsp; &nbsp; 3. The total number of questions, duration of examination, will be different based on the course, the detail is available on your screen." + "<br>" +
                            " &nbsp; &nbsp; 4. The Subjects or topics covered in the exam will be as per the Syllabus." + "<br>" +
                            " &nbsp; &nbsp; 5. There will be NO NEGATIVE MARKING for the wrong answers." + "<br>" +
                        "<h2><b>B. Information & Instructions: </b></h2>" +
                            " &nbsp; &nbsp; 1. The examination does not require using any paper, pen, pencil and calculator." + "<br>" +
                            " &nbsp; &nbsp; 2. Every student will take the examination on a Laptop/Desktop/Smart Phone." + "<br>" +
                            " &nbsp; &nbsp; 3. On computer screen every student will be given objective type type Multiple Choice Questions (MCQs)." + "<br>" +
                            " &nbsp; &nbsp; 4. Each student will get questions and answers in different order selected randomly from a fixed Question Data bank." + "<br>" +
                            " &nbsp; &nbsp; 5. The students just need to click on the Right Choice / Correct option from the multiple choices /options given with each question. For Multiple Choice Questions, each question has four options, and the candidate has to click the appropriate option." + "<br>" +
                "<html>"
        );
        add(rules);

         Start = new JButton("Start");
        Start.setBounds(200, 500, 120, 25);
        Start.setBackground(new Color(30, 144, 254));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);

         Back= new JButton("Back");
        Back.setBounds(400, 500, 120, 25);
        Back.setBackground(new Color(30, 144, 254));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);

        setSize(900, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == Start){
            setVisible(false);
            new Quiz(name);
        } else if (e.getSource() == Back) {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}