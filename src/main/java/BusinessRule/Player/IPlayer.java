package BusinessRule.Player;

import Model.mdlPlayer;
import java.util.List;

public interface IPlayer {
    mdlPlayer fncCreatePlayer(mdlPlayer objMdlPlayer);
    List<mdlPlayer> fncGetPlayers(mdlPlayer objMdlPlayer);
}
