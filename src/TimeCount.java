/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeCount
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();

        cal.set(2018,5,15,13,5,49);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);
        int mes = c.get(Calendar.SECOND);

        String NowTime = "";
        if(month <10)
            NowTime = NowTime + year + "-0" + month;
        else
            NowTime = NowTime + year + "-" + month;
        if(day <10)
            NowTime = NowTime+ "-0" + day;
        else
            NowTime = NowTime + "-" + day;
        NowTime = NowTime +" ";
        if(hour <10)
            NowTime = NowTime+ "0" + hour;
        else
            NowTime = NowTime + hour;
        if(min <10)
            NowTime = NowTime+ ":0" + min;
        else
            NowTime = NowTime + ":" + min;
        if(mes <10)
            NowTime = NowTime+ ":0" + mes;
        else
            NowTime = NowTime + ":" + mes;

        System.out.println("NowTime : " + NowTime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d = cal.getTime();

        long daterange = 0;
        try
        {
            daterange = sdf.parse(NowTime).getTime() - d.getTime();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        System.out.println("s : " + (daterange/1000)%60);
        System.out.println("min : " + (daterange/(1000*60))%60);
        System.out.println("h : " + (daterange/(1000*3600))%24);
        System.out.println("day : " + daterange/(1000*3600*24));

        long CountS = (daterange/1000)%60;
        long CountMin = (daterange/(1000*60))%60;
        long CountH = (daterange/(1000*3600))%24 + daterange/(1000*3600*24)*24;

        String CountTime = "";
        if(CountH <10)
            CountTime = CountTime+ "0" + CountH;
        else
            CountTime = CountTime+ "" + CountH;
        if(CountMin <10)
            CountTime = CountTime+ ":0" + CountMin;
        else
            CountTime = CountTime + ":" + CountMin;
        if(CountS <10)
            CountTime = CountTime+ ":0" + CountS;
        else
            CountTime = CountTime + ":" + CountS;

        System.out.println("CountTime : " + CountTime);
    }
}
