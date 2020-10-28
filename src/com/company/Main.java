package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        weapon.setNameWeapon(" M 416 ");
        weapon.setTypeOfWeapon(" служебный");
        boss.setDamage(70);
        boss.setHealth(800);
        boss.setWeapon(weapon);
        System.out.println("Damage = " + boss.getDamage() + "\n" + "Health = " + boss.getHealth()  + "\n" +
               "Name = " +  boss.getWeapon().getNameWeapon() + "\n" + "Type = " + boss.getWeapon().getTypeOfWeapon() );

    }
}
