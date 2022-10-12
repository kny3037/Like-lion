package babe_lion;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String district, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
    }
// 중요한 점은 Constructor(생성자)에서 this.setDistrict()를 호출함으로써
// district를 만든다는 것이다.
    private void setDistrict(){
        String[] splitted = this.address.split(" ");
        this.district = splitted[0] + " " + splitted[1];
    }




}
