/*
 * This file is generated by jOOQ.
 */
package dev.akkinoc.try_flyway_with_postgres_multi_schemas.schema2.tables.records


import dev.akkinoc.try_flyway_with_postgres_multi_schemas.schema2.tables.Schema2Table1

import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Schema2Table1Record() : TableRecordImpl<Schema2Table1Record>(Schema2Table1.SCHEMA2_TABLE1) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    /**
     * Create a detached, initialised Schema2Table1Record
     */
    constructor(id: Int? = null): this() {
        this.id = id
        resetChangedOnNotNull()
    }
}
