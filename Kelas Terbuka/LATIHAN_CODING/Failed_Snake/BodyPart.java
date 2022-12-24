package com.tutorial;

import java.awt.Color;
import java.awt.Graphics;

public class BodyPart {

    private int xCoor, yCoor, width, height;

    public BodyPart(int xCoor, int yCoor, int tilesSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tilesSize;
        height = tilesSize;

    }

    public void tick(){

    }
    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(xCoor * width, yCoor * height, width, height);
    }

}