class Time
{

    public static void main(String[] args)

    {

        Times t = new Times();

        t.setHour(10)  ;

        t.setMinute(59);

        t.setSecond(25);

        System.out.println(t.incrementhours());

        System.out.println(t.incrementminutes());

        System.out.println(t.incrementseconds());

    }

}