package uk.ng85.modules.persistence.jpa.model.query;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class QueryJoinFields {

    private List<Definition> definitions;

    public QueryJoinFields add(Definition definition) {
        if (definitions == null) {
            definitions = new ArrayList<>();
        }
        definitions.add(definition);
        return this;
    }

    @AllArgsConstructor
    @Builder
    @Getter
    @Setter
    @ToString
    public static class Definition {

        private String field;
        private JoinType joinType;

        public Definition(String field) {
            this.field = field;
            this.joinType = JoinType.LEFT;
        }

        public enum JoinType {

            INNER,

            LEFT,

            RIGHT

        }

    }

}