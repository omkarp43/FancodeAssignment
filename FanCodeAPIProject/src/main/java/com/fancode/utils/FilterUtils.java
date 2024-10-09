package com.fancode.utils;

import com.fancode.model.Todo;
import com.fancode.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class FilterUtils {

    public static List<User> getUsersInFanCodeCity(List<User> users) {
        return users.stream()
                .filter(user -> {
                    double lat = Double.parseDouble(user.getAddress().getGeo().getLat());
                    double lng = Double.parseDouble(user.getAddress().getGeo().getLng());
                    return lat > -40 && lat < 5 && lng > 5 && lng < 100;
                })
                .collect(Collectors.toList());
    }

    public static double getUserCompletedPercentage(int userId, List<Todo> todos) {
        List<Todo> userTodos = todos.stream()
                .filter(todo -> todo.getUserId() == userId)
                .collect(Collectors.toList());
        long completedCount = userTodos.stream().filter(Todo::isCompleted).count();
        return (userTodos.isEmpty()) ? 0 : (completedCount * 100.0) / userTodos.size();
    }
}
