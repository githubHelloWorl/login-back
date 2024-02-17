package com.student_serve.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.student_serve.model.vo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t")
public class T {

  private long tid;
  private String tname;
  private String password;


  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
  }


  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User toUser(){
    User user = new User();
    user.setId(this.tid);
    user.setName(this.tname);
    user.setType("teacher");
    return user;
  }
}
