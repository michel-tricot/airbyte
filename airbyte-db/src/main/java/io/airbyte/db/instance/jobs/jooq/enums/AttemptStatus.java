/*
 * This file is generated by jOOQ.
 */
package io.airbyte.db.instance.jobs.jooq.enums;


import io.airbyte.db.instance.jobs.jooq.Public;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum AttemptStatus implements EnumType {

    running("running"),

    failed("failed"),

    succeeded("succeeded");

    private final String literal;

    private AttemptStatus(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "attempt_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
