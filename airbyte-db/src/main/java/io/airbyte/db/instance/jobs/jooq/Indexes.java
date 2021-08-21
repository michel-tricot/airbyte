/*
 * This file is generated by jOOQ.
 */
package io.airbyte.db.instance.jobs.jooq;


import io.airbyte.db.instance.jobs.jooq.tables.Attempts;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index JOB_ATTEMPT_IDX = Indexes0.JOB_ATTEMPT_IDX;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index JOB_ATTEMPT_IDX = Internal.createIndex("job_attempt_idx", Attempts.ATTEMPTS, new OrderField[] { Attempts.ATTEMPTS.JOB_ID, Attempts.ATTEMPTS.ATTEMPT_NUMBER }, true);
    }
}
