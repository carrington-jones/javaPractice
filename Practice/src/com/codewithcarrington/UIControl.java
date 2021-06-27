package com.codewithcarrington;

public abstract class UIControl {

    private boolean isEnabled = true;

    public boolean isEnabled() {
        return isEnabled;
    }

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//    }

public abstract void render();

    public final void enable(){ //Cannot override final methods. Not used often.
        isEnabled = true;
    }

    public void disable (){
        isEnabled = false;
    }
}
