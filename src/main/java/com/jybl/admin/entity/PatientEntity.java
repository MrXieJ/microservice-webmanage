package com.jybl.admin.entity;


import java.io.Serializable;

/**
 * Created by jie on 2017/7/31.
 */
public class PatientEntity implements Serializable{

    private Long id;

    private String name;

    private String id_card;

    private String sex;

    private Integer age;

    private String phone;

    private String address;

    private String detailed_address;

    private String wechat_id;

    private String head_pic;

    private String kind;

    private Float prob;

    private Integer count = -1;

    private String datetime;

    public PatientEntity() {
 }

 public PatientEntity(Long id, String name, String id_card, String sex, Integer age, String phone, String address, String detailed_address, String wechat_id, String head_pic, String kind, Integer count, Float prob, String datetime) {
  this.id = id;
  this.name = name;
  this.id_card = id_card;
  this.sex = sex;
  this.age = age;
  this.phone = phone;
  this.address = address;
  this.detailed_address = detailed_address;
  this.wechat_id = wechat_id;
  this.head_pic = head_pic;
  this.kind = kind;
  this.count = count;
  this.prob = prob;
  this.datetime = datetime;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getId_card() {
  return id_card;
 }

 public void setId_card(String id_card) {
  this.id_card = id_card;
 }

 public String getSex() {
  return sex;
 }

 public void setSex(String sex) {
  this.sex = sex;
 }

 public Integer getAge() {
  return age;
 }

 public void setAge(Integer age) {
  this.age = age;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getDetailed_address() {
  return detailed_address;
 }

 public void setDetailed_address(String detailed_address) {
  this.detailed_address = detailed_address;
 }

 public String getWechat_id() {
  return wechat_id;
 }

 public void setWechat_id(String wechat_id) {
  this.wechat_id = wechat_id;
 }

 public String getHead_pic() {
  return head_pic;
 }

 public void setHead_pic(String head_pic) {
  this.head_pic = head_pic;
 }

 public String getKind() {
  return kind;
 }

 public void setKind(String kind) {
  this.kind = kind;
 }

 public Float getProb() {
  return prob;
 }

 public void setProb(Float prob) {
  this.prob = prob;
 }

 public Integer getCount() {
  return count;
 }

 public void setCount(Integer count) {
  this.count = count;
 }

 public String getDatetime() {
  return datetime;
 }

 public void setDatetime(String datetime) {
  this.datetime = datetime;
 }
}
