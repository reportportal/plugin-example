/*
 * This file is generated by jOOQ.
 */
package com.epam.reportportal.extension.example.jooq.tables;


import com.epam.reportportal.extension.example.jooq.Indexes;
import com.epam.reportportal.extension.example.jooq.JExample;
import com.epam.reportportal.extension.example.jooq.Keys;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JEntity extends TableImpl<Record> {

    private static final long serialVersionUID = 816192884;

    /**
     * The reference instance of <code>example.entity</code>
     */
    public static final JEntity ENTITY = new JEntity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>example.entity.id</code>.
     */
    public final TableField<Record, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('example.entity_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>example.entity.name</code>.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>example.entity.description</code>.
     */
    public final TableField<Record, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>example.entity.project_id</code>.
     */
    public final TableField<Record, Long> PROJECT_ID = createField(DSL.name("project_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>example.entity</code> table reference
     */
    public JEntity() {
        this(DSL.name("entity"), null);
    }

    /**
     * Create an aliased <code>example.entity</code> table reference
     */
    public JEntity(String alias) {
        this(DSL.name(alias), ENTITY);
    }

    /**
     * Create an aliased <code>example.entity</code> table reference
     */
    public JEntity(Name alias) {
        this(alias, ENTITY);
    }

    private JEntity(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private JEntity(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JEntity(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ENTITY);
    }

    @Override
    public Schema getSchema() {
        return JExample.EXAMPLE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ENTITY_PKEY, Indexes.ENTITY_PROJECT_ID);
    }

    @Override
    public Identity<Record, Long> getIdentity() {
        return Keys.IDENTITY_ENTITY;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.ENTITY_PKEY;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.ENTITY_PKEY);
    }

    @Override
    public JEntity as(String alias) {
        return new JEntity(DSL.name(alias), this);
    }

    @Override
    public JEntity as(Name alias) {
        return new JEntity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JEntity rename(String name) {
        return new JEntity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JEntity rename(Name name) {
        return new JEntity(name, null);
    }
}
