package be.technifutur.menu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		MenuFactory mf = new MenuFactory();
		boolean flag = true;

		while (flag) {
			mf.getMenu().run();
		}
	}

	public static void main1(String[] args) {
		MenuFactory mf = new MenuFactory();
		Scanner sc = new Scanner(System.in);
		int choix = 0;
		boolean flag = true;
		Item[] menuitems = {mf.getItemHelloWorld(), mf.getItemExY1(), mf.getItemExY2(), mf.getItemExY3(), mf.getItemExY4()};

		while (flag) {
			for (int i = 0; i < menuitems.length ; i++) {
				System.out.println((i + 1) + " " + menuitems[i].getName());
			}
			System.out.println("0 Quit");
			System.out.print("Enter your choice ");
			choix = Integer.parseInt(sc.nextLine());

			if (choix > menuitems.length)
			{
				System.out.println("Bad choice !");
			}
			else
			{
				if (choix > 0)
				{
					menuitems[choix - 1].getAction().run();
				}
				else
				{
					flag = false;
				}
			}
		}
	}
}
