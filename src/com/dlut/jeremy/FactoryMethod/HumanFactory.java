package com.dlut.jeremy.FactoryMethod;

public class HumanFactory extends AbstractHumanFactory {

	public Human createHuman(Class<? extends Human> c) {

		// ����һ������������

		Human human = null;

		try {

			// ����һ������

			human = (Human) Class.forName(c.getName()).newInstance();

		} catch (Exception e) {

			System.out.println("�������ɴ���");

		}

		return human;

	}

}
