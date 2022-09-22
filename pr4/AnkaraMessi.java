package pr4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AnkaraMessi extends JFrame{
        int milancnt;
        int madridcnt;
        JButton madridButt = new JButton("Real Madrid");
        JButton milanButt = new JButton("AC Milan");
        JLabel jtf = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        JLabel ls = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        JLabel w = new JLabel("Winner: DRAW", SwingConstants.CENTER);

        public String currentWinner() {return this.milancnt!=this.madridcnt?(this.milancnt>this.madridcnt?"AC Milan":"Real Madrid"):"DRAW";};

        public AnkaraMessi() {
            super("Score");
            setSize(400,300);
            setLayout(new BorderLayout());
            add(madridButt, BorderLayout.WEST);
            add(milanButt, BorderLayout.EAST);
            add(jtf, BorderLayout.CENTER);
            add(ls, BorderLayout.SOUTH);
            add(w, BorderLayout.NORTH);

            milanButt.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ++milancnt;
                    jtf.setText("Result: " + madridcnt + " X " + milancnt);
                    ls.setText("Last Scorer: AC Milan");
                    w.setText("Winner: " + currentWinner());
                }

                @Override
                public void mousePressed(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {}

                @Override
                public void mouseEntered(MouseEvent e) {}

                @Override
                public void mouseExited(MouseEvent e) {}
            });
            madridButt.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ++madridcnt;
                    jtf.setText("Result: " + madridcnt + " X " + milancnt);
                    ls.setText("Last Scorer: Real Madrid");
                    w.setText("Winner: " + currentWinner());
                }

                @Override
                public void mousePressed(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {}

                @Override
                public void mouseEntered(MouseEvent e) {}

                @Override
                public void mouseExited(MouseEvent e) {}
            });
        }

        public static void main(String [] args) {
            new AnkaraMessi().setVisible(true);
        }
}
