package com.dlut.jeremy.FactoryMethod;

public class NvWa {

	public static void main(String[] args) {

		// ������������¯

		AbstractHumanFactory YinYangLu = new HumanFactory();

		// Ů洵�һ�����ˣ�����㣬ȱ�ݲ�Ʒ

		System.out.println("--����ĵ�һ�����ǰ�ɫ����--");

		Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);

		whiteHuman.getColor();

		whiteHuman.talk();

		// Ů洵ڶ������ˣ������㣬���Ǵ�Ʒ��

		System.out.println("\n--����ĵڶ������Ǻ�ɫ����--");

		Human blackHuman = YinYangLu.createHuman(BlackHuman.class);

		blackHuman.getColor();

		blackHuman.talk();

		// ���������ˣ����ոպã���Ʒ����ɫ����

		System.out.println("\n--����ĵ��������ǻ�ɫ����--");

		Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);

		yellowHuman.getColor();

		yellowHuman.talk();

	}

}