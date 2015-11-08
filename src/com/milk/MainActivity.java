package com.milk;

import com.orange.ui.activity.GameActivity;
import com.orange.ui.launcher.GameLauncher;
import com.milk.MilkLauncher;

/**
 * 我的小小战争主入口方法
 * @author LY
 *
 */
public class MainActivity extends GameActivity {
	@Override
	public GameLauncher CreateGameLauncher() {
		// 游戏引擎
		GameLauncher launcher = new MilkLauncher();
		return launcher;
	}
}
