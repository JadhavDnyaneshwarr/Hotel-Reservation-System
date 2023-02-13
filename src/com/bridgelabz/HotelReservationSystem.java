package com.bridgelabz;

import java.util.Scanner;
import java.time.LocalDate;

public class HotelReservationSystem {

    public int hotelPrize(int date, int range, int stayDays, String coupon){
        if (coupon.contains("Yes")){
            if (23 >= date || date <= 27){
                int stayPrize = regularWeekDayRates;
                return stayPrize;
            } else if (date == 28 || date == 29) {
                int stayPrize = regularWeekEndRates * stayDays;
                return stayPrize;
            } else if (date == 30 || date == 31) {
                int stayPrize = regularWeekDayRates * stayDays;
                return stayPrize;
            }
        }else if (coupon.contains("No")){
            if (23 > date || date < 27){
                int stayPrize = rewardingWeekDayRates * stayDays;
                return stayPrize;
            } else if (date == 28 || date == 29) {
                int stayPrize = rewardingWeekEndRates * stayDays;
                return stayPrize;
            } else if (date == 30 || date == 31) {
                int stayPrize = rewardingWeekDayRates * stayDays;
                return stayPrize;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.next();
        System.out.print("Enter reservation date: ");
        int date = scanner.nextInt();
        System.out.print("Enter your Highest Range: ");
        int range = scanner.nextInt();
        System.out.print("Enter How many day you want to stay: ");
        int stay = scanner.nextInt();
        System.out.print("Do you have coupon: ");
        String coupon = scanner.next();
        System.out.print("Enter rating to Hotel Service: ");
        int rating = scanner.nextInt();
    }
}
