package com.codewithcarrington;

//Public is an access modifier which means it is visible to all other classes in this project.
public class TextBox1 extends UIControl {
private String text = "";

//    public TextBox1() {
//        super(true);//Required since UI control has boolean parameters.
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
    this.text = text;
}
    public void clear(){
        text = "";
    }
}


