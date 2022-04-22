package Main;

import DataBase.Seriallization;
import Game.Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Seriallization saveData = new Seriallization();

        try {
            saveData.savingData();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


//        Player player = new Player("Juan", 0);
//
//        //System.out.println(player.getName());
//        HashMap borrar = new HashMap();
//        ArrayList borrar2 = new ArrayList();
//        borrar2.add(15);
//        borrar2.add(15);
//        borrar2.add(15);
//        borrar2.add(15);
//
//        //System.out.println(borrar2);
//
//        borrar.put("option",borrar2);
//
//        Object[] opciones = borrar.values().toArray();
//        for (Object o : borrar.values().toArray()) {
//            System.out.println(o.getClass());
//        }

        //System.out.println();

    }
}
