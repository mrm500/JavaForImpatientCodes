package JavaForImpatientCodes.chapter02;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.util.ArrayList;

public class exercise01 {
    public static void main(String[] args){

        Calender cal = new Calender();
        cal.setDayOfWeek(6);
        cal.printMonth();


    }
    public static class Calender {
        int _DayOfWeek;
        LocalDate _date;
        ArrayList<String> days;

        public Calender() {
            this._DayOfWeek = 0;
            this._date = LocalDate.now();
            this.days = new ArrayList<>(7);
            this.days.add("Mon");
            this.days.add("Tue");
            this.days.add("Wed");
            this.days.add("Thr");
            this.days.add("Fri");
            this.days.add("Sat");
            this.days.add("Sun");
        }
        private void changeDays(int day){
            String temp;
            for(int i=day; i<7; i++){
                temp = days.get(i);
                days.remove(i);
                days.add(i-day, temp);
            }
        }
        private void printDays(){
            for(String temp: days){
                System.out.print(" " + temp);
            }
        }
        public void printMonth(){
            printDays();
            System.out.println();
            Month month = _date.getMonth();
            int daysInMonth = month.length(Year.isLeap(_date.getYear()));
            LocalDate _dateTemp = LocalDate.of(_date.getYear(),month,1);
            DayOfWeek day = _dateTemp.getDayOfWeek();
            int d = day.ordinal();
            d = (d+7-_DayOfWeek)%7;
            for(int i=0; i<d; i++)
                System.out.print("    ");
            for(int i=1; i<=daysInMonth; i++){
                System.out.printf("%4d",i);
                d = (++d)%7;
                if(d == 0)
                    System.out.println();
            }
        }
        public void setDayOfWeek(int i){
            _DayOfWeek = i;
            changeDays(_DayOfWeek);

        }
        public int getDayofWeek(){
            return _DayOfWeek;
        }
    }
}