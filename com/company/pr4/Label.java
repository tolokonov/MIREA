package com.company.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label extends JFrame {
    int MilanScore = 0, MadridScore = 0;

    JLabel result = new JLabel("Result: 0 X 0");
    JLabel score = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    Font font = new Font("Times New Roman", Font.BOLD, 45);

    // Вывод победителя
    public void printWinner() {
        if (MilanScore > MadridScore) {
            winner.setText("Winner: AC Milan");
        } else if (MilanScore < MadridScore) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("DRAW");
        }
    }

    // Стилизация текста
    public void JLabelStyle(JLabel jlabel) {
        jlabel.setHorizontalAlignment(JLabel.CENTER);
        jlabel.setFont(font);
    }

    Label() {
        JButton ACMilan = new JButton("<html><h2>AC Milan");
        JButton RealMadrid = new JButton("<html><h2>Real Madrid");

        add(ACMilan);
        add(RealMadrid);

        setLayout(null);
        setSize(1024,768);
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(960, 540));

        // Стилизация кнопок

        ACMilan.setPreferredSize(new Dimension(250, 80));
        RealMadrid.setPreferredSize(new Dimension(250, 80));

        ACMilan.setFocusable(false);
        ACMilan.setBorderPainted(false);
        RealMadrid.setFocusable(false);
        RealMadrid.setBorderPainted(false);

        // AC Milan

        add(ACMilan, BorderLayout.EAST);
        ACMilan.addActionListener(event->{
            MilanScore++;
            result.setText("Result: " + MadridScore + " X " + MilanScore);
            printWinner();
            score.setText("Last score: AC Milan");
        });

        // Real Madrid

        add(RealMadrid, BorderLayout.WEST);
        RealMadrid.addActionListener(event->{
            MadridScore++;
            result.setText("Result: " + MadridScore + " X " + MilanScore);
            printWinner();
            score.setText("Last score: Real Madrid");
        });

        // Обработка счета
        add(result, BorderLayout.CENTER);
        JLabelStyle(result);

        // Обработка победителя
        add(winner, BorderLayout.NORTH);
        JLabelStyle(winner);

        // Обработка последнего гола
        add(score, BorderLayout.SOUTH);
        JLabelStyle(score);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Label();
    }
}