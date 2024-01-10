/*
  VIPClubHouseUser inherited from ClubHouseUser
  this class has numHostedRooms variable
  and methods
  list of methods: getNumHostedRooms()
  setNumHostedRooms and @Override toString
  Author: Metee Yingyongwatthanakit
  ID: 633040174-2
  Sec: 2
  Date: 18 February 2021
*/
package yingyongwatthanakit.metee.midterm;

public class VIPClubHouseUser extends ClubHouseUser {
    private int numHostedRooms;

    public VIPClubHouseUser(String id) {
        super(id);
    }

    public VIPClubHouseUser(String id, String bio) {
        super(id, bio);
    }

    public VIPClubHouseUser(String id, String bio, int numOfFollowers) {
        super(id, bio);
        this.numFollowers = numOfFollowers;
    }

    public int getNumHostedRooms() {
        return numHostedRooms;
    }

    public void setNumHostedRooms(int numHostedRoom) {
        this.numHostedRooms = numHostedRoom;
    }

    @Override
    public String toString() {
        return "ID:" + getID() + ", Bio:" + getBio() +
                ", Number of hosted rooms:" + getNumHostedRooms();
    }
}