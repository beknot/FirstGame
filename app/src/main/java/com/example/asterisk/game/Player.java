package com.example.asterisk.game;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Gravity;

public class Player {
    private Bitmap bitmap;
    private int speed = 0;
    private boolean boosting;
    private final int GRAVITY = -10;
    private int maxY,minY;
    private final int MIN_SPEED = 1;
    private final int MAX_SPEED = 40;
    private int playerX,playerY;

    public Player(MainActivity mainActivity, int x, int y) {
    playerX = 50;
    playerY = 50;
    speed = 1;
    bitmap = BitmapFactory.decodeResource(mainActivity.getResources(),R.drawable.player);
    minY = 0;
    maxY = y - (bitmap.getHeight()+80);
    boosting = false;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public float getX() {
        return playerX;
    }

    public float getY() {
        return playerY;
    }

    public void stopBoosting() {
        boosting = false;
    }

    public void setBoosting() {
        boosting = true;
    }

    public void update() {
    if (boosting) {
        speed = speed + 3;
    } else {
        speed = speed - 1;
    }
    if (speed > MAX_SPEED) {
        speed = MAX_SPEED;
    }
        if (speed < MIN_SPEED) {
            speed = MIN_SPEED;
        }
        playerY = playerY - (speed + GRAVITY);
    if(playerY < minY) {
        playerY = minY;
    } if(playerY > maxY) {
        playerY = maxY;
        }
    }

    public int getSpeed() {
        return speed;
    }
}
