package com.dotuian.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.dotuian.dto.ListUser;
import com.dotuian.dto.ListUser.Entity;
import com.dotuian.dto.User;

public class ConvertUser extends XmlAdapter<ListUser, Map<Integer, User>> {

    @Override
    public Map<Integer, User> unmarshal(ListUser v) throws Exception {
        Map<Integer, User> map = new HashMap<Integer, User>();

        for (Entity e : v.getEntity()) {
            map.put(e.getKey(), e.getUser());
        }

        return null;
    }

    @Override
    public ListUser marshal(Map<Integer, User> v) throws Exception {
        ListUser listUser = new ListUser();

        List<Entity> entity = new ArrayList<Entity>();
        for (Integer key : v.keySet()) {
            entity.add(new Entity(key, v.get(key)));
        }
        listUser.setEntity(entity);

        return listUser;
    }

}
