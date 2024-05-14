package hi11;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HW11_2 {

	 private static String currentPlayer = "X";

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Tic Tac Toe Game");
	        JButton[][] buttons = new JButton[3][3];
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 300);

	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(3, 3));
	        frame.add(panel, BorderLayout.CENTER);

	        JLabel statusLabel = new JLabel("Player X's turn");
	        frame.add(statusLabel, BorderLayout.SOUTH);

	        // 为每个按钮添加 Action 监听器
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                buttons[i][j] = new JButton();
	                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 40));

	                panel.add(buttons[i][j]);

	                buttons[i][j].addActionListener(e -> {
	                    JButton clickedButton = (JButton) e.getSource();
	                    // 设置按钮文本为当前玩家类型
	                    clickedButton.setText(currentPlayer);
	                    // 切换当前玩家类型
	                    currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
	                    // 更新状态标签
	                    statusLabel.setText("Player " + currentPlayer + "'s turn");
	                    // 禁用已经被点击的按钮
	                    clickedButton.setEnabled(false);
	                });
	            }
	        }

	        frame.setVisible(true);
	    }
	}
