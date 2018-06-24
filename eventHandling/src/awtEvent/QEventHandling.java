package awtEvent;

import java.awt.event.*;

public class QEventHandling implements ItemListener {

    static Object rb;

    public void itemStateChanged(ItemEvent e) {

        rb = e.getItem();

    }
}
