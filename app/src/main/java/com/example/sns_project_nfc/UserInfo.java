package com.example.sns_project_nfc;

import java.util.Date;

public class UserInfo {
    private String name;
    private String phoneNumber;
    private String userID;
    private String address;
    private String building;
    private String unit;
    private String photoUrl;
    private Date createdID;                                                                                 // + : 사용자 리스트 수정 (날짜 정보 추가)
    private String authState;


    public UserInfo(String name, String phoneNumber, String userID, String address, String building, String unit, Date createdID, String photoUrl, String authState){     // part5 : 생성자 초기화 (7')
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.userID = userID;
        this.address = address;
        this.building = building;
        this.unit = unit;
        this.createdID = createdID;                                                                         // + : 사용자 리스트 수정 (날짜 정보 추가)
        this.photoUrl = photoUrl;
        this.authState = authState;
    }

    public UserInfo(String name, String phoneNumber, String userID, Date createdID, String address, String building, String unit, String authState){      // + : 사용자 리스트 수정(날짜 정보 추가)
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.userID = userID;
        this.address = address;
        this.building = building;
        this.unit = unit;
        this.createdID = createdID;
        this.authState = authState;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getBirthDay(){
        return this.userID;
    }
    public void setBirthDay(String birthDay){
        this.userID = birthDay;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhotoUrl(){
        return this.photoUrl;
    }
    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl;
    }

    public Date getCreatedID() { return createdID; }
    public void setCreatedID(Date createdID) { this.createdID = createdID; }

    public String  getAuthState() { return authState; }
    public void setAuthState(String authState) { this.authState = authState; }
    public String  getBuilding() { return building; }
    public void setBuilding(String building) { this.building = building; }
    public String  getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }
}
