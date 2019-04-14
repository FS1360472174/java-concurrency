package com.fs.jackson;

import java.beans.ConstructorProperties;

/**
 * @author cnstonefang@gmail.com
 */
public class AddressByBuilder {
    private Long id;
    private String address;

    public AddressByBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public AddressByBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public static class AddressBuilder {
        private Long id;
        private String address;

        public String toString() {
            return "Address.AddressBuilder(id=" + this.id + ", address=" + this.address + ")";
        }

        public AddressByBuilder build() {
            return new AddressByBuilder(this.id, this.address);
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

    @ConstructorProperties({ "id", "address" })
    AddressByBuilder(Long id, String address) {
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
