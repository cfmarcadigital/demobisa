package com.bisa.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Author {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String names;
        private String paternalSurname;
        private String maternalSurname;
        private String email;
        private Date birthday;
        private String country;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNames() {
                return names;
        }

        public void setNames(String names) {
                this.names = names;
        }

        public String getPaternalSurname() {
                return paternalSurname;
        }

        public void setPaternalSurname(String paternalSurname) {
                this.paternalSurname = paternalSurname;
        }

        public String getMaternalSurname() {
                return maternalSurname;
        }

        public void setMaternalSurname(String maternalSurname) {
                this.maternalSurname = maternalSurname;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public Date getBirthday() {
                return birthday;
        }

        public void setBirthday(Date birthday) {
                this.birthday = birthday;
        }

        public String getCountry() {
                return country;
        }

        public void setCountry(String country) {
                this.country = country;
        }

        @Override
        public String toString() {
                return "Author{" +
                        "id=" + id +
                        ", names='" + names + '\'' +
                        ", paternalSurname='" + paternalSurname + '\'' +
                        ", maternalSurname='" + maternalSurname + '\'' +
                        ", email='" + email + '\'' +
                        ", birthday=" + birthday +
                        ", country='" + country + '\'' +
                        '}';
        }
}
