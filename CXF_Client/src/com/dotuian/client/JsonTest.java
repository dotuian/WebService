package com.dotuian.client;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.dotuian.client.wsimport.User;

public class JsonTest {

    public static JSONObject createJsonObject(String name) {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name", "liqineng");
        String[] likes = new String[] { "music", "movie", "study" };
        jsonObj.put("hobby", likes);
        Map<String, String> ingredients = new HashMap<String, String>();
        ingredients.put("age", "23");
        ingredients.put("EnglishName", "spider man");
        ingredients.put("sex", "boy");
        ingredients.put("love", "tangwei");
        jsonObj.put("message", ingredients);
        return jsonObj;
    }

    public static void main(String[] args) {
        
        //System.out.println(JsonTest.createJsonObject("name"));
        
        User user = new User();
        user.setUserid(1);
        user.setUsername("zhongjiwe");
        user.setPassword("test1234");
        JSONObject jo = new JSONObject(user);
        jo.put("key", "value");
        jo.append("key001", "value001");
        
        System.out.println(jo);
        
        
        System.out.println(jo.getString("username"));
        
    }
}
