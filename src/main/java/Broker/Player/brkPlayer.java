package Broker.Player;

import Model.mdlPlayer;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class brkPlayer implements IPlayer {
    @Override
    public void createPlayerBBDD(mdlPlayer objMdlPlayer) {

        List<mdlPlayer> lstMdlPlayer = getRankingPlayers();
        lstMdlPlayer.add(objMdlPlayer);

        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File("D:\\Sofka\\Liga de Entrenamiento\\Entrenamiento\\0_Proyectos\\ChallengeJava\\src\\main\\resources\\PlayersDB.json"), lstMdlPlayer);
        }catch(JsonGenerationException e){
            e.printStackTrace();
        }catch (JsonMappingException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<mdlPlayer> getRankingPlayers() {
        ObjectMapper objectMapper = new ObjectMapper ();
        List<mdlPlayer> lstMdlPlayer = new ArrayList<>();

        URL resource = brkPlayer.class.getClassLoader().getResource( "PlayersDB.json");
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get(resource.toURI()));
            String json = new String(bytes);
            JsonNode node = objectMapper.readTree(json);

            if (node.isArray ()) {
                for (JsonNode jsonNode : node) {
                    //String id = jsonNode.get("id").asText();
                    mdlPlayer objMdlPlayer = objectMapper.treeToValue(jsonNode, mdlPlayer.class);
                    lstMdlPlayer.add(objMdlPlayer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return lstMdlPlayer;
//        return fncFilterPlayers(lstMdlPlayer);
    }

    private List<mdlPlayer> fncFilterPlayers(List<mdlPlayer> lstMdlPlayer){
        List<mdlPlayer> lstFilteredPlayers = new ArrayList<>();

        //lstFilteredPlayers = lstMdlPlayer.stream().filter( player -> player.category == category).collect(Collectors.toList());

        return lstFilteredPlayers;
    }
}
