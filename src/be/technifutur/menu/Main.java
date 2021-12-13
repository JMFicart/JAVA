package be.technifutur.menu;

public class Main {
	public static void main(String[] args) {
		MenuFactory mf = new MenuFactory();
		boolean flag = true;
		Runnable action; //= mf.getMenu().getAction();

		while (flag) {
			action = mf.getMenu().getAction();
			if (action != null) {
				action.run();
			}
			else
			{
				flag = false;
			}
		}
	}
}
