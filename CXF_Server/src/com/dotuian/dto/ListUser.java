package com.dotuian.dto;

import java.util.List;

public class ListUser {

    private List<Entity> entity;

    public ListUser() {

    }

    public ListUser(List<Entity> entity) {
        this.entity = entity;
    }

    public static class Entity {
        private Integer key;
        private User user;

        public Entity() {

        }

        public Entity(Integer key, User user) {
            super();
            this.key = key;
            this.user = user;
        }

        public Integer getKey() {
            return key;
        }

        public void setKey(Integer key) {
            this.key = key;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }

    public List<Entity> getEntity() {
        return entity;
    }

    public void setEntity(List<Entity> entity) {
        this.entity = entity;
    }

}
