package com.dlut.jeremy.Proxy.DynamicProxy;

/**
 * �ӿ�ʵ��
 * Ŀ�����
 */
public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----�Ѿ���������!----");
    }
}