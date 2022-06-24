package application;
public class Date {
    Date(){
    }
    String day;
    String month;
    String year;
    public Date(String day, String month, String year)
    {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getDay()
    {
        return day;
    }
    public void setDay(String day)
    {
        this.day = day;
    }
    public String getMonth()
    {
        return month;
    }
    public void setMonth(String month)
    {
        this.month = month;
    }
    public String getYear()
    {
        return year;
    }
    public void setYear(String year)
    {
        this.year = year;
    }

    public String date()
    {
        return day + "/" + month + "/" + year;//返回输出格式 年/月/日
    }
}