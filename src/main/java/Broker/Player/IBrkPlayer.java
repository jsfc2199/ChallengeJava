package Broker.Player;

import Model.mdlPlayer;

import java.util.List;

public interface IBrkPlayer {
    void createPlayer(mdlPlayer objMdlPlayer);
    List<mdlPlayer> getPlayers();
}
