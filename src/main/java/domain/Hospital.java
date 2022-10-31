package domain;

public class Hospital {

    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergency_room;
    private String name;
    private String subdivision;

    public Hospital(String id, String address, String district, String category, Integer emergency_room, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.category = category;
        this.emergency_room = emergency_room;
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public Integer getEmergency_room() {
        return emergency_room;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", category='" + category + '\'' +
                ", emergency_room=" + emergency_room +
                ", name='" + name + '\'' +
                ", subdivision='" + subdivision + '\'' +
                '}';
    }
}
