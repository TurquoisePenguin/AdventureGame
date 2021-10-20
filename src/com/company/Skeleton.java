package com.company;
import java.util.*;

public class Skeleton implements EnemyClass{
    Random rand = new Random();
    //random.nextInt(max - min) + min;
    int level=1;
    double maxHP= rand.nextInt(3 - 2) + 2;;
    double curHP= this.maxHP;
    double maxMP=2;
    double curMP= this.maxMP;
    double strength=1;
    double intelligence=1;
    double defense=1;
    double resistance=1;
    double speed=3;
    String name = "Skeleton";
    String selectedAttack = "";

    public int getLevel(){
        return level;
    }
    public void setLevel(final int level){
        this.level=level;
    }
    public void increaseLevel(){
        this.level++;
    }

    public boolean isDead(){
        return (curHP==0);
    }

    public double getHP(){
        return this.curHP;
    }

    public double getMaxHP(){
        return this.maxHP;
    }
    public void setHP(final double newHP){
        this.curHP=newHP;
    }

    public void takeDamage(final double valueToSubstract){
        this.curHP = this.curHP - valueToSubstract;
    }

    //deal damage to player
    public boolean attack(final Character target){
        //TODO
        return true;
    }

    public double getMinMeleeDamage(){
        return 0;
    }
    public double getMaxMeleeDamage(){
        return 3;
    }

    public String getName() {
        return name;
    }

    public String getSelectedAttack() {
        return selectedAttack;
    }

    public void setSelectedAttack(String selectedAttack) {
        this.selectedAttack = selectedAttack;
    }

    //constructor
    public Skeleton() {
    }
}
