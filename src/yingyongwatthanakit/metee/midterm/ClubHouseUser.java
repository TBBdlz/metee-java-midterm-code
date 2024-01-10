/*
  ClubHouseUser is a class for ClubHouse app
  variables: id, bio, numFollowers
  class variable: numClubHouseUsers
  this class includes getter and setter method
  and has @Override toString too
  Author: Metee Yingyongwatthanakit
  ID: 633040174-2
  Sec: 2
  Date: 18 February 2021
*/
package yingyongwatthanakit.metee.midterm;

public class ClubHouseUser {
    protected String id;
    protected String bio;
    protected int numFollowers;
    protected static int numClubHouseUsers;

    public ClubHouseUser(String id) {
        this.id = id;
        numClubHouseUsers++;
    }

    public ClubHouseUser(String id, String bio) {
        this.id = id;
        this.bio = bio;
        numClubHouseUsers++;
    }

    public String getID() {
        return id;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }

    public void setNumFollowers(int numFollowers) {
        this.numFollowers = numFollowers;
    }

    public int getNumFollowers() {
        return numFollowers;
    }

    @Override
    public String toString() {
        return "ID:" + getID() + ", Bio:" + getBio() +
                ", Number of followers:" + getNumFollowers();
    }

    public static int getNumClubHouseUsers() {
        return numClubHouseUsers;
    }
}