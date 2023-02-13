package com.bridgelabz;

public class Hotel {
    int regularWeekDayRates;
    int regularWeekEndRates;
    int rewardingWeekDayRates;
    int rewardingWeekEndRates;
    Hotel hotel = new Hotel();

    public void hotelLakeWood(){
        System.out.println("LakeWood Hotel");
        System.out.println("Rating: 3");
        regularWeekDayRates = 110;
        regularWeekEndRates = 90;
        rewardingWeekDayRates = 80;
        rewardingWeekEndRates = 80;
    }
    public void hotelBridgeWood(){
        System.out.println("BridgeWood Hotel");
        System.out.println("Rating: 4");
        regularWeekDayRates = 160;
        regularWeekEndRates = 90;
        rewardingWeekDayRates = 110;
        rewardingWeekEndRates = 50;

    }
    public void hotelRidgeWood(){
        System.out.println("RidgeWood Hotel");
        System.out.println("Rating: 5");
        regularWeekDayRates = 220;
        regularWeekEndRates = 150;
        rewardingWeekDayRates = 100;
        rewardingWeekEndRates =40;

    }
    public void checkHotel(int date, int range, String coupon){
        if (coupon.contains("Yes")){
            if (23 >= date || date <= 27){

            } else if (date == 28 || date == 29) {
                int stayPrize = regularWeekEndRates;
            } else if (date == 30 || date == 31) {
                int stayPrize = regularWeekDayRates;
            }
        }else if (coupon.contains("No")){
            if (23 > date || date < 27){
                int stayPrize = rewardingWeekDayRates;
            } else if (date == 28 || date == 29) {
                int stayPrize = rewardingWeekEndRates;
            } else if (date == 30 || date == 31) {
                int stayPrize = rewardingWeekDayRates;
            }
        }
    }
}
