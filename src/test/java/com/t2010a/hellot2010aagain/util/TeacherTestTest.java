package com.t2010a.hellot2010aagain.util;

import javafx.beans.binding.MapExpression;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTestTest {
    public class Teacher{

    }


    @Test
    public void countCakeByTeacher()throws IOException{
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = classLoader.getResourceAsStream("text.txt");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader=  new BufferedReader(streamReader);
        MapExpression<K, V> mapTeachers;
        for (String line; (line = reader.readLine()) !=null;){
            String[] sliptedLine = line.split("");
            if (sliptedLine.length==4){
                String teacherId = sliptedLine[0];
                String name = sliptedLine[1];
                String[] splitedLine;
                int cakeCount = Integer.parseInt(splitedLine[3]);
                Teacher teacher = new Teacher(teacherId, name,cakeCount);
                // neu ton tai giao vien cung key thi lay gia tri cu
                if (mapTeachers.containsKey(teacher.getId())){
                    Teacher oldTeacher = mapTeachers.get(teacher.getID());
                    //update so luong banh moi
                    oldTeacher.setCakeCount(oldTeacher.getId(),oldTeacher);
                    //dua lai vao map
                    mapTeacher.put(oldTeacher.getId(),oldTeacher);

                }else {
                    mapTeachers.put(teacher.getId(),teacher);

                }
            }
        }
        ArrayList<Teacher>listTeacher = new ArrayList<>(mapTeachers.values().size());
        for (Teacher teacher :
                  listTeacher){
            System.out.printf(teacher.toString());
        }
    }

}
class Shopping cart{
    private HashMap<String,CartItem> items;
    public ShoppingCart();
}