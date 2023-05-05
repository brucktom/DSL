package api;

import static api.PictureDetail.*;

public interface Game {
    static IF1 create() {
        return null;
    }

    public static void main(String[] args) {
        Game g = Game.create().
                player("jan")
                .player(name("jan"))
                .player(name("jana"), level(3))
                .player(name("lara"), age(22), level(2))
                .asMaster()
                .setInSpace();

    }
}
