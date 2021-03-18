package com.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    Map<Integer, String> userDataMap = new HashMap<>();
    User user = new User();

    public String get(int id) {
        return userDataMap.get(id);
    }

    public void set(int id) throws InterruptedException {
        String userOutput = user.getDataSlow();

        userDataMap.put(id, userOutput);
    }

    public void delete(int id) {
        userDataMap.remove(id);
    }

    public boolean has(int id) {
        if (userDataMap.containsKey(id)) {
            return true;
        } else {
            return false;
        }
    }
}