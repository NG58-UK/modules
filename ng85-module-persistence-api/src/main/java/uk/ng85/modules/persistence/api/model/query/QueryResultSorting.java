package uk.ng85.modules.persistence.api.model.query;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class QueryResultSorting {

    /**
     *
     */
    private Direction direction;
    /**
     *
     */
    private String by;

    /**
     *
     */
    public enum Direction {

        /**
         *
         */
        ASCENDING,

        /**
         *
         */
        DESCENDING

    }

}