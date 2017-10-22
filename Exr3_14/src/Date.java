public class Date
{
    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private void setMonth(int month)
    {
        this.month = month;
    }

    private int getMonth()
    {
        return month;
    }

    private void setDay(int day)
    {
        this.day = day;
    }

    private int getDay()
    {
        return day;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getYear()
    {
        return year;
    }

    public void displayDate()
    {
        System.out.println( month + "/" + day + "/" + year);
    }
}
