import uinterface.PainelControle;

import java.awt.*;

public class Main {

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        PainelControle frame = new PainelControle();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

        }
    }
