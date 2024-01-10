/*
  TestClubHouseUser is a program to
  test ClubHouseUser and VIPClubHouseUser
  the program will test variables and methods
  in ClubHouseUser anb VIPClubHouseUser
  Author: Metee Yingyongwatthanakit
  ID: 633040174-2
  Sec: 2
  Date: 18 February 2021
*/
package yingyongwatthanakit.metee.midterm;

public class TestClubHouseUser {
    public static void testConstructorsMethods() {
        ClubHouseUser apirak = new ClubHouseUser("apirak");
        ClubHouseUser jeng = new ClubHouseUser("jengguru", "Seeking new fun startup");
        apirak.setNumFollowers(407);
        jeng.setNumFollowers(93);
        apirak.setBio("Co-Founder UX Thailand Community");
        System.out.println(apirak.getID() + " has number of followers as " +
                apirak.getNumFollowers());
        System.out.println(apirak);
        System.out.println(jeng);
        System.out.println("Number of Club House Users is " +
                ClubHouseUser.getNumClubHouseUsers());
    }

    public static void testSuperClass() {
        VIPClubHouseUser gap = new VIPClubHouseUser("gab", "Nerd Squad", 719);
        gap.setNumHostedRooms(2);
        System.out.println(gap);
        System.out.println("Number of Club House Users is " +
                ClubHouseUser.getNumClubHouseUsers());
    }

    public static void main(String[] args) {
        testConstructorsMethods();
        testSuperClass();
    }
}