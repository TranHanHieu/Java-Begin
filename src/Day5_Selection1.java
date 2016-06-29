import java.util.Scanner;

/**
 * Created by Hieu It on 6/28/2016.
 */
public class Day5_Selection1 {
    public static void printMonthTitle(int year, int month) {//tiêu đề lịch
        String[][] Title = new String[4][8];
        Title[1][4] = "\t\t March";
        Title[3][1] = " Sun";
        Title[3][2] = "Mon";
        Title[3][3] = "Tue";
        Title[3][4] = "Wed";
        Title[3][5] = "Thu";
        Title[3][6] = "Fri";
        Title[3][7] = "Sat ";
        for (int j = 1; j <= 7; j++) {
            Title[2][j] = "----";
        }
        System.out.print(Title[1][4] + " " + year);
        System.out.println();
        for (int j = 1; j <= 7; j++) {
            System.out.print(Title[2][j]);
        }
        System.out.println();
        for (int j = 1; j <= 7; j++) {
            Title[2][j] = "-";
            System.out.print(Title[3][j] + " ");
        }
        System.out.println();
    }

    public static void printMonthBody(int year, int month) {//in thân lịch.
        int h = getStartDay(year, month);
        int countDay, g;
        int maxDay = getNumberOfDayInMonth(year, month);//ngày lớn nhất của tháng (28,30,31)
        int[][] BodyCalendar = new int[8][8];
        switch (h) {
            case 0:
                //System.out.println("Ngày của tuần là Thứ 7");
                countDay = 2;
                g = 1;
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        if (countDay >= 2 && countDay <= maxDay) {
                            BodyCalendar[i][j] = countDay;
                            countDay++;
                        }
                    }
                }
                for (int j = 7; j <= 7; j++) {
                    BodyCalendar[0][j] = g;
                    g++;
                }
                for (int j = 1; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[0][j] + " ");
                }
                System.out.println();
                System.out.print("  " + BodyCalendar[1][1] + "   " + BodyCalendar[1][2] + "   " + BodyCalendar[1][3]+ "   " + BodyCalendar[1][4]+ "   " + BodyCalendar[1][5]+ "   " + BodyCalendar[1][6]+ "   " + BodyCalendar[1][7]);
                System.out.println();
                System.out.print("  "+ BodyCalendar[2][1]);
                for (int j = 2; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[2][j] );
                }
                System.out.println();
                for (int i = 3; i <= 5; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + BodyCalendar[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 1:
                //System.out.println("Ngày của tuần là thứ CN");
                countDay = 1;
                for (int i = 0; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        if (countDay >= 1 && countDay <= maxDay) {
                            BodyCalendar[i][j] = countDay;
                            countDay++;
                        }
                    }
                }
                for (int j = 1; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[0][j] + " ");
                }
                System.out.println();
                System.out.print("  " + BodyCalendar[1][1] + "   " + BodyCalendar[1][2]);
                for (int j = 3; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[1][j] + "");
                }
                System.out.println();
                for (int i = 2; i <= 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + BodyCalendar[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                //System.out.println("Ngày của tuần là Thứ 2");
                countDay = 7;
                g = 1;
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        if (countDay >= 1 && countDay <= maxDay) {
                            BodyCalendar[i][j] = countDay;
                            countDay++;
                        }
                    }
                }
                for (int j = 2; j <= 7; j++) {
                    BodyCalendar[0][j] = g;
                    g++;
                }
                for (int j = 1; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[0][j] + " ");
                }
                System.out.println();
                System.out.print("  " + BodyCalendar[1][1] + "   " + BodyCalendar[1][2] + "   " + BodyCalendar[1][3]);
                for (int j = 4; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[1][j] + "");
                }
                System.out.println();
                for (int i = 2; i <= 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + BodyCalendar[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                //System.out.println("Ngày của tuần là Thứ 3");
                countDay = 6;
                g = 1;
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        if (countDay >= 1 && countDay <= maxDay) {
                            BodyCalendar[i][j] = countDay;
                            countDay++;
                        }
                    }
                }
                for (int j = 3; j <= 7; j++) {
                    BodyCalendar[0][j] = g;
                    g++;
                }
                for (int j = 1; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[0][j] + " ");
                }
                System.out.println();
                System.out.print("  " + BodyCalendar[1][1] + "   " + BodyCalendar[1][2] + "   " + BodyCalendar[1][3]+ "   " + BodyCalendar[1][4]);
                for (int j = 5; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[1][j] + "");
                }
                System.out.println();
                for (int i = 2; i <= 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + BodyCalendar[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                //System.out.println("Ngày của tuần là Thứ 4");
                countDay = 5;
                g = 1;
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        if (countDay >= 5 && countDay <= maxDay) {
                            BodyCalendar[i][j] = countDay;
                            countDay++;
                        }
                    }
                }
                for (int j = 4; j <= 7; j++) {
                    BodyCalendar[0][j] = g;
                    g++;
                }
                for (int j = 1; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[0][j] + " ");
                }
                System.out.println();
                System.out.print("  " + BodyCalendar[1][1] + "   " + BodyCalendar[1][2] + "   " + BodyCalendar[1][3]+ "   " + BodyCalendar[1][4]+ "   " + BodyCalendar[1][5]);
                for (int j = 6; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[1][j] + "");
                }
                System.out.println();
                for (int i = 2; i <= 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + BodyCalendar[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 5:
                //System.out.println("Ngày của tuần là Thứ 5");
                countDay = 4;
                g = 1;
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        if (countDay >= 4 && countDay <= maxDay) {
                            BodyCalendar[i][j] = countDay;
                            countDay++;
                        }
                    }
                }
                for (int j = 5; j <= 7; j++) {
                    BodyCalendar[0][j] = g;
                    g++;
                }
                for (int j = 1; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[0][j] + " ");
                }
                System.out.println();
                System.out.print("  " + BodyCalendar[1][1] + "   " + BodyCalendar[1][2] + "   " + BodyCalendar[1][3]+ "   " + BodyCalendar[1][4]+ "   " + BodyCalendar[1][5]+ "   " + BodyCalendar[1][6]);
                for (int j = 7; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[1][j] + "");
                }
                System.out.println();
                for (int i = 2; i <= 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + BodyCalendar[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 6:
                //System.out.println("Ngày của tuần là Thứ 6");
                countDay = 10;
                g = 1;
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        if (countDay >= 10 && countDay <= maxDay) {
                            BodyCalendar[i][j] = countDay;
                            countDay++;
                        }
                    }
                }
                for (int j = 6; j <= 7; j++) {
                    BodyCalendar[0][j] = g;
                    g++;
                }
                for (int j = 1; j <= 7; j++) {
                    System.out.print("  " + BodyCalendar[0][j] + " ");
                }
                System.out.println();
                System.out.print(" " + BodyCalendar[1][1] + "  " + BodyCalendar[1][2] + "  " +BodyCalendar[1][3]+ "  " + BodyCalendar[1][4]+ "  " + BodyCalendar[1][5]+ "  " + BodyCalendar[1][6]+ "  " + BodyCalendar[1][7]);
                System.out.println();
                for (int i = 2; i <= 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + BodyCalendar[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
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
        //getNumberOfDayInMonth(year,month);
        //getStartDay(year,month,day);
        // printMonthBody(year,month,h);
    }
}
