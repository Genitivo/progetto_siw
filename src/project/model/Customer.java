package project.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"firstName","lastName"}))
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    private String password;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Address address;

    @OneToMany(mappedBy = "customer_id")
    private List<Order> orders;

    public Customer(){
    }

    public Customer(String firstName, String lastName, String phoneNumber, String email, String password, Date dateOfBirth, Date registrationDate, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.registrationDate = registrationDate;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.password = password;
    }

    public Long getId() {return this.id;}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getEmail() {return email;}

    public String getPhoneNumber() {return phoneNumber;}

    public Date getDateOfBirth() {return dateOfBirth;}

    public Date getRegistrationDate() {return registrationDate;}

    public Address getAddress() {return address;}

    public List<Order> getOrders() {return orders;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setEmail(String email) {this.email = email;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public void setDateOfBirth(Date dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public void setRegistrationDate(Date registrationDate) {this.registrationDate = registrationDate;}

    public void setAddress_id(Address address) {this.address = address;}

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Customer");
        sb.append("{id=").append(id);
        sb.append(", firstName='").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", email=").append(email);
        sb.append(", phoneNumber='").append(phoneNumber);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", address=").append(address);
        sb.append("}\n");
        return sb.toString();
    }

}