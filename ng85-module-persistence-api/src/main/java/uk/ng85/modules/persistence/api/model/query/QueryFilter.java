package uk.ng85.modules.persistence.api.model.query;

import lombok.*;

import java.util.List;

/**
 * @author Nebojsa Gajic
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class QueryFilter {

    /**
     *
     */
    private String field;

    /**
     * @see Operation
     */
    private Operation operation;

    /**
     *
     */
    private List<Object> values;

    /**
     *
     */
    public enum Operation {

        /**
         * Equal To
         */
        EQ,

        /**
         * Not Equal To
         */
        NE,

        /**
         * Greater Than Or Equal To
         */
        GE,

        /**
         * Greater Than
         */
        GT,

        /**
         * Less Than Or Equal To
         */
        LE,

        /**
         * Less Than
         */
        LT

    }

}