package com.lambton;

import netscape.javascript.JSObject;
import org.json.JSONObject;

public class JSONHandling
{
    public static void main(String[] args)
    {
        JSONObject obj= new JSONObject();

        obj.put("sid",1);
        obj.put("sname","ankita jain");
        obj.put("marks",100);

        //System.out.println(obj);

        String jsonString=JSONObject.valueToString(obj);

        JSONObject jsonObject= new JSONObject(jsonString);
        System.out.println("StudentID:" +jsonObject.getInt("sid"));
        System.out.println("Student Name:" +jsonObject.getString("sname"));
        System.out.println("Student Marks:" +jsonObject.getFloat("marks"));


    }
}
