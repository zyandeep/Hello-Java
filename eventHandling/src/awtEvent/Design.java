package awtEvent;

import javax.swing.*;
import java.awt.*;

public class Design extends JFrame {

    JPanel qp = new JPanel(new GridLayout(6, 2));
    JPanel rp = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
    static JTextField result;
    static JRadioButton q1, q2, q3, q4, q5, a1, a2, a3, a4, a5;
    QEventHandling qevent = new QEventHandling();
    AEventHandle aevent = new AEventHandle();

    public Design() {
        super("*** Sample game ***");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(qp);
        add(rp, BorderLayout.SOUTH);

        setUp();
    }

    public void setUp() {
        q1 = new JRadioButton("Assam");
        q2 = new JRadioButton("Maharastra");
        q3 = new JRadioButton("UP");
        q4 = new JRadioButton("Kerala");
        q5 = new JRadioButton("Manipur");
        a1 = new JRadioButton("Guwahati");
        a2 = new JRadioButton("Mumbai");
        a3 = new JRadioButton("Banaras");
        a4 = new JRadioButton("Koshin");
        a5 = new JRadioButton("Imphol");

        // registering the same itemListners to each question radio button
        q1.addItemListener(qevent);
        q2.addItemListener(qevent);
        q3.addItemListener(qevent);
        q4.addItemListener(qevent);
        q5.addItemListener(qevent);

        // registering the same itemListners to each answer radio button
        a1.addItemListener(aevent);
        a2.addItemListener(aevent);
        a3.addItemListener(aevent);
        a4.addItemListener(aevent);
        a5.addItemListener(aevent);

        ButtonGroup qg, ag;
        qg = new ButtonGroup();
        ag = new ButtonGroup();
        qg.add(q1);
        qg.add(q2);
        qg.add(q3);
        qg.add(q4);
        qg.add(q5);
        ag.add(a1);
        ag.add(a2);
        ag.add(a3);
        ag.add(a4);
        ag.add(a5);

        qp.add(new JLabel("  STATE"));
        qp.add(new JLabel("  CAPITAL"));
        qp.add(q1);
        qp.add(a1);
        qp.add(q2);
        qp.add(a2);
        qp.add(q3);
        qp.add(a3);
        qp.add(q4);
        qp.add(a4);
        qp.add(q5);
        qp.add(a5);

        result = new JTextField(30);
        rp.add(new JLabel("RESULT :: "));
        rp.add(result);

    }
}
