package com.ma;

import java.util.List;

class Game {

    private Player player;

    private List<String> opponents;

    public Game(Player player, List<String> opponents) {
        this.player = player;
        this.opponents = opponents;
    }

    public int numberOfEnemies() {
        return opponents.size();
    }

    public String attack() {
        return "Player attack with: " + player.getWeapon();
    }
}