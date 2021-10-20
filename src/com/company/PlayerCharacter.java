package com.company;

public class PlayerCharacter implements Character{
    //TODO: Implement status check
    //stats?
    double maxHP=10;
    double curHP=10;
    double maxMP=10;
    double curMP=10;
    double strength=10;
    double intelligence=10;
    double defense=10;
    double resistance=10;
    double speed=10;
    int level=1;
    String[] playerSkills = {"Punch", "Kick"};

    //characteristics?
    String playerName;

//constructors
    public PlayerCharacter(int level, double maxHP, double curHP, double maxMP, double curMP, double strength, double intelligence, double defense, double resistance, double speed, String playerName) {
        this.maxHP = maxHP;
        this.curHP = curHP;
        this.maxMP = maxMP;
        this.curMP = curMP;
        this.strength = strength;
        this.intelligence = intelligence;
        this.defense = defense;
        this.resistance = resistance;
        this.speed = speed;
        this.playerName = playerName;
    }

    public PlayerCharacter(String playerName) {
        this.playerName = playerName;
    }

    public double getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(double maxHP) {
        this.maxHP = maxHP;
    }

    public double getCurHP() {
        return curHP;
    }

    public void setCurHP(double curHP) {
        this.curHP = curHP;
    }

    public double getMaxMP() {
        return maxMP;
    }

    public void setMaxMP(double maxMP) {
        this.maxMP = maxMP;
    }

    public double getCurMP() {
        return curMP;
    }

    public void setCurMP(double curMP) {
        this.curMP = curMP;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
