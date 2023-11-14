package uk.ng85.modules.persistence.api.model.query;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class QueryResultPagination {

    public static final Integer DEFAULT_START = 0;

    public static final Integer DEFAULT_LIMIT = 50;

    public static final Integer LIMIT_100 = 100;

    public static final Integer LIMIT_500 = 500;

    /**
     * Configure Pagination instance to select first 50 entries.
     */
    public static final QueryResultPagination DEFAULT = QueryResultPagination.builder()
            .start(DEFAULT_START)
            .limit(DEFAULT_LIMIT)
            .build();

    private Integer start;

    private Integer limit;

}
