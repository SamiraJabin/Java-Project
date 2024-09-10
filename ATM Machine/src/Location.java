public class Location {
    private String country;
    private String zipCode;
    private String state;
    private String city;
    private String zone;
    private String address;

    public Location(String country, String zipCode, String state, String city, String zone, String address){
        this.country = country;
        this.zipCode = zipCode;
        this.state = state;
        this.city = city;
        this.zone = zone;
        this.address = address;
    }

    public String getCountry(){
        return this.country;
    }
    public String getZipCode(){
        return this.zipCode;
    }
    public String getState(){
        return this.state;
    }
    public String getCity(){
        return this.city;
    }
    public String getAddress(){
        return this.address;
    }
    public String getZone(){
        return this.zone;
    }
}//second video till 37:56 min
