package pl.sda.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JacksonHelloWorld {
    public static void main(String[] args) throws IOException {
        String userJson ="{\"name\":\"George\"}";
//        String userJson ="[{\"name\":\"George\"}]";
        ObjectMapper objectMapper = new ObjectMapper();

        // wczystanie jednego
//        User userFromFile=objectMapper.readValue(Paths.get("users.json").toFile(), User.class);
//        System.out.println(userFromFile);

        //z tablicy
        List<User> userFromFile=objectMapper.readValue(Paths.get("users.json").toFile(), new TypeReference<List<User>>(){});
        System.out.println(userFromFile);

        User user = objectMapper.readValue(userJson, User.class);
//        List<User> user = objectMapper.readValue(userJson,  new TypeReference<List<User>>(){});
        System.out.println(user);

        String maria = objectMapper.writeValueAsString(new User("Maria"));
        System.out.println(maria);

    }
}
