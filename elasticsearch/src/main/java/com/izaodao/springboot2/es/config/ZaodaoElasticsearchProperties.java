package com.izaodao.springboot2.es.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: Mengqingnan
 * @Description: 初始化配置文件信息
 * @Date: 2018/7/26 上午11:24
 * Copyright (c) 2018, zaodao All Rights Reserved.
 */
@ConfigurationProperties(prefix = "spring.data.elasticsearch.zaodao")
public class ZaodaoElasticsearchProperties {
    /**
     * es 集群名称
     */
    private String clusterName = "elasticsearch";

    /**
     * 集群节点列表
     */
    private String clusterNodes;

    /**
     *  是否支持客户端去嗅探整个集群的状态，如果项目里配置esip地址是外网IP ，此处不建议支持
     */
    private Boolean clientTransportSniff = false;
    /**
     *  客户端访问集群是否忽略集群名称
     */
    private Boolean clientIgnoreClusterName = Boolean.FALSE;
    /**
     *  客户端等待服务端返回数据的最大时长
     */
    private String clientPingTimeout = "5s";
    /**
     *  客户端对集群进行节点选取，这次节点进行互ping，此处设置的是ping的时长
     */
    private String clientNodesSamplerInterval = "5s";

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getClusterNodes() {
        return clusterNodes;
    }

    public void setClusterNodes(String clusterNodes) {
        this.clusterNodes = clusterNodes;
    }

    public Boolean getClientTransportSniff() {
        return clientTransportSniff;
    }

    public void setClientTransportSniff(Boolean clientTransportSniff) {
        this.clientTransportSniff = clientTransportSniff;
    }

    public Boolean getClientIgnoreClusterName() {
        return clientIgnoreClusterName;
    }

    public void setClientIgnoreClusterName(Boolean clientIgnoreClusterName) {
        this.clientIgnoreClusterName = clientIgnoreClusterName;
    }

    public String getClientPingTimeout() {
        return clientPingTimeout;
    }

    public void setClientPingTimeout(String clientPingTimeout) {
        this.clientPingTimeout = clientPingTimeout;
    }

    public String getClientNodesSamplerInterval() {
        return clientNodesSamplerInterval;
    }

    public void setClientNodesSamplerInterval(String clientNodesSamplerInterval) {
        this.clientNodesSamplerInterval = clientNodesSamplerInterval;
    }
}
