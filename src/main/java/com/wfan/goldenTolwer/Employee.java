package com.wfan.goldenTolwer;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/3/11
 * @Other:
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private int id;

    public Employee() {
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Employee e) {

        return new CompareToBuilder().append(name, e.name).append(id, e.id).toComparison();
    }

    @Override
    public String toString() {
            ToStringBuilder.setDefaultStyle(ToStringStyle.SIMPLE_STYLE);
        return ToStringBuilder.reflectionToString(this);
    }


}
