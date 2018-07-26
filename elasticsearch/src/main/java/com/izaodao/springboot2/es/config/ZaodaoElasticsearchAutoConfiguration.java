package com.izaodao.springboot2.es.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.TransportClientFactoryBean;

import java.util.Properties;

/**
 * @Auther: Mengqingnan
 * @Description:
 * @Date: 2018/7/26 上午11:41
 * Copyright (c) 2018, zaodao All Rights Reserved.
 */
@Configuration
@ConditionalOnClass( {Client.class, TransportClientFactoryBean.class})
@ConditionalOnProperty(prefix = "spring.data.elasticsearch.zaodao", name = "cluster-nodes", matchIfMissing = false)
@EnableConfigurationProperties(ZaodaoElasticsearchProperties.class)
public class ZaodaoElasticsearchAutoConfiguration {

    private final ZaodaoElasticsearchProperties properties;

    public ZaodaoElasticsearchAutoConfiguration(ZaodaoElasticsearchProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean
    public TransportClient elasticsearchClient() throws Exception {
        TransportClientFactoryBean factory = new TransportClientFactoryBean();
        factory.setClusterNodes(this.properties.getClusterNodes());
        factory.setProperties(createProperties());
        factory.afterPropertiesSet();
        return factory.getObject();
    }

    private Properties createProperties() {
        Properties properties = new Properties();
        properties.put("cluster.name", this.properties.getClusterName());
        properties.put("client.transport.sniff", this.properties.getClientTransportSniff());
        properties.put("client.transport.ignore_cluster_name", this.properties.getClientIgnoreClusterName());
        properties.put("client.transport.ping_timeout", this.properties.getClientPingTimeout());
        properties.put("client.transport.nodes_sampler_interval", this.properties.getClientNodesSamplerInterval());
        return properties;
    }
}
