package uk.ng85.modules.persistence.jpa.model.entity;

import java.io.Serializable;

public interface GenericEntity<I> extends Serializable {

    I getIdentifier();

}