package com.codewithcarrington;

public final class CheckBox extends UIControl{ //If class is final it cannot be extended. Not used very often. Prevent use of inheritance and polymorphism.

    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }
}
