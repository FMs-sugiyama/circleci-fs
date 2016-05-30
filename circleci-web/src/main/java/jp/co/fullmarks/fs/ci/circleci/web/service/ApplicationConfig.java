/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.fullmarks.fs.ci.circleci.web.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author sugiyama
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        try {
            Class<?> jsonProvider = Class.forName("org.glassfish.jersey.jackson.JacksonFeature");
            resources.add(jsonProvider);
            Class<?> multiPartFeature = Class.forName("org.glassfish.jersey.media.multipart.MultiPartFeature");
            resources.add(multiPartFeature);

        } catch (ClassNotFoundException ex) {
            //LoggerFactory.getLogger(getClass().getName()).error(null, ex);
        }
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(jp.co.fullmarks.fs.ci.circleci.web.service.SampleService.class);
    }

}
