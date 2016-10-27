package org.openstreetmap.josm.plugins.tofix.bean;

import org.openstreetmap.josm.plugins.tofix.util.Config;

/**
 *
 * @author ruben
 */
public class AccessToTask {

    private String host = Config.HOST;
    private String task_id;
    private String task_source;
    private String task_name;
    private String task_comment;
    private boolean access;
    private Long osm_obj_id;
    private String key;

    public AccessToTask(String task_id, String task_source, boolean access) {
        this.task_id = task_id;
        this.task_source = task_source;
        this.access = access;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getTask_url() {
        System.out.println("Entro a gettaks_url");
        String url = this.getHost() + "tasks/" + this.getTask_id();        
        return url;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task) {
        this.task_id = task;
    }

    public String getTask_source() {
        return task_source;
    }

    public void setTask_source(String task_source) {
        this.task_source = task_source;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public String getTrack_url() {
        System.out.println("entro a get track_url");
        return getHost() + "tasks" + getTask_id(); // return getHost() + "track/" + getTask_id(); 
    }

    public String getFixed_url() {
        System.out.println("Entro a get fixed url");
        return getHost() + "tasks/" + getTask_id()+"/items/action/fixed"; //return getHost() + "fixed/" + getTask_id()
    }

    public String getNoterror_url() {
        System.out.println("Entro a not errir url");
        return getHost() + "tasks/" + getTask_id()+"/items/action/noterror";
         // return getHost() + "noterror/" + getTask_id(); 
    }

    public Long getOsm_obj_id() {
        return osm_obj_id;
    }

    public void setOsm_obj_id(Long osm_obj_id) {
        this.osm_obj_id = osm_obj_id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_comment() {
        return task_comment;
    }

    public void setTask_comment(String task_comment) {
        this.task_comment = task_comment;
    }

}
