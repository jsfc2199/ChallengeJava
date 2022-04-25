package BusinessRule.Player;

import Broker.Player.IBrkPlayer;
import Broker.Player.brkPlayer;
import Model.mdlPlayer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class clsPlayer implements IClsPlayer {
    @Override
    public void createPlayer(mdlPlayer objMdlPlayer) {
        IBrkPlayer objBrkPlayer = new brkPlayer();
        objBrkPlayer.createPlayer(objMdlPlayer);
    }

    @Override
    public List<mdlPlayer> getRankingPlayers() {
        IBrkPlayer objBrkPlayer = new brkPlayer();
        List<mdlPlayer> lstMdlPlayer = objBrkPlayer.getPlayers();

        return lstMdlPlayer.stream()
                .sorted(Comparator.comparing(mdlPlayer::getScore)
                        .reversed()).collect(Collectors.toList());
    }
}
