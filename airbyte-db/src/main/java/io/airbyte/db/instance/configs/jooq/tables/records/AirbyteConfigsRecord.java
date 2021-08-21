/*
 * This file is generated by jOOQ.
 */
package io.airbyte.db.instance.configs.jooq.tables.records;


import io.airbyte.db.instance.configs.jooq.tables.AirbyteConfigs;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbyteConfigsRecord extends UpdatableRecordImpl<AirbyteConfigsRecord> implements Record6<Long, String, String, JSONB, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1108259413;

    /**
     * Setter for <code>public.airbyte_configs.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.airbyte_configs.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.airbyte_configs.config_id</code>.
     */
    public void setConfigId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.airbyte_configs.config_id</code>.
     */
    public String getConfigId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.airbyte_configs.config_type</code>.
     */
    public void setConfigType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.airbyte_configs.config_type</code>.
     */
    public String getConfigType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.airbyte_configs.config_blob</code>.
     */
    public void setConfigBlob(JSONB value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.airbyte_configs.config_blob</code>.
     */
    public JSONB getConfigBlob() {
        return (JSONB) get(3);
    }

    /**
     * Setter for <code>public.airbyte_configs.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.airbyte_configs.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for <code>public.airbyte_configs.updated_at</code>.
     */
    public void setUpdatedAt(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.airbyte_configs.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, JSONB, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, JSONB, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AirbyteConfigs.AIRBYTE_CONFIGS.ID;
    }

    @Override
    public Field<String> field2() {
        return AirbyteConfigs.AIRBYTE_CONFIGS.CONFIG_ID;
    }

    @Override
    public Field<String> field3() {
        return AirbyteConfigs.AIRBYTE_CONFIGS.CONFIG_TYPE;
    }

    @Override
    public Field<JSONB> field4() {
        return AirbyteConfigs.AIRBYTE_CONFIGS.CONFIG_BLOB;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return AirbyteConfigs.AIRBYTE_CONFIGS.CREATED_AT;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return AirbyteConfigs.AIRBYTE_CONFIGS.UPDATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getConfigId();
    }

    @Override
    public String component3() {
        return getConfigType();
    }

    @Override
    public JSONB component4() {
        return getConfigBlob();
    }

    @Override
    public OffsetDateTime component5() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime component6() {
        return getUpdatedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getConfigId();
    }

    @Override
    public String value3() {
        return getConfigType();
    }

    @Override
    public JSONB value4() {
        return getConfigBlob();
    }

    @Override
    public OffsetDateTime value5() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime value6() {
        return getUpdatedAt();
    }

    @Override
    public AirbyteConfigsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AirbyteConfigsRecord value2(String value) {
        setConfigId(value);
        return this;
    }

    @Override
    public AirbyteConfigsRecord value3(String value) {
        setConfigType(value);
        return this;
    }

    @Override
    public AirbyteConfigsRecord value4(JSONB value) {
        setConfigBlob(value);
        return this;
    }

    @Override
    public AirbyteConfigsRecord value5(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public AirbyteConfigsRecord value6(OffsetDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public AirbyteConfigsRecord values(Long value1, String value2, String value3, JSONB value4, OffsetDateTime value5, OffsetDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AirbyteConfigsRecord
     */
    public AirbyteConfigsRecord() {
        super(AirbyteConfigs.AIRBYTE_CONFIGS);
    }

    /**
     * Create a detached, initialised AirbyteConfigsRecord
     */
    public AirbyteConfigsRecord(Long id, String configId, String configType, JSONB configBlob, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        super(AirbyteConfigs.AIRBYTE_CONFIGS);

        set(0, id);
        set(1, configId);
        set(2, configType);
        set(3, configBlob);
        set(4, createdAt);
        set(5, updatedAt);
    }
}
