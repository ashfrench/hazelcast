package com.excelian.hazelcast.practice;

import com.excelian.hazelcast.practice.model.DataHolder;
import com.excelian.hazelcast.practice.model.DataHolderGenerator;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class HazelcastMain {

    public static void main(String[] args) {
        Config config = Configuration.getConfig();
        HazelcastInstance instance = Hazelcast.newHazelcastInstance(config);

        IMap<Integer, String> mapCustomers = instance.getMap("Customers");
        mapCustomers.put(1, "Joe");
        mapCustomers.put(2, "Ali");
        mapCustomers.put(3, "Avi");

        System.out.println("Customer with key 1: "+ mapCustomers.get(1));
        System.out.println("Map Size:" + mapCustomers.size());

        IMap<Integer, DataHolder> dataHolderMap = instance.getMap("DataHolder");
        dataHolderMap.put(1, DataHolderGenerator.getNewDataHolder());
        dataHolderMap.put(2, DataHolderGenerator.getNewDataHolder());
        dataHolderMap.put(3, DataHolderGenerator.getNewDataHolder());

        System.out.println("Dataholder 1: " + dataHolderMap.get(1));
        System.out.println("Dataholder size: " + dataHolderMap.size());

    }

}
