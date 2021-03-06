package org.meri.jpa.relationships.entities.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class PrimaryOneToOneOwner {

  @Id
  private long id;
  @OneToOne
  @PrimaryKeyJoinColumn
  private PrimaryOneToOneInverse inverse;

  public PrimaryOneToOneOwner() {
  }

  public PrimaryOneToOneOwner(int id) {
    this();
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public PrimaryOneToOneInverse getInverse() {
    return inverse;
  }

  public void setInverse(PrimaryOneToOneInverse inverse) {
    this.inverse = inverse;
  }

}
