/**
 * Created by young on 6/19/17.
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class FindMarble {

    private JPanel west;
    private JPanel east;
    private JFrame frame;
    // for the bottom button
    private JButton oneBelow;
    private JButton twoBelow;
    private JButton threeBelow;
    private JButton fourBelow;
    private JButton fiveBelow;
    private JButton sixBelow;
    private JButton sevenBelow;
    private JButton eightBelow;
    private JButton nineBelow;
    // for the top black circle
    private JLabel oneTop;
    private JLabel twoTop;
    private JLabel threeTop;
    private JLabel fourTop;
    private JLabel fiveTop;
    private JLabel sixTop;
    private JLabel sevenTop;
    private JLabel eightTop;
    private JLabel nineTop;
    // for the marble
    private JLabel oneCenter;
    private JLabel twoCenter;
    private JLabel threeCenter;
    private JLabel fourCenter;
    private JLabel fiveCenter;
    private JLabel sixCenter;
    private JLabel sevenCenter;
    private JLabel eightCenter;
    private JLabel nineCenter;
    // status and restart
    private JLabel status;
    private JButton restart;

    public FindMarble() throws IOException {
        BufferedImage img = ImageIO.read(new File("circle.gif"));
        Image imgNew = img.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(imgNew);

        BufferedImage img2 = ImageIO.read(new File("marble.jpg"));
        Image imgNew2 = img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(imgNew2);

        this.oneTop = new JLabel();
        this.oneTop.setIcon(icon);
        this.twoTop = new JLabel();
        this.twoTop.setIcon(icon);
        this.threeTop = new JLabel();
        this.threeTop.setIcon(icon);
        this.fourTop = new JLabel();
        this.fourTop.setIcon(icon);
        this.fiveTop = new JLabel();
        this.fiveTop.setIcon(icon);
        this.sixTop = new JLabel();
        this.sixTop.setIcon(icon);
        this.sevenTop = new JLabel();
        this.sevenTop.setIcon(icon);
        this.eightTop = new JLabel();
        this.eightTop.setIcon(icon);
        this.nineTop = new JLabel();
        this.nineTop.setIcon(icon);

        this.oneCenter = new JLabel();
        this.oneCenter.setIcon(icon2);
        this.oneCenter.setVisible(false);
        this.twoCenter = new JLabel();
        this.twoCenter.setIcon(icon2);
        this.twoCenter.setVisible(false);
        this.threeCenter = new JLabel();
        this.threeCenter.setIcon(icon2);
        this.threeCenter.setVisible(false);
        this.fourCenter = new JLabel();
        this.fourCenter.setIcon(icon2);
        this.fourCenter.setVisible(false);
        this.fiveCenter = new JLabel();
        this.fiveCenter.setIcon(icon2);
        this.fiveCenter.setVisible(false);
        this.sixCenter = new JLabel();
        this.sixCenter.setIcon(icon2);
        this.sixCenter.setVisible(false);
        this.sevenCenter = new JLabel();
        this.sevenCenter.setIcon(icon2);
        this.sevenCenter.setVisible(false);
        this.eightCenter = new JLabel();
        this.eightCenter.setIcon(icon2);
        this.eightCenter.setVisible(false);
        this.nineCenter = new JLabel();
        this.nineCenter.setIcon(icon2);
        this.nineCenter.setVisible(false);

        this.oneBelow = new JButton();
        this.oneBelow.add(this.oneTop);
        this.oneBelow.add(this.oneCenter);
        this.oneBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oneTop.setVisible(false);
                if (oneCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!oneCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });
        this.twoBelow = new JButton();
        this.twoBelow.add(this.twoTop);
        this.twoBelow.add(this.twoCenter);
        this.twoBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                twoTop.setVisible(false);
                if (twoCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!twoCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });
        this.threeBelow = new JButton();
        this.threeBelow.add(this.threeTop);
        this.threeBelow.add(this.threeCenter);
        this.threeBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                threeTop.setVisible(false);
                if (threeCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!threeCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });
        this.fourBelow = new JButton();
        this.fourBelow.add(this.fourTop);
        this.fourBelow.add(this.fourCenter);
        this.fourBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourTop.setVisible(false);
                if (fourCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!fourCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });
        this.fiveBelow = new JButton();
        this.fiveBelow.add(this.fiveTop);
        this.fiveBelow.add(this.fiveCenter);
        this.fiveBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fiveTop.setVisible(false);
                if (fiveCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!fiveCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });
        this.sixBelow = new JButton();
        this.sixBelow.add(this.sixTop);
        this.sixBelow.add(this.sixCenter);
        this.sixBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sixTop.setVisible(false);
                if (sixCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!sixCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });
        this.sevenBelow = new JButton();
        this.sevenBelow.add(this.sevenTop);
        this.sevenBelow.add(this.sevenCenter);
        this.sevenBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sevenTop.setVisible(false);
                if (sevenCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!sevenCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });
        this.eightBelow = new JButton();
        this.eightBelow.add(this.eightTop);
        this.eightBelow.add(this.eightCenter);
        this.eightBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eightTop.setVisible(false);
                if (eightCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!eightCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });
        this.nineBelow = new JButton();
        this.nineBelow.add(this.nineTop);
        this.nineBelow.add(this.nineCenter);
        this.nineBelow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nineTop.setVisible(false);
                if (nineCenter.isVisible()) {
                    status.setText("Congratulations, you found the marble!");
                    oneBelow.setEnabled(false);
                    twoBelow.setEnabled(false);
                    threeBelow.setEnabled(false);
                    fourBelow.setEnabled(false);
                    fiveBelow.setEnabled(false);
                    sixBelow.setEnabled(false);
                    sevenBelow.setEnabled(false);
                    eightBelow.setEnabled(false);
                    nineBelow.setEnabled(false);
                } else if (!nineCenter.isVisible()) {
                    status.setText("Try again!");
                }
            }
        });

        this.frame = new JFrame("Find the Marble!");
        this.frame.setLayout(new BorderLayout());

        this.west = new JPanel(new GridLayout(3, 3));
        this.west.add(this.oneBelow);
        this.west.add(this.twoBelow);
        this.west.add(this.threeBelow);
        this.west.add(this.fourBelow);
        this.west.add(this.fiveBelow);
        this.west.add(this.sixBelow);
        this.west.add(this.sevenBelow);
        this.west.add(this.eightBelow);
        this.west.add(this.nineBelow);
        this.frame.add(this.west, BorderLayout.WEST);

        this.east = new JPanel(new BorderLayout());
        this.status = new JLabel("Welcome to Find the Marble!");
        this.restart = new JButton("Restart");
        this.restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                try {
                    FindMarble a = new FindMarble();
                } catch (IOException k) {
                    // do nothing
                }
            }
        });
        this.east.add(this.status, BorderLayout.CENTER, SwingConstants.CENTER);
        this.east.add(this.restart, BorderLayout.SOUTH, SwingConstants.CENTER);
        this.frame.add(this.east, BorderLayout.EAST);
        // put in the marble
        generateRandomMarble();
        // run the frame
        this.frame.pack();
        this.frame.setSize(658, 500);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    private void generateRandomMarble() {
        Random randomizer = new Random();
        int temp = randomizer.nextInt(900);
        if (temp < 100) {
            this.oneCenter.setVisible(true);
        } else if (temp >= 100 && temp < 200) {
            this.twoCenter.setVisible(true);
        } else if (temp >= 200 && temp < 300) {
            this.threeCenter.setVisible(true);
        } else if (temp >= 300 && temp < 400) {
            this.fourCenter.setVisible(true);
        } else if (temp >= 400 && temp < 500) {
            this.fiveCenter.setVisible(true);
        } else if (temp >= 500 && temp < 600) {
            this.sixCenter.setVisible(true);
        } else if (temp >= 600 && temp < 700) {
            this.sevenCenter.setVisible(true);
        } else if (temp >= 700 && temp < 800) {
            this.eightCenter.setVisible(true);
        } else if (temp >= 800 && temp < 900) {
            this.nineCenter.setVisible(true);
        }
    }
}
