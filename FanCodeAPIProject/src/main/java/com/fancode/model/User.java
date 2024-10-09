package com.fancode.model;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;

    public static class Address {
        private Geo geo;

        public static class Geo {
            private String lat;
            private String lng;

            // Getters and setters
            public String getLat() { return lat; }
            public void setLat(String lat) { this.lat = lat; }
            public String getLng() { return lng; }
            public void setLng(String lng) { this.lng = lng; }
        }

        // Getters and setters
        public Geo getGeo() { return geo; }
        public void setGeo(Geo geo) { this.geo = geo; }
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
