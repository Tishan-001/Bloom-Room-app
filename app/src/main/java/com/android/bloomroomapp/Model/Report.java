package com.android.bloomroomapp.Model;

public class Report {
    String id;
    int Sympathyflowers;
    int Housewarmingflowers;
    int Birthdayflowers;
    int Anniversary;
    int NewBaby;
    int ValentinesDay;
    int Graduation;
    int MothersDay;
    double totalPrice;

    public Report(int Sympathyflowers, int Housewarmingflowers, int Birthdayflowers, int Anniversary, int NewBaby, int ValentinesDay, int Graduation, int MothersDay, double totalPrice) {

        this.Sympathyflowers = Sympathyflowers;
        this.Housewarmingflowers = Housewarmingflowers;
        this.Birthdayflowers = Birthdayflowers;
        this.Anniversary = Anniversary;
        this.NewBaby = NewBaby;
        this.ValentinesDay = ValentinesDay;
        this.Graduation = Graduation;
        this.MothersDay = MothersDay;


        this.totalPrice=totalPrice;
    }

    public Report() {
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    // Getters
    public int getSympathyflowers() {
        return Sympathyflowers;
    }

    public int getHousewarmingflowers() {
        return Housewarmingflowers;
    }

    public int getBirthdayflowers() {
        return Birthdayflowers;
    }

    public int getAnniversary() {
        return Anniversary;
    }

    public int getNewBaby() {
        return NewBaby;
    }

    public int getValentinesDay() {
        return ValentinesDay;
    }

    public int getGraduation() {
        return Graduation;
    }

    public int getMothersDay() {
        return MothersDay;
    }


    // Setters
    public void setSympathyflowers(int Sympathyflowers) {
        this.Sympathyflowers = Sympathyflowers;
    }

    public void setHousewarmingflowers(int Housewarmingflowers) {
        this.Housewarmingflowers = Housewarmingflowers;
    }

    public void setBirthdayflowers(int Birthdayflowers) {
        this.Birthdayflowers = Birthdayflowers;
    }

    public void setAnniversary(int Anniversary) {
        this.Anniversary = Anniversary;
    }

    public void setNewBaby(int NewBaby) {
        this.NewBaby = NewBaby;
    }

    public void setValentinesDay(int ValentinesDay) {
        this.ValentinesDay = ValentinesDay;
    }

    public void setGraduation(int Graduation) {
        this.Graduation = Graduation;
    }

    public void setMothersDay(int MothersDay) {
        this.MothersDay = MothersDay;
    }


}
