package com.fancode.api;

import com.fancode.model.Todo;
import com.fancode.model.User;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TodoApi {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static List<Todo> getTodos() throws IOException {
        Response response = ApiClient.get("/todos");
        return Arrays.asList(MAPPER.readValue(response.getBody().asString(), Todo[].class));
    }

    public static List<User> getUsers() throws IOException {
        Response response = ApiClient.get("/users");
        return Arrays.asList(MAPPER.readValue(response.getBody().asString(), User[].class));
    }
}
