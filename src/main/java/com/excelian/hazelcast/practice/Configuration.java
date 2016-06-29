package com.excelian.hazelcast.practice;

import com.hazelcast.config.Config;
import com.hazelcast.config.JoinConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.config.TcpIpConfig;

public class Configuration {

    public static Config getConfig(){
        Config config = new Config();
        config.setInstanceName("Ash");
        NetworkConfig networkConfig = config.getNetworkConfig();
        networkConfig.setReuseAddress(true);

        JoinConfig join = networkConfig.getJoin();
        TcpIpConfig tcpIpConfig = join.getTcpIpConfig();
        tcpIpConfig.addMember("10.28.1.138-143");

        config.setNetworkConfig(networkConfig);
        config.setProperty("hazelcast.rest.enabled", "true");

        return config;

    }

}
