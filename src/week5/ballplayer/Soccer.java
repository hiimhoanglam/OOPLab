package week5.ballplayer;

import week5.bouncingballs.Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Soccer {
    List<Player> team1 = new ArrayList<>();
    List<Player> team2 = new ArrayList<>();
    Container footballField = new Container(0,0,120,90);
    //The ball is in the middle of the field when the match starts
    Ball ball = new Ball(0,60,0);


    public Soccer() {
        for (int i = 1; i <= 11; i++) {
            team1.add(new Player(i,i,i,i));
        }
        for (int i = 12; i <= 22; i++) {
            team2.add(new Player(i,i,i,i));
        }
    }
    /*Randomly move the player within the range of the container
    Kick the ball
    If the ball is out of bound, reset it to the middle
    Too complex for a two day project
    */
    public void play() {

    }
}
