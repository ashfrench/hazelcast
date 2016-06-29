package com.excelian.hazelcast.practice.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DataHolderGenerator {

    public static DataHolder getNewDataHolder(){
        DataHolder dataHolder = new DataHolder();


        ArrayList<String> stuff = new ArrayList<>();
        Map<Integer,String> stuffMap = new HashMap<>();

        while(Math.random() * 10 < 8){
            stuff.add(UUID.randomUUID().toString());
            stuffMap.put((int) Math.round(Math.random() * 10), UUID.randomUUID().toString());

        }

        dataHolder.setX((int) (Math.random() * 1000));

        dataHolder.setStuffMap(stuffMap);
        dataHolder.setStuff(stuff);

        return dataHolder;
    }
}
