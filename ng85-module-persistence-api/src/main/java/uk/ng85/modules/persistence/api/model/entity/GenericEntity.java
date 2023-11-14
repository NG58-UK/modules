package uk.ng85.modules.persistence.api.model.entity;

import java.io.Serializable;

public interface GenericEntity<I> extends Serializable {

    I getId();

}