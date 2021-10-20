package com.company;

public interface EnemyClass {
    //stats

    //characteristics
    int getLevel();
    void setLevel(final int level);
    void increaseLevel();
    boolean isDead();
    double getHP();
    double getMaxHP();
    void setHP(final double newHP);
    void takeDamage(final double valueToSubstract);
    boolean attack(final Character target);
    double getMinMeleeDamage();
    double getMaxMeleeDamage();;
    String name="NULL";
    String getName();
}
