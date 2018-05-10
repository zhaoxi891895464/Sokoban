package fanyi.love.java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("all")

// 用于显示主窗体，需要继承Frame类
public class MainFrame2 extends Frame implements KeyListener {
	public MainFrame2() {// (创建构造函数)
		
		
	

		laolongpapaye();// 调用牢笼 类
		zhangaiwu();// 调用障碍物 类
		lanyangyang();// 调用懒羊羊 类
		huitailang(3, 6);// 调用灰太狼 类

		background();// 调用背景初始化 类
		background();// 调用背景初始化2 类
		setMainFrameUI();// 调用主窗体 类

		this.addKeyListener(this);// 使窗口能够监听用户是不是点了键盘
		
		this.addWindowListener(new WindowAdapter() {//加监听 使得关闭按钮有效 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	// 设置窗口的基本信息(setMainFrameUI() 放在主窗体这个类里面)
	// 1、设置显示窗口
	// 2、设置窗口尺寸
	// 3、设置窗口位置
	// 4、设置窗口的标题
	// 5、设置整个窗口的布局模式(自由布局)
	private void setMainFrameUI() {// 创建一个主窗体 类
		this.setVisible(true);// 1 设置窗口显示，(是要显示窗口吗？) true
		this.setSize(820, 645);// 2 设置窗口尺寸 (宽 , 高)
		this.setLocation((1920 - 820) / 2, (1080 - 645) / 2);// 3 设置窗口位置 (x坐标 ,
																// y坐标)
		this.setTitle("推箱子小游戏");// 4 设置窗口的标题 (输入标题)
		this.setLayout(null);// 5、设置整个窗口的布局模式(自由布局)
		
	
	}

	// 制作一个背景，并将背景添加到窗体中，在开发中我们称之为 背景初始化
	private void background() { // 创建一个背景初始化 类
		Icon i = new ImageIcon("floor.png");// 创建一个图片对象 (需要放的图片)
		JLabel lab = new JLabel(i);// 创建一个制作背景的对象 JLabel是制作背景的方法 (把图片名为i传进去)
		lab.setBounds(10, 33, 800, 600);// 把东西哪个位置(x坐标，y坐标 ， 宽 ， 高)
		this.add(lab);// 将某个东西添加到窗体里面 (需要添加的东西)

	}

	// 推箱子人物的初始化(灰太狼)
	private void huitailang(int x, int y) { // 创建一个灰太狼 类
		// htl 初始位置
		lx = x;
		ly = y;

		Icon i = new ImageIcon("htl.png");
		htl = new JLabel(i);
		htl.setBounds(10 + lx * 50, 33 + ly * 50, 50, 50);
		this.add(htl);

		
	}

	JLabel htl;// 放在外面是因为等会要控制这个灰太狼 java语言中称 增加对象的作用范围由方法(里面变到类里面) 后面实现效果根据键盘控制
				// 换图片

	// 箱子的初始化(懒羊羊)
	private void lanyangyang() {

		Icon j = new ImageIcon("lyy.png");
		JLabel lyy0 = new JLabel(j);
		lyy0.setBounds(10 + 6 * 50, 33 + 4 * 50, 50, 50);
		this.add(lyy0);

		arr[4][6] = 4;// 修改箱子对应位置的数据为4
		sheeps[4][6] = lyy0;// 把这个JLabel组件放入到sheeps的数组中

		JLabel lyy1 = new JLabel(j);
		lyy1.setBounds(10 + 6 * 50, 33 + 6 * 50, 50, 50);
		this.add(lyy1);
		arr[6][6] = 4;
		sheeps[6][6] = lyy1;

		JLabel lyy2 = new JLabel(j);
		lyy2.setBounds(10 + 6 * 50, 33 + 8 * 50, 50, 50);
		this.add(lyy2);
		arr[8][6] = 4;
		sheeps[8][6] = lyy2;

	}

	// 牢笼的初始化
	private void laolongpapaye() {
		Icon i = new ImageIcon("laolong.png");
		JLabel ll = new JLabel(i);
		ll.setBounds(510, 283, 50, 50);
		this.add(ll);
		
		JLabel ll1 = new JLabel(i);
		ll1.setBounds(510, 333, 50, 50);
		this.add(ll1);
		
		JLabel ll2 = new JLabel(i);
		ll2.setBounds(510, 383, 50, 50);
		this.add(ll2);
	}

	// 把JLabel组件进行存放位置的设定
	JLabel[][] sheeps = new JLabel[12][16];// 创建一个对象数组 一开始这个数组什么值都没有
											// 然后把三个lyy坐标放进去

	int[][] arr = { // 场景模拟，使用二维数组,1代表障碍 0代表空地
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, };

	int lx, ly;// lX代表htl的 x坐标 ly代表htl的y坐标
	int num = 3, temp = 0; // num代表箱子总数   temp代表有多少个箱子移动到笼子
	
	// 障碍物的初始化
	private void zhangaiwu() {

		Icon lz = new ImageIcon("shu.png");

		for (int i = 0; i < arr.length; i++) {// 遍历
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					JLabel ll = new JLabel(lz);
					ll.setBounds(10 + 50 * j, 33 + 50 * i, 50, 50);
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
		// System.out.println(e.getKeyCode());//键码值 测试 得出 ←37 ↑38 →39 ↓40
		int i = e.getKeyCode();
		if (i == 37) {
			if (arr[ly][lx - 1] == 1) {// 碰撞检测之人物遇到障碍
				// 让人物向左移动 lx-1是判断左边的前一个位置是否有障碍物（==1） 如果有则return，后面的代码就不执行
				Icon a = new ImageIcon("zuo.png");
				htl.setIcon(a);
				return;
			}

			if (arr[ly][lx - 1] == 4) {// 碰撞检测之人物遇到箱子
				// 让人物向左移动 lx-1是判断左边的前一个位置是否有箱子（==4）
				// 遇到箱子 则人物往方向移动一格 箱子往方向移动一格
				// 前提 箱子方向左的后一位是可以移动的 如果箱子后面的内容是树木或者是箱子 就不让移动
				if (arr[ly][lx - 2] != 1 && arr[ly][lx - 2] != 4) {

					// 箱子移动
					// 箱子向左移动一格
					// 箱子的实际数据4的位置则发生变化 即当前位置变为0（空地）
					// 移动后箱子所在的位置值变成4

					// 箱子先移动 腾出空间 人物才可以移动 所以箱子移动写在人物移动上面
					arr[ly][lx - 1] = 0;// 人物往左边走一步的位置(当前箱子的位置) 变成空地
					arr[ly][lx - 2] = 4;// 人物往左走两步的位置(移动后箱子的位置) 变成现在的位置

					// 一共有三个箱子，如何知道htl移动的是哪个箱子呢？
					// 1.首先获取箱子的对象 sheeps[ly][lx-1]组件  用setLocation 设置它的位置
					// 原始位置  设置 取得的  移动位置
					// 2.计算箱子向左边移动的坐标 移动一格 -50 下面的代码是拿狼的位置算两格 -100
					sheeps[ly][lx - 1].setLocation((10 + lx * 50-100 ), 33 + ly * 50);
					// 上述代码只是修改了显示的效果，实际上组件数组中的位置并没有发生变化 所以接下来要对组件的位置进行调整
					
					sheeps[ly][lx - 2] = sheeps[ly][lx - 1];// 把组件移动后的位置赋给sheeps[ly][lx - 2] 但是位置要对应 所以是lx-2
					sheeps[ly][lx - 1] = null;// 组件移动后，把原来的位置去掉
					
					
				} 
			
			
			else {
					Icon a = new ImageIcon("zuo.png");// 首先要有图片
					htl.setIcon(a);
					return;
				}
			}

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
			lx = lx - 1;	//移动后坐标修改
		}

		if (i == 38) {
			if (arr[ly - 1][lx] == 1) {
				Icon a = new ImageIcon("shang.png");// 首先要有图片
				htl.setIcon(a);
				return;
			}

			if (arr[ly - 1][lx] == 4) {

				if (arr[ly - 2][lx] != 1 && arr[ly - 2][lx] != 4) {

					arr[ly - 1][lx] = 0;
					arr[ly - 2][lx] = 4;

					sheeps[ly - 1][lx].setLocation((10 + lx * 50), 33 + ly * 50 - 100);

					sheeps[ly - 2][lx] = sheeps[ly - 1][lx];

					sheeps[ly - 1][lx] = null;

					
				} else {
					Icon a = new ImageIcon("shang.png");// 首先要有图片
					htl.setIcon(a);
					return;
				}
			}
			int x = (int) htl.getLocation().getX();
			int y = (int) htl.getLocation().getY();

			Icon a = new ImageIcon("shang.png");
			htl.setIcon(a);

			htl.setLocation(x, y - 50);
			ly = ly - 1;

		}

		if (i == 39) {
			if (arr[ly][lx + 1] == 1) {
				Icon a = new ImageIcon("you.png");// 首先要有图片
				htl.setIcon(a);
				return;
			}

			if (arr[ly][lx + 1] == 4) {

				if (arr[ly][lx + 2] != 1 && arr[ly][lx + 2] != 4) {

					arr[ly][lx + 1] = 0;
					arr[ly][lx + 2] = 4;

					sheeps[ly][lx + 1].setLocation((10 + lx * 50 + 100), 33 + ly * 50);

					sheeps[ly][lx + 2] = sheeps[ly][lx + 1];

					sheeps[ly][lx + 1] = null;

					
				} else {
					Icon a = new ImageIcon("you.png");// 首先要有图片
					htl.setIcon(a);
					return;
				}
			}

			int x = (int) htl.getLocation().getX();
			int y = (int) htl.getLocation().getY();

			Icon a = new ImageIcon("you.png");
			htl.setIcon(a);
			htl.setLocation(x + 50, y);
			lx = lx + 1;

		}

		if (i == 40)

		{
			if (arr[ly + 1][lx] == 1) {
				Icon a = new ImageIcon("htl.png");// 首先要有图片
				htl.setIcon(a);
				return;
			}

			if (arr[ly + 1][lx] == 4) {

				if (arr[ly + 2][lx] != 1 && arr[ly + 2][lx] != 4) {

					arr[ly + 1][lx] = 0;
					arr[ly + 2][lx] = 4;

					sheeps[ly + 1][lx].setLocation((10 + lx * 50), 33 + ly * 50 + 100);

					sheeps[ly + 2][lx] = sheeps[ly + 1][lx];

					sheeps[ly + 1][lx] = null;

					
				} else {
					Icon a = new ImageIcon("htl.png");// 首先要有图片
					htl.setIcon(a);
					return;
				}
			}

			int x = (int) htl.getLocation().getX();
			int y = (int) htl.getLocation().getY();

			Icon a = new ImageIcon("htl.png");
			htl.setIcon(a);
			htl.setLocation(x, y + 50);
			ly = ly + 1;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
