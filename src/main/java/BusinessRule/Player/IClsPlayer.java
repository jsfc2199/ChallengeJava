package BusinessRule.Player;

import Model.mdlPlayer;
import java.util.List;

public interface IClsPlayer {
    void createPlayer(mdlPlayer objMdlPlayer);
    List<mdlPlayer> getRankingPlayers();
}
