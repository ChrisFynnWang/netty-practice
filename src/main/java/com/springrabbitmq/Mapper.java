package com.springrabbitmq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.headfirst.decoratorPattern.old2.Main;
import com.wfan.apache.Person;
import java.io.IOException;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/6
 * @Other:
 */
public class Mapper {

  public static final ObjectMapper MAPPER = new ObjectMapper();


  public static void main(String[] args) throws IOException {
    Person person = new Person();
    person.setName("chris");
    person.setAge(11);
    String string = MAPPER.writeValueAsString(person);
    System.out.println(string);
    JsonNode jsonNode = MAPPER.readTree(string);
    System.out.println(jsonNode.get("name"));
    System.out.println(jsonNode.get("age"));
    Person person1 = MAPPER.readValue(string, Person.class);
    System.out.println(person1);

  }

}
