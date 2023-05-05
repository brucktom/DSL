package api;

import static api.PictureDetail.*;

public interface Game {
    static IF1 create() {
        return null;
    }

    public static void main(String[] args) {
        Game g = Game.create().
                player(name("Brent"), age(27),level(3))
                .setOnEarth()
                .player(name("Mary")).asMaster()
                .player("Susie")
                .get();

    }
}
