package BusinessRule.Player;

import Broker.Player.brkPlayer;
import Model.mdlPlayer;

import java.util.List;

public class clsPlayer implements IPlayer {
    @Override
    public void createPlayerBBDD(mdlPlayer objMdlPlayer) {
        brkPlayer objBrkPlayer = new brkPlayer();
        objBrkPlayer.createPlayerBBDD(objMdlPlayer);
    }

    @Override
    public List<mdlPlayer> getRankingPlayers() {
        brkPlayer objBrkPlayer = new brkPlayer();
        return objBrkPlayer.getRankingPlayers();
    }
}
