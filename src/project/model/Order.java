package project.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationTime;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "orders_id")
    @OrderBy("creationTime asc")
    private List<OrderLine> orderLines;

    @ManyToOne
    private Customer customer_id;

    public Order() {
    }

    public Order(Date creationTime, Customer customer_id, List<OrderLine> orderLines) {
        this.creationTime = creationTime;
        this.customer_id = customer_id;
        this.orderLines = orderLines;
    }

    public void setCreationTime(Date creationTime) {this.creationTime = creationTime;}

    public void setCustomer_id(Customer customer_id) {this.customer_id = customer_id;}

    public Date getCreationTime() {return creationTime;}

    public Long getId() {return id;}

    public Customer getCustomer_id() {return customer_id;}

    public List<OrderLine> getOrderLines() {return orderLines;}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Order");
        sb.append("{id=").append(id);
        sb.append(", creationTime='").append(creationTime);
        sb.append(", customer_id='").append(customer_id);
        sb.append("}\n");
        return sb.toString();
    }

    public void setOrderLine(List<OrderLine> lol) {
        this.orderLines = lol;
    }
}