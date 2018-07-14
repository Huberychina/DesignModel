package com.dlut.jeremy.ResponsibilityList;

abstract class ConsumeHandler {

    private ConsumeHandler nextHandler;

    public ConsumeHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ConsumeHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /** user������ free�������� */
    public abstract void doHandler(String user, double free);

}