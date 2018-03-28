package com.gxs.ssm.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

 public static void main(String[] args) { 
  try { 
   //loadLoggerContext(); 
   FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("../../../spring/spring-dao.xml"); 

  } catch (Exception e) { 
   System.out.println(e); 
  } 
 } 
}