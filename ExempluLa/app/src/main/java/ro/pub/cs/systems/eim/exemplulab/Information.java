package ro.pub.cs.systems.eim.exemplulab;

public class Information {
    String country;
    String continent;
    Double longitude;
    Double latitude;
    String countryCode;
    private static final String urlStart = "https://www.countryflags.io/";
    private static final String urlEnd = "/flat/64.png";

    public Information() {
        this.country = null;
        this.continent = null;
        this.longitude = null;
        this.latitude = null;
        this.countryCode = null;
    }

    public Information(String country, String continent, String countryCode, Double longitude, Double latitude) {
        this.country = country;
        this.continent = continent;
        this.longitude = longitude;
        this.latitude = latitude;
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getImageUrl() {
        return urlStart + countryCode + urlEnd;
    }

    @Override
    public String toString() {
        return country + ", " + continent + ", " + countryCode + ", " + latitude.toString() +
                ", " + longitude.toString() + ", " + urlStart + countryCode + urlEnd;
    }
}
