package PatronesCreacionales.builder;

import javax.swing.*;

public class TestBuilder {

    public static void main(String[] args) {
        Enemy enemy= Enemy.builder()
                .name("Pepe")
                .type("Magician")
                .build();

        System.out.println(enemy.toString());

        Enemy enemy1=Enemy.builder()
                .name("Jose")
                .type("Warrior")
                .health(100)
                .build();
        System.out.println(enemy1.toString());
    }
}
