package com.dlut.jeremy.FactoryMethod;

public class NvWa {

	public static void main(String[] args) {

		// 声明阴阳八卦炉

		AbstractHumanFactory YinYangLu = new HumanFactory();

		// 女娲第一次造人，火候不足，缺陷产品

		System.out.println("--造出的第一批人是白色人种--");

		Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);

		whiteHuman.getColor();

		whiteHuman.talk();

		// 女娲第二次造人，火候过足，又是次品，

		System.out.println("\n--造出的第二批人是黑色人种--");

		Human blackHuman = YinYangLu.createHuman(BlackHuman.class);

		blackHuman.getColor();

		blackHuman.talk();

		// 第三次造人，火候刚刚好，优品！黄色人种

		System.out.println("\n--造出的第三批人是黄色人种--");

		Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);

		yellowHuman.getColor();

		yellowHuman.talk();

	}

}