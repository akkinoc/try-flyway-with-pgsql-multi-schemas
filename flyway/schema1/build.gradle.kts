plugins {
    kotlin("jvm") version "1.9.25"
    id("org.flywaydb.flyway") version "10.20.1"
    id("org.jooq.jooq-codegen-gradle") version "3.19.21"
}

buildscript {
    dependencies {
        classpath("org.flywaydb:flyway-database-postgresql:10.20.1")
    }
}

dependencies {
    compileOnly("org.postgresql:postgresql:42.7.5")
    jooqCodegen("org.postgresql:postgresql:42.7.5")
}

flyway {
    url = "jdbc:postgresql://localhost:15432/akkinoc-db"
    user = "akkinoc"
    password = "akkinoc-pw"
    defaultSchema = "schema1"
    cleanDisabled = false
}

jooq {
    configuration {
        jdbc {
            url = "jdbc:postgresql://localhost:15432/akkinoc-db"
            user = "akkinoc"
            password = "akkinoc-pw"
        }
        generator {
            name = "org.jooq.codegen.KotlinGenerator"
            database {
                name = "org.jooq.meta.postgres.PostgresDatabase"
                inputSchema = "schema1"
                includes = ".*"
                excludes = "flyway_schema_history"
            }
            target {
                packageName = "dev.akkinoc.try_flyway_with_postgres_multi_schemas.schema1"
                directory = "src/main/kotlin"
            }
        }
    }
}
