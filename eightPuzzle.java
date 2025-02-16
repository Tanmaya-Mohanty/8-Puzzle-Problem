import java.awt.*;  
import java.awt.event.*;
import javax.swing.JOptionPane;

class eightPuzzle extends Frame implements ActionListener{
    Label l;
    Button b;
    TextField op,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    eightPuzzle() {
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField();
        t5=new TextField();
        t6=new TextField();
        t7=new TextField();
        t8=new TextField();
        t9=new TextField();

        op=new TextField();

        t1.setBounds(100,100,50,50);
        t2.setBounds(150,100,50,50);
        t3.setBounds(200,100,50,50);
        t4.setBounds(100,150,50,50);
        t5.setBounds(150,150,50,50);
        t6.setBounds(200,150,50,50);
        t7.setBounds(100,200,50,50);
        t8.setBounds(150,200,50,50);
        t9.setBounds(200,200,50,50);

        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);
        this.add(t6);
        this.add(t7);
        this.add(t8);
        this.add(t9);

        l=new Label("Enter the operation (l/r/u/d): ");
        l.setBounds(100,300,150,50);
        this.add(l);

        op.setBounds(250,310,40,25);
        this.add(op);

        b=new Button("Done");
        b.setBounds(375,310,40,25);
        b.addActionListener(this);
        this.add(b);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae){
        int i,ctr;
        String ch;
        String s1,s2,s3,s4,s5,s6,s7,s8,s9;
        s1=t1.getText();
        s2=t2.getText();
        s3=t3.getText();
        s4=t4.getText();
        s5=t5.getText();
        s6=t6.getText();
        s7=t7.getText();
        s8=t8.getText();
        s9=t9.getText();

        String[] arr=new String[] {s1,s2,s3,s4,s5,s6,s7,s8,s9};
        ctr=0;
        for(i=0;i<9;i++){
            if(arr[i].isEmpty())
                ctr++;
        }

        ch=op.getText();
        if(ctr!=1)
            JOptionPane.showMessageDialog(this, "Invalid state!", ch, JOptionPane.ERROR_MESSAGE);
        
        if("".equals(s1)){
            if("l".equals(ch)){
                t1.setText(s2);
                t2.setText("");
            }
            else if("u".equals(ch)){
                t1.setText(s4);
                t4.setText("");
            }
        }
        else if("".equals(s2)){
            if("l".equals(ch)){
                t2.setText(s3);
                t3.setText("");
            }
            else if("r".equals(ch)){
                t2.setText(s1);
                t1.setText("");
            }
            else if("u".equals(ch)){
                t2.setText(s5);
                t5.setText("");
            }
        }
        else if("".equals(s3)){
            if("r".equals(ch)){
                t3.setText(s2);
                t2.setText("");
            }
            else if("u".equals(ch)){
                t3.setText(s6);
                t6.setText("");
            }
        }
        else if("".equals(s4)){
            if("l".equals(ch)){
                t4.setText(s5);
                t5.setText("");
            }
            else if("u".equals(ch)){
                t4.setText(s7);
                t7.setText("");
            }
            else if("d".equals(ch)){
                t4.setText(s1);
                t1.setText("");
            }
        }
        else if("".equals(s5)){
            if("l".equals(ch)){
                t5.setText(s6);
                t6.setText("");
            }
            else if("r".equals(ch)){
                t5.setText(s4);
                t4.setText("");
            }
            else if("u".equals(ch)){
                t5.setText(s8);
                t8.setText("");
            }
            else if("d".equals(ch)){
                t5.setText(s2);
                t2.setText("");
            }
        }
        else if("".equals(s6)){
            if("r".equals(ch)){
                t6.setText(s5);
                t5.setText("");
            }
            else if("u".equals(ch)){
                t6.setText(s9);
                t9.setText("");
            }
            else if("d".equals(ch)){
                t6.setText(s3);
                t3.setText("");
            }
        }
        else if("".equals(s7)){
            if("l".equals(ch)){
                t7.setText(s8);
                t8.setText("");
            }
            else if("d".equals(ch)){
                t7.setText(s4);
                t4.setText("");
            }
        }
        else if("".equals(s8)){
            if("l".equals(ch)){
                t8.setText(s9);
                t9.setText("");
            }
            else if("r".equals(ch)){
                t8.setText(s7);
                t7.setText("");
            }
            else if("d".equals(ch)){
                t8.setText(s5);
                t5.setText("");
            }
        }
        else if("".equals(s9)){
            if("r".equals(ch)){
                t9.setText(s8);
                t8.setText("");
            }
            else if("d".equals(ch)){
                t9.setText(s6);
                t6.setText("");
            }
        }
    }
    public static void main(String[] args) {
        eightPuzzle obj=new eightPuzzle();
        obj.setTitle("8 puzzle problem");
        obj.setSize(400, 400);
        obj.setLayout(null);
        obj.setVisible(true);
    }
}