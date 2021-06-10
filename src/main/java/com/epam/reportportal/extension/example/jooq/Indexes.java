/*
 * This file is generated by jOOQ.
 */
package com.epam.reportportal.extension.example.jooq;


import com.epam.reportportal.extension.example.jooq.tables.JEntity;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>example</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ENTITY_PKEY = Indexes0.ENTITY_PKEY;
    public static final Index ENTITY_PROJECT_ID = Indexes0.ENTITY_PROJECT_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ENTITY_PKEY = Internal.createIndex("entity_pkey", JEntity.ENTITY, new OrderField[] { JEntity.ENTITY.ID }, true);
        public static Index ENTITY_PROJECT_ID = Internal.createIndex("entity_project_id", JEntity.ENTITY, new OrderField[] { JEntity.ENTITY.PROJECT_ID }, false);
    }
}