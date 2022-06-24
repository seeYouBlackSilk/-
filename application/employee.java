package application;

public class employee extends Person {
	 public employee(String name, String sex, String iD, Date birthday, String jobNumber, String phone, String location,
             String jobName)
{
 super(name, sex, iD, birthday);
 this.jobNumber = jobNumber;
 this.phone = phone;
 this.location = location;
 this.jobName = jobName;
}
	 public employee(){};
String jobNumber;
String phone;
String location;
String jobName;
public String getJobNumber()
{
 return jobNumber;
}
public void setJobNumber(String jobNumber)
{
 this.jobNumber = jobNumber;
}
public String getPhone()
{
 return phone;
}
public void setPhone(String phone)
{
 this.phone = phone;
}
public String getLocation()
{
 return location;
}
public void setLocation(String location)
{
 this.location = location;
}
public String getJobName()
{
 return jobName;
}
public void setJobName(String jobName)
{
 this.jobName = jobName;
}
public String toString(){
 return "教师姓名："+name+",性别："+sex+",身份证号："+ID+",出生日期："+birth.date()+",工号："+jobNumber+",电话："+phone+",所在部门："+location+",职称："+jobName;
}
}
