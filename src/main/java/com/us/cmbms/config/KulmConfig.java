/**
 * Copyright 2006-2015 handu.com
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.us.cmbms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.us.kulm.config.ApplicationConfig;
import com.us.kulm.config.ProtocolConfig;
import com.us.kulm.config.RegistryConfig;
import com.us.kulm.config.spring.AnnotationBean;

/**
 * KulmConfig
 *
 * @author Jinkai.Ma
 */
@Configuration
public class KulmConfig {

    private static final String REGISTRY_ADDRESS = "kulm.registry.address";
    private static final String REGISTRY_TIMEOUT = "kulm.registry.timeout";
    private static final String APPLICATION_NAME = "kulm.application.name";
    private static final String APPLICATION_OWNER = "kulm.application.owner";
    private static final String PROTOCOL_PORT = "kulm.protocol.port";

    @Autowired
    private Environment env;

    @Bean
    public static AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage("com.us.cmbms");
        return annotationBean;
    }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(env.getProperty(APPLICATION_NAME, "kulm-monitor"));
        applicationConfig.setOwner(env.getProperty(APPLICATION_OWNER));
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(env.getProperty(REGISTRY_ADDRESS));
        registryConfig.setTimeout(Integer.parseInt(env.getProperty(REGISTRY_TIMEOUT)));
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig("kulm");
        protocolConfig.setPort(Integer.parseInt(env.getProperty(PROTOCOL_PORT, "20880")));
        return protocolConfig;
    }
}
