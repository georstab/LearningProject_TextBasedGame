package com.georstab;


import java.util.LinkedList;
import java.util.Random;

public class World {

    LinkedList<Room> world;

    public World() {
        this.world = new LinkedList<>();

    }

    public Room GetNextRoom() {
        return world.pop();
    }
    public Room PeekNextRoom() {return world.peek();}

    public void AddRoom(int lvl) {
        switch (lvl) {
            case 1:
                world.push(new RoomLevel1());
                break;
            case 2:
                world.push(new RoomLevel2());
                break;
            case 3:
                world.push(new RoomLevel3());
                break;
        }

    }


    public static class Room {

        LinkedList<Unit> enemies = new LinkedList();

        // Constructors for 1,2,3 type of enemies
        public Room(int numberOfType1, Unit o1) {
            for (int i = 0; i < numberOfType1; i++) {
                enemies.push(o1);
            }
        }

        public Room(int numberOfType1, Unit o1, int numberOfType2, Unit o2) {

            for (int i = 0; i < numberOfType1; i++) {
                enemies.push(o1);
            }
            for (int i = 0; i < numberOfType2; i++) {
                enemies.push(o2);
            }
        }

        public Room(int numberOfType1, Unit o1, int numberOfType2, Unit o2, int numberOfType3, Unit o3) {

            for (int i = 0; i < numberOfType1; i++) {
                enemies.push(o1);
            }
            for (int i = 0; i < numberOfType2; i++) {
                enemies.push(o2);
            }
            for (int i = 0; i < numberOfType3; i++) {
                enemies.push(o3);
            }

        }

        public Unit ReturnEnemy(){
            return (Unit) enemies.pop();
        }

        public String PeekEnemy() {
            return ((Unit ) enemies.peek()).getName();
        }


    }
    // LVL 1 Room : Contains : (1-3)*Goblins
    public static class RoomLevel1 extends Room {
        public RoomLevel1() {
            super(new Random().nextInt((3 - 1) + 1) + 1, new Unit.Goblin());
        }

        @Override
        public String toString() {
            return "RoomLevel1{" +
                    "enemies=" + enemies +
                    '}';
        }
    }
    //LVL 2 Room : Contains : (1-3)*Goblins and 1 Golem
    public static class RoomLevel2 extends Room {
        public RoomLevel2() {
            super(new Random().nextInt((3 - 1) +1) +1,new Unit.Goblin(),1,new Unit.Golem());
        }

        @Override
        public String toString() {
            return "RoomLevel2{" +
                    "enemies=" + enemies +
                    '}';
        }
    }
    //LVL 3 Room : Contains : 1 Dragon
    public static class RoomLevel3 extends Room {
        public RoomLevel3() {
            super(1, new Unit.Dragon());
        }

        @Override
        public String toString() {
            return "RoomLevel3{" +
                    "enemies=" + enemies +
                    '}';
        }
    }
}
