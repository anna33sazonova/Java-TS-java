public class Address {
     String number;
     String street;
     String city;
     String country;

    public Address(String cNumber, String cStreet, String cCity, String cCountry) {
        this.number = cNumber;
        this.street = cStreet;
        this.city = cCity;
        this.country = cCountry;
    }
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}
    public String getStreet() {return street;}
    public void setStreet(String street) {this.street = street;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}
}