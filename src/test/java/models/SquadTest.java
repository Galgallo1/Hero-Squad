package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
        Squad squad = squad();
        squad.setName("Abdi");
        assertEquals("Abdi", squad.getName());
    }

    @Test
    public void getDedicatedToFight() {
        Squad squad = squad();
        assertEquals("Racism", squad.getDedicatedToFight());
    }

    @Test
    public void setDedicatedToFight() {
        Squad squad = squad();
        squad.setDedicatedToFight("tribalism");
        assertEquals("tribalism", squad.getDedicatedToFight());
    }

    @Test
    public void getMaxSize() {
        Squad squad = squad();
        assertEquals(5, squad.getMaxSize());
    }

    @Test
    public void setMaxSize() {
        Squad squad = squad();
        squad.setMaxSize(6);
        assertEquals(6, squad.getMaxSize());
    }

    @Test
    public void getSquads() {
        Squad squad = squad();
        assertTrue(squad instanceof Squad);
    }

    //helper method
    Squad squad(){
        return new Squad("Achievers","Racism", 5);
    }
}