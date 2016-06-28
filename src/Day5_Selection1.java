import java.util.Scanner;

/**
 * Created by Hieu It on 6/28/2016.
 */
public class Day5_Selection1 {
    public static void printMonthTitle(int year, int month) {//tiêu đề lịch
        String[][] A = new String[4][8];
        A[1][4] = "\t\t March";
        A[3][1] = " Sun";
        A[3][2] = "Mon";
        A[3][3] = "Tue";
        A[3][4] = "Wed";
        A[3][5] = "Thu";
        A[3][6] = "Fri";
        A[3][7] = "Sat ";
        for (int j = 1; j <= 7; j++) {
            A[2][j] = "----";
        }
        System.out.print(A[1][4] + " " + year);
        System.out.println();
        for (int j = 1; j <= 7; j++) {
            System.out.print(A[2][j]);
        }
        System.out.println();
        for (int j = 1; j <= 7; j++) {
            A[2][j] = "-";
            System.out.print(A[3][j] + " ");
        }
        //System.out.println();

    }

    public static void printMonthBody(int year, int month) {//in thân lịch.
        int h = getStartDay(year, month);
        System.out.println(h);
        int k, g;
        int maxDay = getNumberOfDayInMonth(year, month);
        System.out.println(maxDay);
        int[][] B = new int[8][8];
        switch (h) {
            case 0:
                //System.out.println("Ngày của tuần là Thứ 7");
                k = 2;
                B[0][7] = 1;
                //System.out.println();
                //System.out.println(B[0][7] = 1);
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        B[i][j] = k;
                        k++;
                    }
                }
                for (int i = 0; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + B[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 1:
                //System.out.println("Ngày của tuần là thứ CN");
                k = 1;
                //int[][] B = new int[8][8];
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        B[i][j] = k;
                        k++;
                    }
                }
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + B[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                //System.out.println("Ngày của tuần là Thứ 2");
                k = 7;
                //int[][] B = new int[8][8];
                B[0][1]=0;
                B[0][2]= 1;
                B[0][3]=2;
                B[0][4]=3;
                B[0][5]=4;
                B[0][6]=5;
                B[0][7]=6;
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        B[i][j] = k;
                        k++;
                    }
                }
                for (int i = 0; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + B[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                //System.out.println("Ngày của tuần là Thứ 3");
                k = 6;
                //int[][] B = new int[8][8];
                g = 1;
                for (int i = 3; i <= 7; i++) {
                    B[0][i] = g;
                    g++;
                }
                System.out.println();
                for (int i = 3; i <= 7; i++) {
                    System.out.print(B[0][i] + " ");
                }
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        B[i][j] = k;
                        k++;
                    }
                }
                for (int i = 0; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + B[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                //System.out.println("Ngày của tuần là Thứ 4");
                k = 5;
                //int[][] B = new int[8][8];
                g = 1;
                for (int i = 4; i <= 7; i++) {
                    B[0][i] = g;
                    g++;
                }
                System.out.println();
                for (int i = 2; i <= 7; i++) {
                    System.out.print(B[0][i] + " ");
                }
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        B[i][j] = k;
                        k++;
                    }
                }
                for (int i = 0; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + B[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 5:
                //System.out.println("Ngày của tuần là Thứ 5");
                k = 4;
                //int[][] B = new int[8][8];
                g = 1;
                for (int i = 5; i <= 7; i++) {
                    B[0][i] = g;
                    g++;
                }
                //System.out.println();
                for (int i = 1; i <= 7; i++) {
                    System.out.print("  "+ B[0][i] + " ");
                }
                System.out.println();
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        B[i][j] = k;
                        k++;
                    }
                }
                for (int i = 1; i <2; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("  " + B[i][j] + " ");
                    }
                    System.out.println();
                }
                B[1][7]=10;
                for (int i = 2; i <= 4; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + B[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 6:
                //System.out.println("Ngày của tuần là Thứ 6");
                k = 3;
                g = 1;
                for (int i = 6; i <= 7; i++) {
                    B[0][i] = g;
                    g++;
                }
                System.out.println();
                for (int i = 2; i <= 7; i++) {
                    System.out.print(B[0][i] + " ");
                }
                for (int i = 1; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        B[i][j] = k;
                        k++;
                    }
                }
                for (int i = 0; i <= 7; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" " + B[i][j] + " ");
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
            }
            days = 30;
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
