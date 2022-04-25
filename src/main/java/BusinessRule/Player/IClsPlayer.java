package BusinessRule.Player;

import Model.mdlPlayer;
import java.util.List;

public interface IClsPlayer {
    void createPlayerDDBB(mdlPlayer objMdlPlayer);
    List<mdlPlayer> getRankingPlayers();
}
