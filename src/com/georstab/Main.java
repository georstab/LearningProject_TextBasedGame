package com.georstab;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        World world = new World();
        world.AddRoom(3);
        world.AddRoom(2);
        world.AddRoom(1);

        World.Room item1 = world.GetNextRoom();
        World.Room item2 = world.PeekNextRoom();

        World.Room item3 = world.GetNextRoom();
        World.Room item4 = world.PeekNextRoom();

        System.out.println("popping the first room  --->>>   "+item1);
        System.out.println("peeking the next room  --->>>   "+item2);
        System.out.println("popping the next room   --->>>   "+item3);
        System.out.println("peeking the next room  --->>>   "+item4);






    }
}
