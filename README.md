### Sokoban

这个是一个基于java开发的推箱子的游戏demo，/n
代码中分为三个步骤完成（代码中都有详细的注释）：
	MainFrame.java  第一步完成窗口和界面/图片的显示，但是功能没有实现（比如：灰太狼可以推动羊)
	MainFrame2.java 第二步完成功能实现
	MainFrame3.java 第三步完成灰太狼推动羊时遇见树/笼子/羊时做一些判断，以及最终的胜利判断（当笼子有三只羊）
	MainFrame4.java 这是我优化的一个彩蛋代码，下面有图片介绍

```java
//执行程序的入口类
//new MainFrame();   调用程序查看效果
public class App {

	public static void main(String[] args) {
		new MainFrame4();		
	}
	
}
```
#### 界面
<img src="https://github.com/MrRice1202/Sokoban/blob/master/doc/2018-05-10_161833.png"/>

#### 彩蛋
<img src="https://github.com/MrRice1202/Sokoban/blob/master/doc/2018-05-10_161943.png"/> 

