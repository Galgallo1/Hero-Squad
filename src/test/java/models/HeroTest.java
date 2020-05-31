package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void getName_returnsCorrectName_true() {
        Hero hero = hero();
        assertEquals("Ali", hero.getName());
    }

    @Test
    public void setName_setsCorrectName_true() {
        Hero hero = hero();
        assertEquals(1, hero.getAge());
    }

    @Test
    public void getAge_collectsCorrectAge_true() {
        Hero hero = hero();
        assertEquals("fire", hero.getSpecialPowers());
    }

    @Test
    public void setAge_setsCorrectAge_true() {
        Hero hero = new Hero("Ali", 1, "fire", "women", "hey");
        assertEquals("women", hero.getWeakness());
    }

    @Test
    public void getSpecialPowers_returnsCorrectly_true() {
        Hero hero = hero();
        assertEquals("hey", hero.getSquad());
    }

    @Test
    public void setSpecialPowers_setsAppropriateName_true() {
        Hero hero = hero();
        hero.setSpecialPowers("brick");
        assertEquals("brick", hero.getSpecialPowers());
    }

    @Test
    public void getWeakness_collectsCorrectWeakness_true() {
        Hero hero = new Hero("Ali", 1, "fire", "women", "hey");
        assertEquals("women", hero.getWeakness());
    }

    @Test
    public void setWeakness_setsCorrectWeakness_true() {
        Hero hero = new Hero("Ali", 1, "fire", "women", "hey");
        hero.setWeakness("madame");
        assertEquals("madame", hero.getWeakness());
    }

    @Test
    public void Hero_instantiateCorrectly_true() {
        Hero hero = hero();
        assertNotNull(hero);
    }

    @Test
    public void findById() {
        Hero hero = hero();
        assertEquals(1, Hero.findById(hero.getId()).getId());
    }

    @Test
    public void getSquad() {
        Hero hero = hero();
        assertEquals("hey", hero.getSquad());
    }

    //helper method
    public Hero hero(){
        return new Hero("Ali", 1, "fire", "women", "hey");
    }
}