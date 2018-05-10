package fanyi.love.java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//用于显示主窗体，需要继承Frame类
public class MainFrame extends JFrame implements KeyListener {
	public MainFrame() {// (创建构造函数)

		laolongpapaye();// 调用牢笼 类
		zhangaiwu();// 调用障碍物 类
		lanyangyang();// 调用懒羊羊 类
		huitailang();// 调用灰太狼 类

		background();// 调用背景初始化 类
		background();// 调用背景初始化2 类
		setMainFrameUI();// 调用主窗体 类
		this.addKeyListener(this);// 使窗口能够监听用户是不是点了键盘   添加监听事件

		
		
		this.addWindowListener(new WindowAdapter() {//加监听 使得关闭按钮有效 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * 1、JFrame是Frame的子类，JFrame在javax.swing包内，Frame在包java.awt中 
		 * 2、关闭窗口的方式不同：
		 * 		JFrame传递参数使得关闭按钮有效
		 * 		frame加监听使得关闭按钮有效
		 */

	}

	// 设置窗口的基本信息(setMainFrameUI() 放在主窗体这个类里面)
	// 1、设置显示窗口
	// 2、设置窗口尺寸
	// 3、设置窗口位置
	// 4、设置窗口的标题
	// 5、设置整个窗口的布局模式(自由布局)
	private void setMainFrameUI() {// 创建一个主窗体 类
		this.setVisible(true);// 1 设置窗口显示，(是要显示窗口吗？) true
		this.setSize(820,640);// 2 设置窗口尺寸 (宽 , 高)
		this.setLocation((1920 - 820) / 2, (1080 - 640) / 2);// 3 设置窗口位置 (x坐标 ,
																// y坐标)
		this.setTitle("推箱子小游戏");// 4 设置窗口的标题 (输入标题)
		this.setLayout(null);// 5、设置整个窗口的布局模式(自由布局)
	}

	// 制作一个背景，并将背景添加到窗体中，在开发中我们称之为 背景初始化
	private void background() { // 创建一个背景初始化 类
		Icon i = new ImageIcon("floor.png");// 创建一个图片对象 (需要放的图片)
		JLabel lab = new JLabel(i);// 创建一个制作背景的对象 JLabel是制作背景的方法 (把图片名为i传进去)
		lab.setBounds(2, 2, 800, 600);// 把东西哪个位置(x坐标，y坐标 ， 宽 ， 高)
		this.add(lab);// 将某个东西添加到窗体里面 (需要添加的东西)
	}

	// 推箱子人物的初始化(灰太狼)
	private void huitailang() { // 创建一个灰太狼 类
		// htl 初始位置
		Icon i = new ImageIcon("htl.png");
		htl = new JLabel(i);
		htl.setBounds(202, 302, 50, 50);
		this.add(htl);
	}

	JLabel htl;// 放在外面是因为等会要控制这个灰太狼 java语言中称 增加对象的作用范围由方法(里面变到类里面) 后面实现效果根据键盘控制
				// 换图片

	// 箱子的初始化(懒羊羊)
	private void lanyangyang() {
		Icon j = new ImageIcon("lyy.png");
		JLabel lyy0 = new JLabel(j);
		lyy0.setBounds(302, 202, 50, 50);
		this.add(lyy0);

		JLabel lyy1 = new JLabel(j);
		lyy1.setBounds(302, 302, 50, 50);
		this.add(lyy1);

		JLabel lyy2 = new JLabel(j);
		lyy2.setBounds(302, 402, 50, 50);
		this.add(lyy2);
	}

	// 牢笼的初始化
	private void laolongpapaye() {
		Icon i = new ImageIcon("laolong.png");
		JLabel ll = new JLabel(i);
		ll.setBounds(702, 252, 50, 50);
		this.add(ll);

		JLabel ll1 = new JLabel(i);
		ll1.setBounds(702, 302, 50, 50);
		this.add(ll1);

		JLabel ll2 = new JLabel(i);
		ll2.setBounds(702, 352, 50, 50);
		this.add(ll2);
	}

	int[][] arr = { // 场景模拟，使用二维数组,1代表障碍 0代表空地
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
			};
	// 障碍物的初始化
	private void zhangaiwu() {

		Icon lz = new ImageIcon("shu.png");

		for (int i = 0; i < arr.length; i++) {// 遍历
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					JLabel ll = new JLabel(lz);
					ll.setBounds(2 + 50 * j, 2 + 50 * i, 50, 50);
					this.add(ll);
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		 //System.out.println(e.getKeyCode());//键码值 测试 得出 ←37 ↑38 →39 ↓40
		int i = e.getKeyCode();
		if (i == 37) {
			// 让人物向左移动
			// 首先要知道人物目前所在的位置(就是htl这个人物)
			// 然后知道移动一次的步子多大
			// 再由上面的两个数据计算出移动以后人物在的位置

			int x = (int) htl.getLocation().getX();// 取得x的坐标值(默认是double，为了方便计算所以取整)
			int y = (int) htl.getLocation().getY();
			htl.setLocation(x - 50, y);// htl向左移动一步（图片50px 所以这里设的是x-50）

			// 人物移动后更换图片
			Icon a = new ImageIcon("zuo.png");// 首先要有图片
			htl.setIcon(a);// 直接显示指定图片即可

		}

		if (i == 38) {
			int x = (int) htl.getLocation().getX();
			int y = (int) htl.getLocation().getY();
			htl.setLocation(x, y - 50);

			Icon a = new ImageIcon("shang.png");
			htl.setIcon(a);
		}

		if (i == 39) {
			int x = (int) htl.getLocation().getX();
			int y = (int) htl.getLocation().getY();
			htl.setLocation(x + 50, y);

			Icon a = new ImageIcon("you.png");
			htl.setIcon(a);
		}

		if (i == 40) {
			int x = (int) htl.getLocation().getX();
			int y = (int) htl.getLocation().getY();
			htl.setLocation(x, y + 50);

			Icon a = new ImageIcon("htl.png");
			htl.setIcon(a);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
