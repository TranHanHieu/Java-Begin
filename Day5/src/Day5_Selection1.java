import java.util.Scanner;

/**
 * Created by Hieu It on 6/28/2016.
 */
public class Day5_Selection1 {
    public static void printMonthTitle(int year, int month) {//tiêu đề lịch
        String[][] Title = new String[4][8];
        switch (month){
            case 1:
                Title[1][4] = "\t\t   January";
                break;
            case 2:
                Title[1][4] = "\t\t   February";
                break;
            case 3:
                Title[1][4] = "\t\t   March";
                break;
            case 4:
                Title[1][4] = "\t\t   April";
                break;
            case 5:
                Title[1][4] = "\t\t   May";
                break;
            case 6:
                Title[1][4] = "\t\t   June";
                break;
            case 7:
                Title[1][4] = "\t\t   July";
                break;
            case 8:
                Title[1][4] = "\t\t   August";
                break;
            case 9:
                Title[1][4] = "\t\t   September";
                break;
            case 10:
                Title[1][4] = "\t\t   October";
                break;
            case 11:
                Title[1][4] = "\t\t   November";
                break;
            case 12:
                Title[1][4] = "\t\t   December";
                break;
        }
        Title[3][1] = " Sun";
        Title[3][2] = "Mon";
        Title[3][3] = "Tue";
        Title[3][4] = "Wed";
        Title[3][5] = "Thu";
        Title[3][6] = "Fri";
        Title[3][7] = "Sat ";
        System.out.print(Title[1][4] + " " + year);
        System.out.println();
        for (int j = 1; j <= 7; j++) {
            Title[2][j] = "-----";
            System.out.print(Title[2][j]);
        }
        System.out.println();
        for (int j = 1; j <= 7; j++) {
            System.out.print(Title[3][j] + "  ");
        }
        System.out.println();
    }

    public static void printMonthBody(int year, int month) {//in thân lịch.
        int h = getStartDay(year, month);
        int countDay=1, count=0;
        int maxDay = getNumberOfDayInMonth(year, month);//ngày lớn nhất của tháng (28,30,31)
        switch (h) {
            case 0:
                //Ngày của tuần là Thứ 7.
                count = 29;
                break;
            case 1:
                //Ngày của tuần là CN.
                count = 0;
                break;
            case 2:
                //Ngày của tuần là Thứ 2.
                count = 4;
                break;
            case 3:
                //Ngày của tuần là Thứ 3.
                count =9;
                break;
            case 4:
                //Ngày của tuần là Thứ 4.
                count = 14;
                break;
            case 5:
                //Ngày của tuần là Thứ 5.
                count =19;
                break;
            case 6:
                //Ngày của tuần là Thứ 6.
                count =24;
                break;
        }
        for (int i =0;i<=count;i++){
            System.out.print(" ");
        }
        for (int i=0;i<=4;i++){
            for (int j=count;j<34;j+=5){
                if(countDay<=maxDay) {
                    System.out.printf("%3d  ", countDay);
                    countDay++;
                }
            }
            count =0;
            System.out.println();
        }
    }

    public static int getStartDay(int year, int month) {//ckech ngày đầu tiên là thứ mấy.
        int day = 1;
        int h;
        if (month == 1 || month == 2) {
            int j = (year - 1) / 100;
            int q = day;
            int m = month + 12;
            int k = (year - 1) % 100;
            h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        } else {
            int j = year / 100;
            int k = year % 100;
            int q = day;
            int m = month;
            h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        }
        return h;
    }

    public static int getNumberOfDayInMonth(int year, int month) {//ckech xem tháng có bn ngày.
        int days = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else {
            if (month == 2) {
                boolean a = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
                if (a) {
                    days = 29;
                } else {
                    days = 28;
                }
            } else {
                days = 30;
            }
        }
        return days;
    }

    public static void printMonth(int year, int month) {//hàm in ra lịch của tháng
        printMonthTitle(year, month);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào năm : ");
        int year = input.nextInt();
        System.out.println("Nhập vào tháng : ");
        int month = input.nextInt();
        printMonth(year, month);
        printMonthBody(year, month);
    }
}
