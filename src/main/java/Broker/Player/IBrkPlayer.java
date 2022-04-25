package Broker.Player;

import Model.mdlPlayer;

import java.util.List;

public interface IPlayer {
    void createPlayerBBDD(mdlPlayer objMdlPlayer);
    List<mdlPlayer> getRankingPlayers();
}
