/*
 * This file is generated by jOOQ.
 */
package dev.akkinoc.try_flyway_with_postgres_multi_schemas.schema1.tables.records


import dev.akkinoc.try_flyway_with_postgres_multi_schemas.schema1.tables.Schema1Table2

import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Schema1Table2Record() : TableRecordImpl<Schema1Table2Record>(Schema1Table2.SCHEMA1_TABLE2) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    /**
     * Create a detached, initialised Schema1Table2Record
     */
    constructor(id: Int? = null): this() {
        this.id = id
        resetChangedOnNotNull()
    }
}
