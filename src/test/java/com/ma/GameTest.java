package com.ma;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 *  you don't have to do this
 *  Game game = new Game(player);
 */
@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    // Player is mocked
    @Mock
    Player player;

    // we use spy so real object will be used
    @Spy
    List<String> enemies = new ArrayList<>();

    // we injected game so we dont need to construct it as  Game game = new Game(player);
    @InjectMocks
    Game game;

    @Test
    public void attackWithSwordTest() throws Exception {
        // as it is mocked we define what we expect.
        Mockito.when(player.getWeapon()).thenReturn("Sword");

        enemies.add("Dragon");
        enemies.add("Orc");
        // as we used spy so the add enemies  is 2
        assertEquals(2, game.numberOfEnemies());
        // as it already mocked so we get it as the result. 
        assertEquals("Player attack with: Sword", game.attack());
    }
}