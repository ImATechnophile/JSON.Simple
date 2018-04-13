package org.simplejson.com;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSimpleWrite {
    public static void main(String args[]){
        JSONObject obj = new JSONObject();
        obj.put("name","Saravana Prakash");
        obj.put("age",new Integer(23));
        JSONArray list = new JSONArray();
        list.add("ms1");
        list.add("msg2");
        list.add("msg 3");
        obj.put("message",list);
        try(FileWriter file = new FileWriter("C:\\Users\\sarp\\IdeaProjects\\jsonsimple\\FilesRepository\\write.json")){
            file.write(obj.toJSONString());
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(obj);

    }
}
