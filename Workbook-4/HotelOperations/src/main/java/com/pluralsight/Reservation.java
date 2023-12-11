package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {

    private String roomType;
    private LocalDate startDate;
    private LocalDate endDate;




    public Reservation(String roomType, LocalDate startDate, LocalDate endDate) {
        this.roomType = roomType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getNumberofNights(){
       return endDate.compareTo(startDate);
    }

    public boolean isWeekend(LocalDate date){
        return date.getDayOfWeek().name() == "FRIDAY" ||date.getDayOfWeek().name() =="SATURDAY"||date.getDayOfWeek().name() =="SUNDAY";
    }

    public double getPrice(){
        double price =0;
        if (roomType.equalsIgnoreCase("king")){
            price = 139.00;
        }else if (roomType.equalsIgnoreCase("double")) {
        price = 124.00;
        }
        return price;
    }

    public double getReservationTotal(){
        double total = 0;
        ArrayList<LocalDate> dateRange = new ArrayList<>();

        LocalDate sDate = startDate;
        LocalDate eDate = endDate;
        while (endDate.compareTo(sDate)<=0){

            dateRange.add(sDate);
            sDate.plusDays(1);
        }
        System.out.println(dateRange);
        for (int i =0;i<dateRange.size();i++){
            if (isWeekend(dateRange.get(i))){
                total+= getPrice()*1.1;
            }else {
                total+=getPrice();
            }
        }


        return total;
    }


}
