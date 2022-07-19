import java.sql.Date;

public class User {

    public static void main(String[] args) {}

    Date birthday;
    int size;
    Photo photos;
    Address address;

    public User(Date cBirthday, int sSize, Photo cPhotos, Address cAddress)  {
        this.birthday = cBirthday;
        this.size = sSize;
        this.photos = cPhotos;
        this.address = cAddress;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Photo getPhotos() {
        return photos;
    }

    public void setPhotos(Photo photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
