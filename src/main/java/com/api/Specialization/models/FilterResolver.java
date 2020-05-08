package com.api.Specialization.models;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class FilterResolver {
    private List<FilterEntry> filterEntryList;
    private Query query;

    public FilterResolver(List<FilterEntry> filterEntryList) {
        this.filterEntryList = filterEntryList;
        this.query = new Query();
    }

    public Query toQuery() {
        //query = new Query();
        for (FilterEntry filterEntry : filterEntryList) {
            if (filterEntry.getField().equals("name")) {
                if (filterEntry.getValue().contains(" ")) {
                    String[] names = filterEntry.getValue().split("\\W+");
                    query.addCriteria(new Criteria().orOperator(
                            new Criteria().andOperator(
                                    Criteria.where("firstName").regex(names[1], "i"),
                                    Criteria.where("lastName").regex(names[0], "i")),
                            new Criteria().andOperator(
                                    Criteria.where("firstName").regex(names[0], "i"),
                                    Criteria.where("lastName").regex(names[1], "i"))
                            )
                    );
                } else {
                    query.addCriteria(new Criteria().orOperator(
                            Criteria.where("firstName").regex(filterEntry.getValue(), "i"),
                            Criteria.where("lastName").regex(filterEntry.getValue(), "i"))
                    );
                }
            } else {
                if (filterEntry.getOperator().equals("=")) {
                    query.addCriteria(Criteria.where(filterEntry.getField()).is(filterEntry.getValue()));
                }
                if (filterEntry.getOperator().equals("<")) {
                    query.addCriteria(Criteria.where(filterEntry.getField()).lt(filterEntry.getValue()));
                }
                if (filterEntry.getOperator().equals(">")) {
                    query.addCriteria(Criteria.where(filterEntry.getField()).gt(filterEntry.getValue()));
                }
            }
        }
        return query;
    }
}
