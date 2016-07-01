package test.java.fans;

import java.awt.*;

import javax.swing.*;

public class MyApplet extends JFrame {		//构造方法，创建窗口
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyApplet() {
		super("演示字体、颜色、绘图");				//调用基类构造方法，设置窗口标题
		setSize(470,320);				//设置窗口大小
		setVisible(true);				//显示窗口
	}

	public void paint(Graphics g) {
		
	super.paint(g);
	
	g.drawLine(20, 60, 460, 60);		//绘制直线
	g.setFont(new Font("SansSerif",Font.BOLD,12));		//设置字体
	g.setColor(Color.blue);				//设置颜色
	g.drawString("字体: SansSerif,粗体,12号,蓝色", 20, 50);	//绘制字符串
	g.setFont(new Font("SansSerif",Font.BOLD,12));
	g.drawString("姓名:范卓", 250, 50);
	
	g.drawLine(20, 90, 460, 90);		//绘制直线
	g.setFont(new Font("华文楷体",Font.BOLD,14));		//设置字体
	g.setColor(Color.green);				//设置颜色
	g.drawString("字体: 华文楷体,粗体,14号,绿色", 20, 80);	//绘制字符串
	g.setFont(new Font("华文楷体",Font.BOLD,14));
	g.drawString("性别:男", 280, 80);
	
	g.drawLine(20, 120, 460, 120);		//绘制直线
	g.setFont(new Font("华文彩云",Font.BOLD,16));		//设置字体
	g.setColor(Color.orange);				//设置颜色
	g.drawString("字体: 华文彩云,粗体,16号,橙色", 20, 110);	//绘制字符串
	g.setFont(new Font("华文彩云",Font.BOLD,16));
	g.drawString("爱好:篮球", 310, 110);
	
	g.setColor(Color.cyan);
	g.draw3DRect(20, 130, 100, 50, true);		//绘制有三维突起效果的空心矩形
	g.fill3DRect(130, 130, 100, 50, false);		//绘制有三维凹陷效果的实心矩形
	
	g.setColor(Color.pink);
	g.drawOval(240, 130, 100, 50);		//绘制空心椭圆
	g.fillOval(350, 130, 100, 50);		//绘制实心椭圆
	g.setColor(new Color(0,120,20));
	g.drawArc(20, 190, 100, 50, 0, 90);		//绘制一段圆弧
	g.fillArc(130, 190, 100, 50, 0, 90);		//绘制扇形，扇形由圆弧及两半径圈定
	
	g.setColor(Color.black);
	int xValues[] = {250, 280, 290, 300, 330, 310, 320, 290, 260, 270};
	int yValues[] = {210, 210, 190, 210, 210, 220, 230, 220, 230, 220};
	g.drawPolygon(xValues, yValues, 10);			//绘制空心多边形
	
	int xValues2[] = {360, 390, 400, 410, 440, 420, 430, 400, 370, 380};
	g.fillPolygon(xValues2, yValues, 10);		//绘制实心多边形
	
	g.setColor(Color.green);
	g.drawRect(20, 250, 100, 50);		//绘制空心矩形
	g.fillRect(130,250, 100, 50);		//绘制实心矩形
	
	g.setColor(Color.yellow);
	g.drawRoundRect(240, 250, 100, 50, 50, 50);		//绘制空心圆角矩形
	g.fillRoundRect(350, 250, 100, 50, 50, 50);		//绘制实心圆角矩形
	
	}

	public static void main(String[] args) {
		extracted();
											//设置窗口的外观感觉为Java默认
		MyApplet application = new MyApplet();
											//创建GraphicsTester类的一个实例
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	private static void extracted() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		}
	}
	
