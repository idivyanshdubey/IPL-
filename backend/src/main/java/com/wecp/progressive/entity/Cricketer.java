package com.wecp.progressive.entity;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// @Entity
public class Cricketer implements Comparable<Cricketer> {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cricketerId;
    private int teamId;
    private String cricketerName;
    private int age;
    private String nationality;
    private int experience;
    private String role;
    private int totalRuns;
    private int totalWickets;

    public Cricketer() {
    }

    public Cricketer(int cricketerId, int teamId, String cricketerName, int age, String nationality, int experience,
        String role, int totalRuns, int totalWickets) {
        this.cricketerId = cricketerId;
        this.teamId = teamId;
        this.cricketerName = cricketerName;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
        this.role = role;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }

    public int getCricketerId() {
        return cricketerId;
    }

    public void setCricketerId(int cricketerId) {
        this.cricketerId = cricketerId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }
    
    public int compareTo(Cricketer otherCricketer){
        return Comparator.comparingInt(Cricketer :: getExperience).compare(this, otherCricketer);
    }

    
    
}