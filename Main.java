import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeApp extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private boolean playerXTurn;
    private int moveCount;
