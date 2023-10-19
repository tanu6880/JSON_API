package jsonExample1.practice;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hii Welcome" );
        // this is object is used for student class
        Student student1 = new Student(1,"Tanu","Kota",200);
        Student student2 = new Student(2,"Lavisha","Kota",100);
        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        Gson gson = new Gson();
        String str = gson.toJson(list);
        System.out.println(str);
        
        // this is object used for teacher class
        
        Teacher t1 = new Teacher(1,"Tanu","Saini",(long) 50000);
        Teacher t2 = new Teacher(2,"Lavisha","Saini",(long) 30000);
        List<Teacher> list2 = new ArrayList<Teacher>();
        list2.add(t1);
        list2.add(t2);
        
        JSONObject file = new JSONObject();
        file.put("list1", list);
        file.put("list2", list2);
        System.out.println(file.toJSONString());
      
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        Object file3 = JSONValue.parse(json);
         JSONObject obj = (JSONObject) file3;
        String color = (String)obj.get("color");
        System.out.println(color);
        
        ObjectMapper map = new ObjectMapper();
        Car car = map.readValue(json, Car.class);
        System.out.println(car);
        
        json = map.writerWithDefaultPrettyPrinter().writeValueAsString(car);
        System.out.println(json);
        
        ObjectMapper objmap = new ObjectMapper();
        Car car1 = new Car("yellow", "renault");
        objmap.writeValue(new File("target/car.json"), car1);
        
    }
}
