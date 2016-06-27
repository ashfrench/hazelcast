package com.excelian.hazelcast.practice.listeners;

import com.hazelcast.map.MapPartitionLostEvent;
import com.hazelcast.map.listener.MapPartitionLostListener;

public class MyMapPartitionLostListener implements MapPartitionLostListener {

    @Override
    public void partitionLost(MapPartitionLostEvent mapPartitionLostEvent) {
        //DO LOGGING or something
    }
}
