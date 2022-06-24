package application;
public class Person
{
	public String name;
	public String sex;
	public String ID;
	public Date birth;
	public Person()
	{
	}
	public Person(String name, String sex, String iD, Date birth)
	{
		super();
		this.name = name;
		this.sex = sex;
		ID = iD;
		this.birth = birth;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getID()
	{
		return ID;
	}
	public void setID(String iD)
	{
		ID = iD;
	}
	public Date getBirth()
	{
		return birth;
	}
	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	@Override
	public String toString()
	{
		return "姓名:" + name + "性别:" + sex + "身份证号码:" + ID + "出生日期:" + birth.date();
	}
}
