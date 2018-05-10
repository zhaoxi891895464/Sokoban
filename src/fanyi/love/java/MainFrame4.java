
package fanyi.love.java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("all")

public class MainFrame4 extends JFrame implements KeyListener {
	// 用于显示主窗体，需要继承Frame类
	public MainFrame4() {// (创建构造函数)
		laolongpapaye();// 调用牢笼 类
		caidan();
		zhangaiwu();// 调用障碍物 类
		lanyangyang();// 调用懒羊羊 类
		huitailang(3, 6);// 调用灰太狼 类
		background();// 调用背景初始化 类
		background();// 调用背景初始化2 类
		setMainFrameUI();// 调用主窗体 类
		this.addKeyListener(this);// 使窗口能够监听用户是不是点了键盘 添加监听事件
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	private void setMainFrameUI() {
		this.setVisible(true);
		this.setSize(820, 645);
		this.setLocation(300, 50);
		this.setTitle("推箱子小游戏");
		this.setLayout(null);
	}

	private void background() {
		Icon i = new ImageIcon("bg5.jpg");
		JLabel lab = new JLabel(i);
		lab.setBounds(2, 2, 800, 600);
		this.add(lab);
	}

	private void huitailang(int x, int y) {
		lx = x;
		ly = y;
		Icon i = new ImageIcon("htl.png");
		htl = new JLabel(i);
		htl.setBounds(2 + lx * 50, 2 + ly * 50, 50, 50);
		this.add(htl);
	}

	JLabel htl;

	private void lanyangyang() {
		Icon j = new ImageIcon("lyy.png");
		JLabel lyy0 = new JLabel(j);
		lyy0.setBounds(2 + 5 * 50, 2 + 5 * 50, 50, 50);
		this.add(lyy0);
		arr[5][5] = 4;
		sheeps[5][5] = lyy0;

		JLabel lyy1 = new JLabel(j);
		lyy1.setBounds(2 + 6 * 50, 2 + 13 * 50, 50, 50);
		this.add(lyy1);
		arr[13][6] = 4;
		sheeps[13][6] = lyy1;

		JLabel lyy2 = new JLabel(j);
		lyy2.setBounds(2 + 6 * 50, 2 + 8 * 50, 50, 50);
		this.add(lyy2);
		arr[8][6] = 4;
		sheeps[8][6] = lyy2;

	}

	private void laolongpapaye() {
		Icon i = new ImageIcon("laolong.png");
		JLabel ll = new JLabel(i);
		ll.setBounds(702, 252, 50, 50);
		this.add(ll);
		arr[5][14] = 8;
		sheeps[5][14] = ll;

		JLabel ll1 = new JLabel(i);
		ll1.setBounds(702, 302, 50, 50);
		this.add(ll1);
		arr[6][14] = 8;
		sheeps[6][14] = ll1;

		JLabel ll2 = new JLabel(i);
		ll2.setBounds(702, 352, 50, 50);
		this.add(ll2);
		arr[7][14] = 8;
		sheeps[7][14] = ll2;

		Icon shu2 = new ImageIcon("shu2.png");
		JLabel shu = new JLabel(shu2);
		shu.setBounds(2 + 50 * 14, 2 + 50 * 11, 50, 50);
		this.add(shu);
		arr[11][14] = 2;
		sheeps[11][14] = shu;

	}

	public void caidan() {
		Icon j1 = new ImageIcon("shu3.png");
		JLabel shu1 = new JLabel(j1);
		shu1.setBounds(2 + 11 * 50, 2 + 4 * 50, 50, 50);
		this.add(shu1);
		arr[4][11] = 5;
		sheeps[4][11] = shu1;

		JLabel shu21 = new JLabel(j1);
		shu21.setBounds(2 + 7 * 50, 2 + 5 * 50, 50, 50);
		this.add(shu21);
		arr[5][7] = 5;
		sheeps[5][7] = shu21;
	}

	JLabel[][] sheeps = new JLabel[22][16];

	int[][] arr = { 
					{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
					{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, 
					{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1 },
					{ 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1 }, 
					{ 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 }, 
					{ 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 }, 
					{ 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1 }, 
					{ 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1 }, 
					{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 }, 
					{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1 }, 
					{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
					{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
					{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
			};

	int lx, ly;
	int num = 3, temp = 0;
	int num1 = 0;

	private void zhangaiwu() {
		Icon lz = new ImageIcon("shu.png");
		for (int i = 0; i < arr.length; i++) {
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
		int i = e.getKeyCode();
		if (i == 37) {
			if (arr[ly][lx - 1] == 1 || arr[ly][lx - 1] == 4 && arr[ly][lx - 2] == 12
					|| arr[ly][lx - 1] == 12 && arr[ly][lx - 2] == 4
					|| arr[ly][lx - 1] == 12 && arr[ly][lx - 2] == 12) {
				Icon a = new ImageIcon("zuo.png");
				htl.setIcon(a);
				return;
			}
			if (arr[ly][lx - 1] == 4 && arr[ly][lx - 2] == 8) {
				arr[ly][lx - 1] = 0;
				arr[ly][lx - 2] = 12;
				sheeps[ly][lx - 1].setLocation((2 + lx * 50 - 100), 2 + ly * 50);
				sheeps[ly][lx - 2] = sheeps[ly][lx - 1];
				sheeps[ly][lx - 1] = null;
				temp++;
			}
			if (arr[ly][lx - 1] == 12 && arr[ly][lx - 2] == 0) {
				arr[ly][lx - 1] = 8;
				arr[ly][lx - 2] = 4;
				sheeps[ly][lx - 1].setLocation((2 + lx * 50 - 100), 2 + ly * 50);
				sheeps[ly][lx - 2] = sheeps[ly][lx - 1];
				sheeps[ly][lx - 1] = null;
				temp--;
			}
			if (arr[ly][lx - 1] == 4) {
				if (arr[ly][lx - 2] != 1 && arr[ly][lx - 2] != 4 && arr[ly][lx - 2] != 5) {
					arr[ly][lx - 1] = 0;
					arr[ly][lx - 2] = 4;
					sheeps[ly][lx - 1].setLocation((2 + lx * 50 - 100), 2 + ly * 50);
					sheeps[ly][lx - 2] = sheeps[ly][lx - 1];
					sheeps[ly][lx - 1] = null;
				} else {
					Icon a = new ImageIcon("zuo.png");
					htl.setIcon(a);
					return;
				}
			}
			if (arr[ly][lx - 1] == 5) {
				if (arr[ly][lx - 2] != 1 && arr[ly][lx - 2] != 4 && arr[ly][lx - 2] != 5 && arr[ly][lx - 2] != 8
						&& arr[ly][lx - 2] != 12) {
					arr[ly][lx - 1] = 0;
					arr[ly][lx - 2] = 5;
					sheeps[ly][lx - 1].setLocation((2 + lx * 50 - 100), 2 + ly * 50);
					sheeps[ly][lx - 2] = sheeps[ly][lx - 1];
					sheeps[ly][lx - 1] = null;
				} else {
					Icon a = new ImageIcon("zuo.png");
					htl.setIcon(a);
					return;
				}
			}
			int x = (int) htl.getLocation().getX();
			int y = (int) htl.getLocation().getY();
			htl.setLocation(x - 50, y);
			Icon a = new ImageIcon("zuo.png");
			htl.setIcon(a);
			lx = lx - 1;
			panduan();
			return;
		}
		if (i == 38) {
			if (arr[ly - 1][lx] == 1 || arr[ly - 1][lx] == 4 && arr[ly - 2][lx] == 12
					|| arr[ly - 1][lx] == 12 && arr[ly - 2][lx] == 4
					|| arr[ly - 1][lx] == 12 && arr[ly - 2][lx] == 12) {
				Icon a = new ImageIcon("shang.png");
				htl.setIcon(a);
				return;
			}
			if (arr[ly - 1][lx] == 4 && arr[ly - 2][lx] == 8) {
				arr[ly - 1][lx] = 0;
				arr[ly - 2][lx] = 12;
				sheeps[ly - 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 - 100);
				sheeps[ly - 2][lx] = sheeps[ly - 1][lx];
				sheeps[ly - 1][lx] = null;
				temp++;
			}
			if (arr[ly - 1][lx] == 12 && arr[ly - 2][lx] == 8) {
				arr[ly - 1][lx] = 8;
				arr[ly - 2][lx] = 12;
				sheeps[ly - 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 - 100);
				sheeps[ly - 2][lx] = sheeps[ly - 1][lx];
				sheeps[ly - 1][lx] = null;

			}
			if (arr[ly - 1][lx] == 12 && arr[ly - 2][lx] == 0) {
				arr[ly - 1][lx] = 8;
				arr[ly - 2][lx] = 4;
				sheeps[ly - 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 - 100);
				sheeps[ly - 2][lx] = sheeps[ly - 1][lx];
				sheeps[ly - 1][lx] = null;
				temp--;
			}
			if (arr[ly - 1][lx] == 4) {
				if (arr[ly - 2][lx] != 1 && arr[ly - 2][lx] != 4 && arr[ly - 2][lx] != 5) {
					arr[ly - 1][lx] = 0;
					arr[ly - 2][lx] = 4;
					sheeps[ly - 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 - 100);
					sheeps[ly - 2][lx] = sheeps[ly - 1][lx];
					sheeps[ly - 1][lx] = null;
				} else {
					Icon a = new ImageIcon("shang.png");
					htl.setIcon(a);
					return;
				}
			}
			if (arr[ly - 1][lx] == 5) {
				if (arr[ly - 2][lx] != 1 && arr[ly - 2][lx] != 4 && arr[ly - 2][lx] != 5 && arr[ly - 2][lx] != 8
						&& arr[ly - 2][lx] != 12) {
					arr[ly - 1][lx] = 0;
					arr[ly - 2][lx] = 5;
					sheeps[ly - 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 - 100);
					sheeps[ly - 2][lx] = sheeps[ly - 1][lx];
					sheeps[ly - 1][lx] = null;
				} else {
					Icon a = new ImageIcon("shang.png");
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
			panduan();
			return;
		}
		if (i == 39) {
			if (arr[ly][lx + 1] == 1 || arr[ly][lx + 1] == 4 && arr[ly][lx + 2] == 12
					|| arr[ly][lx + 1] == 12 && arr[ly][lx + 2] == 1 || arr[ly][lx + 1] == 12 && arr[ly][lx + 2] == 4
					|| arr[ly][lx + 1] == 12 && arr[ly][lx + 2] == 12) {
				Icon a = new ImageIcon("you.png");
				htl.setIcon(a);
				return;
			}

			if (arr[ly][lx + 1] == 4 && arr[ly][lx + 2] == 8) {
				arr[ly][lx + 1] = 0;
				arr[ly][lx + 2] = 12;
				sheeps[ly][lx + 1].setLocation((2 + lx * 50 + 100), 2 + ly * 50);
				sheeps[ly][lx + 2] = sheeps[ly][lx + 1];
				sheeps[ly][lx + 1] = null;
				temp++;
			}

			if (arr[ly][lx + 1] == 4 && arr[ly][lx + 2] == 8) {
				arr[ly][lx + 1] = 0;
				arr[ly][lx + 2] = 12;
				sheeps[ly][lx + 1].setLocation((2 + lx * 50 + 100), 2 + ly * 50);
				sheeps[ly][lx + 2] = sheeps[ly][lx + 1];
				sheeps[ly][lx + 1] = null;
			}

			if (arr[ly][lx + 1] == 12 && arr[ly][lx + 2] == 0) {
				arr[ly][lx + 1] = 8;
				arr[ly][lx + 2] = 4;
				sheeps[ly][lx + 1].setLocation((2 + lx * 50 + 100), 2 + ly * 50);
				sheeps[ly][lx + 2] = sheeps[ly][lx + 1];
				sheeps[ly][lx + 1] = null;
				temp--;
			}
			if (arr[ly][lx + 1] == 4) {
				if (arr[ly][lx + 2] != 1 && arr[ly][lx + 2] != 4 && arr[ly][lx + 2] != 5) {
					arr[ly][lx + 1] = 0;
					arr[ly][lx + 2] = 4;
					sheeps[ly][lx + 1].setLocation((2 + lx * 50 + 100), 2 + ly * 50);
					sheeps[ly][lx + 2] = sheeps[ly][lx + 1];
					sheeps[ly][lx + 1] = null;
				} else {
					Icon a = new ImageIcon("you.png");// 首先要有图片
					htl.setIcon(a);
					return;
				}
			}
			if (arr[ly][lx + 1] == 5) {
				if (arr[ly][lx + 2] != 1 && arr[ly][lx + 2] != 4 && arr[ly][lx + 2] != 5 && arr[ly][lx + 2] != 8
						&& arr[ly][lx + 2] != 12) {
					arr[ly][lx + 1] = 0;
					arr[ly][lx + 2] = 5;
					sheeps[ly][lx + 1].setLocation((2 + lx * 50 + 100), 2 + ly * 50);
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
			panduan();
			return;
		}

		if (i == 40) {
			if (arr[ly + 1][lx] == 2) {
				num1++;
				System.out.println("灰太狼向下撞击次数：" + num1);
				if (num1 > 5) {
					arr[ly + 1][lx] = 0;
					arr[ly + 2][lx] = 2;
					sheeps[ly + 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 + 100);
					sheeps[ly + 2][lx] = sheeps[ly + 1][lx];
					sheeps[ly + 1][lx] = null;
					int x = (int) htl.getLocation().getX();
					int y = (int) htl.getLocation().getY();
					Icon a = new ImageIcon("htl.png");
					htl.setIcon(a);
					htl.setLocation(x, y + 50);
					ly = ly + 1;
				}
				Icon a = new ImageIcon("htl.png");
				htl.setIcon(a);
				return;
			}

			if (arr[ly + 1][lx] == 1 || arr[ly + 1][lx] == 4 && arr[ly + 2][lx] == 12
					|| arr[ly + 1][lx] == 12 && arr[ly + 2][lx] == 4
					|| arr[ly + 1][lx] == 12 && arr[ly + 2][lx] == 12) {
				Icon a = new ImageIcon("htl.png");
				htl.setIcon(a);
				return;
			}
			if (arr[ly + 1][lx] == 4 && arr[ly + 2][lx] == 8) {
				arr[ly + 1][lx] = 0;
				arr[ly + 2][lx] = 12;
				sheeps[ly + 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 + 100);
				sheeps[ly + 2][lx] = sheeps[ly + 1][lx];
				sheeps[ly + 1][lx] = null;
				temp++;
			}

			if (arr[ly + 1][lx] == 12 && arr[ly + 2][lx] == 8) {
				arr[ly + 1][lx] = 8;
				arr[ly + 2][lx] = 12;
				sheeps[ly + 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 + 100);
				sheeps[ly + 2][lx] = sheeps[ly + 1][lx];
				sheeps[ly + 1][lx] = null;
			}

			if (arr[ly + 1][lx] == 12 && arr[ly + 2][lx] == 0) {
				arr[ly + 1][lx] = 8;
				arr[ly + 2][lx] = 4;
				sheeps[ly + 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 + 100);
				sheeps[ly + 2][lx] = sheeps[ly + 1][lx];
				sheeps[ly + 1][lx] = null;
				temp--;
			}
			if (arr[ly + 1][lx] == 4) {
				if (arr[ly + 2][lx] != 1 && arr[ly + 2][lx] != 4 && arr[ly + 2][lx] != 5) {
					arr[ly + 1][lx] = 0;
					arr[ly + 2][lx] = 4;
					sheeps[ly + 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 + 100);
					sheeps[ly + 2][lx] = sheeps[ly + 1][lx];
					sheeps[ly + 1][lx] = null;
				} else {
					Icon a = new ImageIcon("htl.png");// 首先要有图片
					htl.setIcon(a);
					return;
				}
			}
			if (arr[ly + 1][lx] == 5) {
				if (arr[ly + 2][lx] != 1 && arr[ly + 2][lx] != 4 && arr[ly + 2][lx] != 5 && arr[ly + 2][lx] != 8
						&& arr[ly + 2][lx] != 12) {
					arr[ly + 1][lx] = 0;
					arr[ly + 2][lx] = 5;
					sheeps[ly + 1][lx].setLocation((2 + lx * 50), 2 + ly * 50 + 100);
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
			panduan();
			return;
		}
	}

	private void panduan() {
		System.out.println("羊进入笼子数量：" + temp);
		if (temp == num) {

			this.removeKeyListener(this); // 删除监听事件 游戏结束了 键盘再移动人物就无效了
			JDialog victory = new JDialog(this, "恭喜您通关啦", true);// new一个
																// JDialog 弹窗的类
																// (对象，弹框标题，最后确定一下)
			victory.setSize(410, 335); // 设置窗口尺寸 (宽 , 高)
			victory.setLocationRelativeTo(null); // 设置位置 相对于主窗体的
													// null是将窗体设置在居中的位置
			victory.setLayout(null);// 设置整个窗口的布局模式(自由布局)

			// JLabel info = new JLabel(new ImageIcon("1.png")); //匿名对象写法

			Icon i = new ImageIcon("bg2.jpg");// 创建一个图片对象 (需要放的图片)
			JLabel info = new JLabel(i);// 创建一个制作背景的对象 JLabel是制作背景的方法
										// (把图片名为i传进去)
			info.setBounds(0, 0, 400, 300);// 把东西哪个位置(x坐标，y坐标 ， 宽 ， 高)
			victory.add(info);// 将某个东西添加到窗体里面 (需要添加的东西)
			victory.setVisible(true);// 设置窗口显示，(是要显示窗口吗？) true

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
