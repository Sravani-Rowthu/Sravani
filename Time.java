class Times
{
    private int hours;
    private int minutes;
    private int seconds;
    private int validateHour(int hour)
    {
         return hour>0 && hour<=23 ?hour:100 % hour ;
    }
    public void setHour(int hour)
    {
         this.hours=validateHour(hour);
    }
    public int getHour()
    {
         return hours;
    }
    private int validateMinute(int minute)
    {
         return minute>0 && minute<=59 ? minute :100 % minute ;
    }
    public void setMinute(int minute)
    {
         this.minutes=validateMinute(minute);
    }
    public int getMinute()
    {
         return minutes;
    }
    private int validateSecond(int second)
    {
         return second>0 && second<=59 ?second :100 % second ;
    }
    public void setSecond(int second)
    {
         this.seconds=validateSecond(second);
    }
    public int getSecond()
    {
         return seconds;
    }
    public  int incrementhours()
    {
         hours=hours+1;
         if(hours==24)
         { 
           hours=0;
         }
    return hours;
    }
    public  int incrementminutes()
    {
        minutes=minutes+1;
        if(minutes==60)
        {
            hours=hours+1;
            minutes=0;
        }
        return minutes;
     }
    public  int incrementseconds()
    {
         seconds=seconds+1;
         if(seconds==60)
         {
            minutes=minutes+1;
            seconds=0;
         }
         return seconds;
     }
}
