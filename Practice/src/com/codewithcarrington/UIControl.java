package com.codewithcarrington;

public class UIControl {
    public boolean isEnabled() {
        return isEnabled;
    }

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    private boolean isEnabled = true;

    public void enable(){
        isEnabled = true;
    }

    public void disable (){
        isEnabled = false;
    }
}
