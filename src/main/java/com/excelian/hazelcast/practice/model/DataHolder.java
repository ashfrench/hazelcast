package com.excelian.hazelcast.practice.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class DataHolder implements Serializable {

    private List<String> stuff;
    private int x;
    private Map<Integer, String> stuffMap;
}
