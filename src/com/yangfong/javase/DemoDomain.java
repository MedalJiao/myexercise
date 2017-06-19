package com.yangfong.javase;

/**
 * Created by Bruce.Jiao on 2017/5/10.
 */
public class DemoDomain implements Comparable {
    private int id;
    private String name;
    private String pwd;
    private int age;

    public DemoDomain() {
    }

    public DemoDomain(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public DemoDomain(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + id + ", \'" + name + '\'' + ", \'" + pwd + '\'' + ", " + age + '}';
    }

    @Override
    public int compareTo(Object o) {
//        return this.getName().compareTo(((DemoDomain)o).getName());
        DemoDomain dd = (DemoDomain)o;
        if(this.getId() > dd.getId())
            return 1;
        else if (this.getId() == dd.getId())
            return 0;
        else
            return -1;
    }
}
