package BusinessRule.Player;

import Model.mdlPlayer;
import java.util.List;

public interface IPlayer {
    void fncCreatePlayer(mdlPlayer objMdlPlayer);
    List<mdlPlayer> fncGetPlayers(mdlPlayer objMdlPlayer);
}
