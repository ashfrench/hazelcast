package com.excelian.hazelcast.practice;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class HazelcastJoiner {

    public static void main(String[] args) {
        HazelcastInstance instance = HazelcastClient.newHazelcastClient(new ClientConfig());

        IMap<Object, Object> dataHolder = instance.getMap("DataHolder");
        System.out.println(dataHolder);
        System.out.println(dataHolder.size());
        System.out.println(dataHolder.get(1));

    }
}
