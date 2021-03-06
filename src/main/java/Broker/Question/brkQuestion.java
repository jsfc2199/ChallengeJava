package Broker.Question;

import Model.mdlQuestion;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class brkQuestion implements IBrkQuestion {

    @Override
    public List<mdlQuestion> getQuestions(Integer category) {
        ObjectMapper objectMapper = new ObjectMapper ();
        List<mdlQuestion> lstMdlQuestion = new ArrayList<>();

        URL resource = brkQuestion.class.getClassLoader().getResource( "QuestionsDB.json");
        byte[] bytes;
        try {
            bytes = Files.readAllBytes(Paths.get(resource.toURI()));
            String json = new String(bytes);
            JsonNode node = objectMapper.readTree(json);

            if (node.isArray ()) {
                for (JsonNode jsonNode : node) {
                    mdlQuestion objMdlQuestion = objectMapper.treeToValue(jsonNode, mdlQuestion.class);
                    lstMdlQuestion.add(objMdlQuestion);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return lstMdlQuestion;
    }
}
