package microtest.domain.model;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "payment")
public class Payment implements Serializable {

    @Column(name = "amount", table = "payment", nullable = false, scale = 2, precision = 5)
    @Basic
    private BigDecimal amount;

    @Column(name = "payment_id", table = "payment", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    @Column(name = "last_update", table = "payment", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date lastUpdate;

    @ManyToOne(optional = false, targetEntity = Customer.class)
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @Column(name = "payment_date", table = "payment", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date paymentDate;

    @ManyToOne(optional = false, targetEntity = Staff.class)
    @JoinColumn(name = "staff_id")
    private Staff staffId;

    @ManyToOne(targetEntity = Rental.class)
    @JoinColumn(name = "rental_id")
    private Rental rentalId;

    public Payment() {

    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Customer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Date getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Staff getStaffId() {
        return this.staffId;
    }

    public void setStaffId(Staff staffId) {
        this.staffId = staffId;
    }

    public Rental getRentalId() {
        return this.rentalId;
    }

    public void setRentalId(Rental rentalId) {
        this.rentalId = rentalId;
    }

    @Override
    public String toString() {
        return "Payment(paymentId=" + this.paymentId + ", amount=" + this.amount + ")";
    }
}
