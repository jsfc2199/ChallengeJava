package BusinessRule.Player;

import Model.mdlPlayer;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class clsPlayer implements IPlayer {
    @Override
    public void fncCreatePlayer(mdlPlayer objMdlPlayer) {
        // TODO: Insertar un nuevo jugador al json "PlayersDB.json" en el paquete "DataBase"
        ObjectMapper om = new ObjectMapper();
        try{
            om.writeValue(new File("PlayerDB.json", objMdlPlayer));
        }catch(JsonGenerationException e){

        }catch (JsonMappingException e){

        }catch (IOException e){

        }


    }

    @Override
    public List<mdlPlayer> fncGetPlayers(mdlPlayer objMdlPlayer) {
        // TODO: Leer los jugadores del json "PlayersDB.txt" en el paquete "DataBase"
        return null;
    }
}
