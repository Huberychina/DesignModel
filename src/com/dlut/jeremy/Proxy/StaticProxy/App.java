package com.dlut.jeremy.Proxy.StaticProxy;

import com.dlut.jeremy.Proxy.DynamicProxy.UserDao;
import com.dlut.jeremy.Proxy.DynamicProxy.UserDaoProxy;

/**
 * ������
 */
public class App {
    public static void main(String[] args) {
        //Ŀ�����
        UserDao target = new UserDao();

        //�������,��Ŀ����󴫸��������,���������ϵ
        UserDaoProxy proxy = new UserDaoProxy(target);

        proxy.save();//ִ�е��Ǵ���ķ���
    }
}
