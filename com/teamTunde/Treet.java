package com.teamTunde;

import java.util.Arrays;
import java.util.Date;

public class Treet implements Comparable{
  
  private String mAuthor;
  private String mDescription;
  private Date mCreateDate;
  
  /**
   *  Non default contstrutor used here
   * */
  public Treet(String author,String description, Date createDate ){
     mAuthor = author;
     mDescription = description;
     mCreateDate = createDate;
  }
  
  
  
  public String getAuthor(){
    return mAuthor;
  }
  

  @Override
  public String toString(){
    return String.format( "Tweet:  \"%s\" by %s on %s",  mDescription, mAuthor, mCreateDate);
  }
  
  
  @Override
  public int compareTo(Object obj){
    Treet other = (Treet) obj;
    if(equals(other)){
      return 0;
    }
     int dateCmp =  mCreateDate.compareTo(other.mCreateDate);
     if(dateCmp == 0){
     return mDescription.compareTo(other.mDescription);
    }
     return  dateCmp;
  }
  
  
  public String getDescription(){
    return  mDescription;
  }
  
  
  public String[] getWords(){
   return mDescription.toLowerCase().split(" ");
  }
  
  
  
   public Date getCreateDate(){
    return  mCreateDate;
  }
  

}