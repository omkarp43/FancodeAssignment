package com.fancode.test;

import com.fancode.api.TodoApi;
import com.fancode.model.Todo;
import com.fancode.model.User;
import com.fancode.utils.FilterUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class UserTodoTest {

    @Test
    public void testUsersWithMoreThanHalfTasksCompleted() throws IOException {
        List<User> users = TodoApi.getUsers();
        List<Todo> todos = TodoApi.getTodos();

        List<User> fanCodeCityUsers = FilterUtils.getUsersInFanCodeCity(users);

        for (User user : fanCodeCityUsers) {
            double completedPercentage = FilterUtils.getUserCompletedPercentage(user.getId(), todos);
            Assert.assertTrue(completedPercentage > 50, 
                "User " + user.getName() + " has less than 50% tasks completed");
        }
    }
}
