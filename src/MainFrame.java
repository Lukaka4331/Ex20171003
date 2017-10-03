import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private Container cp;
    private JButton jb1=new JButton("Example");
    private JButton jb2=new JButton("EnCrypt");
    private JLabel  jl1=new JLabel("Key");
    private JTextField jtfkey= new JTextField("3");
    private JButton jb3=new JButton("Clear");
    private JButton jb4=new JButton("Exit");
    private JPanel  jpnc=new JPanel(new GridLayout(6,1,3,3));
    private JTextArea jtaL=new JTextArea();
    private JTextArea jtaR=new JTextArea();
    private JScrollPane jspL= new JScrollPane(jtaL);
    private JScrollPane jspR= new JScrollPane(jtaR);
    private int coumt=0;
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,100,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jpnc,BorderLayout.CENTER);
        cp.add(jspL,BorderLayout.WEST);
        cp.add(jspR,BorderLayout.EAST);
        jtaL.setPreferredSize(new Dimension(200,5000));
        jtaR.setPreferredSize(new Dimension(200,5000));
        jtaL.setLineWrap(true);
        jtaR.setLineWrap(true);
        jpnc.add(jb1);
        jpnc.add(jb2);
        jpnc.add(jl1);
        jpnc.add(jtfkey);
        jpnc.add(jb3);
        jpnc.add(jb4);

jb1.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
jtaL.setText("\n" +
        "Later that day, when the Princess was sitting at the table, something was heard coming up the marble stairs. Splish, splosh, splish splosh! The sound came nearer and nearer, and a voice cried, \"Let me in, youngest daughter of the King.\"\n" +
        "\n" +
        "The Princess jumped up to see who had called her. Now when she caught sight of the frog, she turned very pale.\n" +
        "\n" +
        "\"What does a frog want with you?\" demanded the King, looking rather surprised.\n" +
        "\n" +
        "The Princess hung her head. \"When I was sitting by the fountain my golden ball fell into the water. This frog fetched it back for me, because I cried so much.\" The Princess started to cry again. \"I promised to love him and let him eat from my golden plate, drink from my golden cup, and sleep on my golden bed.\"\n" +
        "\n" +
        "The King looked at the frog and thought for a while before he spoke. \"Then you must keep your promise, my daughter.\"\n" +
        "\n" +
        "The Princess knew she must obey, so she let the frog to come inside. The frog hopped in after her and jumped up into her chair and straight onto the table. \"Now push your golden plate near me.\" said the frog, \"so that we may eat together.\" As she did so, the frog leapt onto her plate and ate up all her dinner, which was just as well, because the Princess didn't feel much like eating.\n" +
        "\n" +
        "Next, the frog drank from her little golden cup until it was quite empty. Somehow the Princess didn't feel at all thirsty either! After the frog had finished, he took one great leap and landed on the Princess's knee. \"Go away you ugly, cold frog!\" she screamed. \"I will never let you sleep on my lovely, clean bed!\"\n" +
        "\n" +
        "That made the King very angry. \"This frog helped you when you needed it. Now you must keep your promise to him.\"\n" +
        "\n" +
        "Very unwillingly the Princess picked up the frog and carried him upstairs to her room. When the frog hopped into the middle of her golden bed, it was just too much for the Princess. She pushed the frog hard and it fell onto the floor. As he fell he was changed into a handsome Prince. A spell had been cast on him by an evil witch and only the Princess had the power to break it.\n" +
        "\n" +
        "The Princess was speechless. She felt very sorry indeed that she had been so unkind to the frog. After a while, the handsome Prince and the Princess were married, and lived happily ever after.");
    }
});jb2.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
     char data[]=jtaL.getText().toCharArray();
     int len=data.length;

for(int i=0;i<len;i++){
    data[i]+=Integer.parseInt(jtfkey.getText());

    jtaR.setText(new String(data));
}
    }
});
jb3.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
jtaR.setText("");
jtaL.setText("");


    }
});

jb4.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});


    }

}
