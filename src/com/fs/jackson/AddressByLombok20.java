package com.fs.jackson;

/**
 * @author cnstonefang@gmail.com
 */
public class AddressByLombok20 {

    private Long id;
    private String address;

    public AddressByLombok20 setId(Long id) {
        this.id = id;
        return this;
    }

    public AddressByLombok20 setAddress(String address) {
        this.address = address;
        return this;
    }

    public static class AddressBuilder {
        private Long id;
        private String address;

        public String toString() {
            return "Address.AddressBuilder(id=" + this.id + ", address=" + this.address + ")";
        }

        public AddressByLombok20 build() {
            return new AddressByLombok20(this.id, this.address);
        }

        public AddressBuilder address(String address) {
            this.address = address;
            return this;
        }

        public AddressBuilder id(Long id) {
            this.id = id;
            return this;
        }
    }

    AddressByLombok20(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getAddress() {
        return this.address;
    }
}
