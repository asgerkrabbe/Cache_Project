package com.cache;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.TimeUnit;

public class User {

    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        String generatedString = RandomStringUtils.randomAlphabetic(10);

        return generatedString;
    }


}
