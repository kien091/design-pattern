package org.example;

abstract class Shape {
    private Color color;

    public String getColor() {
        return color.getColor();
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
