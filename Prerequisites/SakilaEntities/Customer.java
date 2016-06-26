package microtest.domain.model;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Column(name = "first_name", table = "customer", nullable = false, length = 45)
    @Basic
    private String firstName;

    @Column(name = "last_name", table = "customer", nullable = false, length = 45)
    @Basic
    private String lastName;

    @OneToMany(targetEntity = Rental.class, mappedBy = "customerId")
    private List<Rental> rentalCollection;

    @Column(name = "last_update", table = "customer", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date lastUpdate;

    @Column(name = "customer_id", table = "customer", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    @Column(name = "active", table = "customer", nullable = false)
    @Basic
    private boolean active;

    @ManyToOne(optional = false, targetEntity = Store.class)
    @JoinColumn(name = "store_id")
    private Store storeId;

    @OneToMany(targetEntity = Payment.class, mappedBy = "customerId")
    private List<Payment> paymentCollection;

    @Column(name = "email", table = "customer", length = 50)
    @Basic
    private String email;

    @Column(name = "create_date", table = "customer", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date createDate;

    @ManyToOne(optional = false, targetEntity = Address.class)
    @JoinColumn(name = "address_id")
    private Address addressId;

    public Customer() {

    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Rental> getRentalCollection() {
        return this.rentalCollection;
    }

    public void setRentalCollection(List<Rental> rentalCollection) {
        this.rentalCollection = rentalCollection;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Store getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Store storeId) {
        this.storeId = storeId;
    }

    public List<Payment> getPaymentCollection() {
        return this.paymentCollection;
    }

    public void setPaymentCollection(List<Payment> paymentCollection) {
        this.paymentCollection = paymentCollection;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Address getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }
}
