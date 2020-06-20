package com.georstab;

public class Unit {

    private String name;
    private int health;
    private int mana;
    private String weapon;
    private int strength;
    private int agility;
    private int intelligence;
    private Behaviors.MoveBehavior move;
    private Behaviors.AttackBehavior attack;

    public Unit(String name, int health, int mana,String weapon, int strength, int agility, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.weapon = weapon;
    }

    public void setMove(Behaviors.MoveBehavior move) {
        this.move = move;
    }

    public void setAttack(Behaviors.AttackBehavior attack) {
        this.attack = attack;
    }


    // Take Damage , Heal Damage
    public void takeDamage(int amount) {
        this.health -= amount;
    }

    public void healDamage(int amount) {
        this.health += amount;
    }


    // Getters Setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                ", weapon='" + weapon + '\'' +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", move=" + move.moveType() +
                ", attack=" + attack.attackType() +
                '}';
    }

    // Inner unit classes

    // Heroes
    public static class SwordMan extends Unit{

        public SwordMan(String name) {
            super(name, 500, 0,"Sword",40,30,15);
            this.setAttack(new Behaviors.MeleeAttack());
            this.setMove(new Behaviors.Walk());
        }
    }
    public static class Pikeman extends Unit{
        public Pikeman(String name,String weapon) {
            super(name,500,0,"Pike",50,20,15);
            this.setAttack(new Behaviors.MeleeAttack());
            this.setMove(new Behaviors.Walk());
        }
    }
    public static class Archer extends Unit {
        public Archer(String name) {
            super(name,250,0,"Bow",20,40,15);
            this.setAttack(new Behaviors.RangedAttack());
            this.setMove(new Behaviors.Walk());
        }
    }
    public static class Mage extends Unit {
        public Mage(String name) {
            super(name,300,200,"Staff",20,20,40);
            this.setAttack(new Behaviors.MagicAttack());
            this.setMove(new Behaviors.Walk());
        }
    }

    // Monsters

    public static class Goblin extends Unit {
        public Goblin() {
            super("Goblin",100,0,"club",10,20,5);
            this.setAttack(new Behaviors.MeleeAttack());
            this.setMove(new Behaviors.Walk());
        }
    }
    public static class Golem extends Unit {
        public Golem() {
            super("Golem",400,0,"Fist",50,5,5);
            this.setAttack(new Behaviors.MeleeAttack());
            this.setMove(new Behaviors.Walk());
        }
    }
    public static class Dragon extends Unit {
        public Dragon() {
            super("Dragon",650,0,"Breath of fire",20,20,30);
            this.setAttack(new Behaviors.MagicAttack());
            this.setMove(new Behaviors.Fly());
        }
    }
}
