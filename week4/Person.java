public class Person{ public class Person {
  private  String name;
 private String email;
 public Person(String name,String email)
{this.name=name;
this.email=email;}
public void setName(String name){
this.name=name;}
public String getName(){
return name;}
public void setEmail(String email){
this.email=email;}
public String getEmail(){
return email;}
//toString:
public String toString(){
return String.format("%s %s",name,email);}
}
