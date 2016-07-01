/*# FanZhuoProject
Tenacious perseverance can conquer any one of the world's highest peak.
登陆窗口
*/
package tast.java.fans;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Test {

	public static void main(String[] args) {
		final String userName = "fans";
		final String passwrod = "123456";
		JFrame jFrame = new JFrame("登陆界面");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int) dimension.getWidth() - 200) / 2,
				((int) dimension.getHeight() - 300) / 2, 200, 150);
		jFrame.setResizable(false);
		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label1 = new JLabel("用户");
		label1.setBounds(10, 10, 100, 30);
		jFrame.add(label1);

		JLabel label2 = new JLabel("密码");
		label2.setBounds(10, 40, 100, 30);
		jFrame.add(label2);

		final JTextField text1 = new JTextField();
		text1.setBounds(50, 15, 130, 20);
		jFrame.add(text1);

		final JPasswordField text2 = new JPasswordField();
		text2.setBounds(50, 45, 130, 20);
		jFrame.add(text2);

		JButton button = new JButton("登 陆");
		button.setBounds(10, 75, 170, 40);
		button.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				if (userName.equals(text1.getText())
						&& passwrod.equals(text2.getText())) {
					JOptionPane.showMessageDialog(null, "登陆成功", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "账号或密码输入错误", "提示",
							JOptionPane.ERROR_MESSAGE);
					text1.setText("");
					text2.setText("");
				}
			}
		});
		jFrame.add(button);

		jFrame.setVisible(true);
	}

}
