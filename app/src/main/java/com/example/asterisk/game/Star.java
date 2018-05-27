package com.example.asterisk.game;

import java.util.Random;

class Star {
    private  int starX,starY,maxX,maxY,speed;
    public Star(int x, int y) {
        maxX = x;
        maxY = y;
        Random random = new Random();
        speed = random.nextInt(20);
        starX = random.nextInt(maxX);
        starY = random.nextInt(maxY);
    }

    public float getX() {
        return starX;
    }

    public float getY() {
        return starY;
    }

    public void update(int playerSpeed) {
    starX = starX - playerSpeed - speed;
    if (starX < 0) {
        starX = maxX;
        Random ran = new Random();
        starY = ran.nextInt(maxY);
        speed = ran.nextInt(20);
    }
    }
}
